package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.bll.UtilisateurManager;
import fr.eni.ProjetEncheres.bo.Utilisateur;
import fr.eni.ProjetEncheres.dal.DAOFactory;


public class ServletModifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/WEB-INF/jsp/Modifier.jsp";
		Utilisateur utilisateur ;
		HttpSession session = request.getSession();//on crée une session
		String pseudo = (String)session.getAttribute("id");//on récupére le pseudo de l'utilisateur dans la session
		
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
		String erreur="";
		
		String pseudo = request.getParameter("pseudo");
		String nom = request.getParameter("nom");
		String prenom = request.getParameter("prenom");
		String email = request.getParameter("email");
		String telephone = request.getParameter("telephone");
		String rue = request.getParameter("rue");
		String code_postal = request.getParameter("code_Postal");
		String ville = request.getParameter("ville");
		String mot_de_passe = request.getParameter("mot_de_passe");
		String conf_mot_de_passe = request.getParameter("conf_mot_de_passe");
		
		HttpSession session = request.getSession();
		int no_utilisateur = (int) session.getAttribute("id");
		
		try {
			UtilisateurManager.getInstance().update(no_utilisateur,pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,conf_mot_de_passe);
		} catch (Exception e) {
			
			erreur = e.getMessage();
			request.setAttribute("erreur", erreur);
		}
		
		if(erreur =="" ){
			RequestDispatcher rd = request.getRequestDispatcher("/Profil");
			rd.forward(request, response);
		}
		
	
		doGet(request, response);
	}

}
