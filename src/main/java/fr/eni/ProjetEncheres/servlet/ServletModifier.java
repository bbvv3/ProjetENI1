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
		HttpSession session = request.getSession();//on ouvre le contenu de la session
		
		if(session.getAttribute("id")!=null) {
			int id = (int) session.getAttribute("id");
			utilisateur = DAOFactory.getUtilisateurDAO().selectById(id);
			//attribut utilisateur envoyée dans la JSP
			request.setAttribute("utilisateur", utilisateur);
			String suppression = request.getParameter("suppr");
			if(suppression != null && suppression.equals("1")) {
				UtilisateurManager.getInstance().delete(id);
				session.invalidate();
				url="/Accueil";
			}
		}
		else//si l'id est inexistant,on est renvoyé dans la servlet connexion
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
		String code_postal = request.getParameter("code_postal");
		String ville = request.getParameter("ville");
		String mot_de_passe = request.getParameter("mot_de_passe");
		String conf_mot_de_passe = request.getParameter("conf_mot_de_passe");
		
		HttpSession session = request.getSession();
		int no_utilisateur = (int) session.getAttribute("id");
		
		try {
			UtilisateurManager.getInstance().update(no_utilisateur,pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,conf_mot_de_passe);
			RequestDispatcher rd = request.getRequestDispatcher("/Profil");
			rd.forward(request, response);
		} catch (Exception e) {
			erreur = e.getMessage();
			e.printStackTrace();
			request.setAttribute("erreur", erreur);
			doGet(request, response);
		}
	}

}
