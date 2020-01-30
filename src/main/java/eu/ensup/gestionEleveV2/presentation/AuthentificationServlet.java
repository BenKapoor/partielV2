package eu.ensup.gestionEleveV2.presentation;

import java.io.Console;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionEleveV2.dao.GestionDao;
import eu.ensup.gestionEleveV2.dao.LoginDao;
import eu.ensup.gestionEleveV2.domaine.Personne;
import eu.ensup.gestionEleveV2.service.AuthentificationService;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 * Servlet implementation class AuthentificationServlet
 */
@WebServlet("/AuthentificationServlet")
public class AuthentificationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private static final Logger LOGGER = LoggerFactory.getLogger(AuthentificationServlet.class);
	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AuthentificationServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		AuthentificationServlet.LOGGER.debug("Appel à doGet()  pour charger la liste des etudiants.");
		String idEtudiant = request.getParameter("id");
		
		if (idEtudiant != null) {
			request.setAttribute("id", idEtudiant);
			request.setAttribute("listePersonne", new GestionDao().listerEtudiants());
			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		} else {
			
			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("oui");

		String nom = request.getParameter("nom");
		String mail = request.getParameter("mail");

		Personne personne = new Personne();

		List<Personne> personneList = new ArrayList<Personne>();

		LoginDao dao = new LoginDao();
		personneList = dao.login(mail, nom);

		if (!(personneList.isEmpty())) {
			request.setAttribute("id", personneList.get(0).getId());
			request.setAttribute("listePersonne", new GestionDao().listerEtudiants());
			RequestDispatcher rs = request.getRequestDispatcher("accueil.jsp");
			rs.forward(request, response);
		} else {
			
			RequestDispatcher rs = request.getRequestDispatcher("error.jsp");
			rs.include(request, response);
		}
	}
}