
package dominio;


public class Anime {
    private int IdAnime;
    private String Nombre;
    private String Autor;
    private int Capitulos;
    private int Finalizado;
    
    public Anime(){}

    public Anime(int IdAnime) {
        this.IdAnime = IdAnime;
    }

    public Anime(String Nombre, String Autor, int Capitulos, int Finalizado) {
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Capitulos = Capitulos;
        this.Finalizado = Finalizado;
    }

    public Anime(int IdAnime, String Nombre, String Autor, int Capitulos, int Finalizado) {
        this.IdAnime = IdAnime;
        this.Nombre = Nombre;
        this.Autor = Autor;
        this.Capitulos = Capitulos;
        this.Finalizado = Finalizado;
    }

    public int getIdAnime() {
        return IdAnime;
    }

    public void setIdAnime(int IdAnime) {
        this.IdAnime = IdAnime;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }
   
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public int getCapitulos() {
        return Capitulos;
    }

    public void setCapitulos(int Capitulos) {
        this.Capitulos = Capitulos;
    }

    public int getFinalizado() {
        return Finalizado;
    }

    public void setFinalizado(int Finalizado) {
        this.Finalizado = Finalizado;
    }

     @Override
    public String toString() {
        return "Anime{" + "IdAnime=" + IdAnime + ", Nombre=" + Nombre + ", Autor=" + Autor + ", Capitulos=" + Capitulos + ", Finalizado=" + Finalizado + "}";
    }
    
    
}
