
package controller;

import date.AnimesDAO;
import dominio.Anime;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet ("/servletControlador") 
public class ServletControlador extends HttpServlet{
    
    @Override
    protected void doGet(HttpServletRequest req,HttpServletResponse res) throws ServletException, IOException{
        List<Anime> animes = new AnimesDAO().mostrar();
        animes.forEach(System.out::println);
        
        req.setAttribute("animes", animes);
        req.setAttribute("totalAnimes", animes.size());
        req.setAttribute("totalCap", totalCap(animes));
        req.getRequestDispatcher("animes.jsp").forward(req, res);
    }
    
    @Override
    protected void doPost(HttpServletRequest req,HttpServletResponse res) 
            throws ServletException, IOException{
        String accionJava = req.getParameter("accion");
        
        if(accionJava != null){
            switch (accionJava){
                case "insertar":
                    insertarAnime(req,res);
                    break;
                default:
                    accionDefault(req,res);
                    break;
            }
        }else{
            accionDefault(req,res);
        }
    }
    
    
    private Integer totalCap(List<Anime> animeList){
        Integer cantidad = 0;
        
        for (int i = 0; i < animeList.size(); i++) {
            cantidad += animeList.get(i).getCapitulos();
        }
        return cantidad;
    }
    
    private void accionDefault(HttpServletRequest req,HttpServletResponse res) 
            throws ServletException, IOException{
        List<Anime> animes = new AnimesDAO().mostrar();
        animes.forEach(System.out::println);
        
        req.setAttribute("animes", animes);
        req.setAttribute("totalAnimes", animes.size());
        req.setAttribute("totalCap", totalCap(animes));
        req.getRequestDispatcher("animes.jsp").forward(req, res);
        
    }
    
    private void insertarAnime (HttpServletRequest req,HttpServletResponse res) 
            throws ServletException, IOException{
        String nombre = req.getParameter("nombre");
        String autor = req.getParameter("autor");
        int capitulos=0;
        int finalizado=0;
        String capitulosString = req.getParameter("capitulos");
        if(capitulosString != null && !capitulosString.equals("")){
             capitulos = Integer.parseInt(capitulosString);
        }
        //VALIDACIONES PARA EVITAR UNA EXCEPCION
        String finalizadoString = req.getParameter("finalizado");
        if(finalizadoString != null && !finalizadoString.equals("")){
             finalizado = Integer.parseInt(finalizadoString);
        }
        
        Anime anime = new Anime(nombre,autor,capitulos,finalizado);
        
        int regMod = new AnimesDAO().insertar(anime);
        
        System.out.println("Registros guardados: "+ regMod);
        
        accionDefault(req,res);
    }
}


