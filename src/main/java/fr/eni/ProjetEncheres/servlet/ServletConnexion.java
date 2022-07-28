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



public class ServletConnexion extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String url;
		
		HttpSession session = request.getSession();
			if(session.getAttribute("id")!=null) { 
				url="/Accueil";
			}else {
				url="/WEB-INF/jsp/Connexion.jsp";
				
			}
		
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pseudo;
		String mot_de_passe;
		Utilisateur utilisateur;
		
		
		pseudo = request.getParameter("pseudo");// parametre dans le name dans la JSP
		mot_de_passe = request.getParameter("mot_de_passe");
		
		
		try {	
			utilisateur = UtilisateurManager.getInstance().connexion(pseudo,mot_de_passe);
			HttpSession session = request.getSession();
			session.setAttribute("id", utilisateur.getNo_utilisateur());
		}catch (Exception e){
<<<<<<< HEAD
			
		request.setAttribute("erreur", e.getMessage());
=======
			erreur = e.getMessage();
			request.setAttribute("erreur", erreur);
>>>>>>> branch 'main' of https://github.com/bbvv3/ProjetENI1.git
		}
		doGet(request, response);
	}
	
	
}
