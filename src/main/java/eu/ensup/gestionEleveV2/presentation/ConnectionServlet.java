package eu.ensup.gestionEleveV2.presentation;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import eu.ensup.gestionEleveV2.domaine.Etudiant;
import eu.ensup.gestionEleveV2.service.AuthentificationService;

/**
 * Servlet implementation class ConnectionServlet
 */
@WebServlet("/ConnectionServlet")
public class ConnectionServlet extends HttpServlet {
	public static final String VUE = "/accueil.jsp";
    public static final String VUE2 = "/error.jsp";
	private static final long serialVersionUID = 1L;
	AuthentificationService serviceCo = new AuthentificationService();
	/**
	 * Default constructor.
	 */
	public ConnectionServlet() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		// response.getWriter().append("Served at:
		// ").append(request.getContextPath());
		RequestDispatcher dispatcher;
		String mail = request.getParameter("mail");
		String nom = request.getParameter("nom");
		System.out.println(mail);
		if ( serviceCo.connection(mail, nom) == true) {
			System.out.println("bienvenue");
			// response.sendRedirect("accueil.jsp");
			this.getServletContext().getRequestDispatcher( VUE ).forward( request, response );
		} else {
			System.out.println("wrong password or user name");
			// response.sendRedirect("error.jsp");
			this.getServletContext().getRequestDispatcher( VUE2 ).forward( request, response );
		}
		String listEtudiant = null;
		List<Etudiant> list = null;
		request.setAttribute(listEtudiant, list);
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doGet(request, response);
	}
}