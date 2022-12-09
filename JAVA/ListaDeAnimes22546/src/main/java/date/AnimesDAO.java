
package date;

import static date.ConexionBD.close;
import static date.ConexionBD.getConexion;
import dominio.Anime;
import java.sql.*;
import java.util.*;

//en el DAO haremos la los respectivo metodos del CRUD (CREATE,READ,UPDATE,DELETE)
public class AnimesDAO {
    private static final String SQL_SELECT = "SELECT * FROM animelist";
    private static final String SQL_SELECT_BY_ID = "SELECT IdAnime, Nombre, Autor, Capitulos, Finalizado FROM animelist WHERE IdAnime = ?";
    
    private static final String SQL_INSERT = "INSERT INTO animelist(Nombre,Autor,Capitulos,Finalizado) VALUES (?,?,?,?)";
    
    private static final String SQL_UPDATE = "UPDATE animelist SET Nombre=? ,Autor=? ,Capitulos=? ,Finalizado=?, WHERE IdAnime=?";
    
    private static final String SQL_DELETE = "DELETE FROM animelist WHERE IdAnime=?";
    
    
    public List<Anime> mostrar(){
        Connection conexion = null;
        PreparedStatement sentencia = null;
        ResultSet resultado= null;
        Anime anime = null;
        List<Anime> animes = new ArrayList();
        
        try {
            conexion = getConexion();
            sentencia = conexion.prepareStatement(SQL_SELECT);
            resultado = sentencia.executeQuery();
            
            while(resultado.next()){
                int idanime = resultado.getInt(1);
                String nombre = resultado.getString("Nombre");
                String autor = resultado.getString("Autor");
                int capitulos = resultado.getInt("Capitulos");
                int finalizado = resultado.getInt("Finalizado");
                
                anime = new Anime (idanime,nombre,autor,capitulos,finalizado);
                
                animes.add(anime);
            }
            
        } catch (SQLException e) {
            e.printStackTrace(System.out);
        } finally{
            try {
                close(resultado);
                close(sentencia);
                close(conexion);
            } catch (SQLException e) {
                e.printStackTrace(System.out);
            }
        }
        return animes;
    }
    
//    public int insertar (Anime anime){
//        Connection conexion = null;
//        PreparedStatement sentencia = null;
//        
//        int registros = 0;
//        
//        try {
//            conexion = ConexionBD.getConexion();
//            sentencia = conexion.prepareStatement(SQL_INSERT);
//            sentencia.setString(1,anime.getNombre());
//            sentencia.setString(2,anime.getAutor());
//            sentencia.setInt(3,anime.getCapitulos());
//            sentencia.setInt(4,anime.getFinalizado());
//            
//            registros = sentencia.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        } finally{
//            try {
//                 ConexionBD.cerrar(sentencia);
//                 ConexionBD.cerrar(conexion);
//            } catch (SQLException e) {
//                e.printStackTrace(System.out); 
//            }  
//        }
//        return registros;
//    }
//     
//   public int actualizar(Anime anime){
//       Connection conexion = null;
//       PreparedStatement sentencia = null;
//        
//        int registros = 0;
//        
//        try {
//            conexion = ConexionBD.getConexion();
//            sentencia = conexion.prepareStatement(SQL_UPDATE);
//            sentencia.setString(1,anime.getNombre());
//            sentencia.setString(2,anime.getAutor());
//            sentencia.setInt(3,anime.getCapitulos());
//            sentencia.setInt(4,anime.getFinalizado());
//            sentencia.setInt(5, anime.getIdAnime());
//            
//            registros = sentencia.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        } finally{
//            try {
//                 ConexionBD.cerrar(sentencia);
//                 ConexionBD.cerrar(conexion);
//            } catch (SQLException e) {
//                e.printStackTrace(System.out); 
//            }  
//        }
//        return registros;
//       
//   }
//   public int eliminar(Anime anime){
//       
//       Connection conexion = null;
//        PreparedStatement sentencia = null;
//        
//        int registros = 0;
//        
//        try {
//            conexion = ConexionBD.getConexion();
//            sentencia = conexion.prepareStatement(SQL_DELETE);
//            sentencia.setInt(1,anime.getIdAnime()); 
//            registros = sentencia.executeUpdate();
//            
//        } catch (SQLException e) {
//            e.printStackTrace(System.out);
//        } finally{
//            try {
//                 ConexionBD.cerrar(sentencia);
//                 ConexionBD.cerrar(conexion);
//            } catch (SQLException e) {
//                e.printStackTrace(System.out); 
//            }  
//        }
//        return registros;
//       
//   }
}
