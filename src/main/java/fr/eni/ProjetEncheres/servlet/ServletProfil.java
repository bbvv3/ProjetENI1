package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.bll.UtilisateurManager;
import fr.eni.ProjetEncheres.bo.Utilisateur;
import fr.eni.ProjetEncheres.dal.DAOFactory;

/**
 * Servlet implementation class ServletProfil
 */

public class ServletProfil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url = "/WEB-INF/jsp/Profil.jsp";
		Utilisateur utilisateur ;
		HttpSession session = request.getSession();//on crée une session
		String pseudo = (String)session.getAttribute("login");//on récupére le pseudo de l'utilisateur dans la session
		//si le pseudo est différent de null ,on selectionne son pseudo grâce a la methode selectBySpeudo et l'on accéde a la page Acceuil
		if(pseudo != null) {
		utilisateur = DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
	
		//attribut utilisateur envoyée dqns la JSP
		request.setAttribute("utilisateur", utilisateur);
		}
		else//si le pseudo est inexistant,on est renvoyé dans la servlet connexion
		{
		 url = "/Connexion";
		}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
