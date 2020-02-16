package eu.ensup.gestionEleveV2.presentation;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionEleveV2.dao.GestionDao;
import eu.ensup.gestionEleveV2.domaine.Etudiant;
import eu.ensup.gestionEleveV2.domaine.Personne;

/**
 * Servlet implementation class EtudiantServlet
 */
@WebServlet("/EtudiantServlet")
public class EtudiantServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EtudiantServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("servlet compte");
		int id = Integer.parseInt(request.getParameter("id"));
		System.out.println("id est : " + id);
		
		GestionDao gestionDao = new GestionDao();
		// ArrayList<Etudiant> reponse = gestionDao.lireInfoEtudiant(id);
		Etudiant reponse = new Etudiant();
		reponse = gestionDao.lireInfoEtudiant(id);
		
		if (reponse != null)
		{
			request.setAttribute("listeEtudiants", reponse);
			RequestDispatcher rs = request.getRequestDispatcher("etudiant.jsp");
			rs.forward(request, response);
			
		}
		else {
			RequestDispatcher rs = request.getRequestDispatcher("404.jsp");
			rs.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
