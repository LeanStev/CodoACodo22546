
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
        req.getRequestDispatcher("animes.jsp").forward(req, res);
    }
}


