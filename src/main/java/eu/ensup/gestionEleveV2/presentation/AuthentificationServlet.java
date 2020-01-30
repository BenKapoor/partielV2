package eu.ensup.gestionEleveV2.presentation;

import java.io.Console;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionEleveV2.service.AuthentificationService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
	public static final String VUE = "/accueil.jsp";
    public static final String VUE2 = "/error.jsp";
	
    public void doGet( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
        /* Affichage de la page d'inscription */
    	this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
    }
    

public void doPost( HttpServletRequest request, HttpServletResponse response ) throws ServletException, IOException{
    
        String mail = request.getParameter("mail");
        String nom = request.getParameter("nom");
        AuthentificationService service = new AuthentificationService();
        boolean co = false;
        co = service.connection(mail,nom);
        if(co == false)
        {
              this.getServletContext().getRequestDispatcher( VUE2 ).forward( request, response );
        }
        if(co == true)
        {
              this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
        }
    }
}