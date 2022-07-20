package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.eni.ProjetEncheres.bll.UtilisateurManager;
import fr.eni.ProjetEncheres.bo.Utilisateur;


/**
 * Servlet implementation class ServletInscription
 */
@WebServlet("/ServletInscription")
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Redirection vers la jsp Inscription.jsp
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/Inscription.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe;
		Utilisateur user,user2 = null;
		String erreur = "";
		
		pseudo = request.getParameter("pseudo");
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		email = request.getParameter("mail");
		telephone = request.getParameter("tel");
		rue = request.getParameter("rue");
		code_postal = request.getParameter("codePostal");
		ville = request.getParameter("ville");
		mot_de_passe = request.getParameter("mdp");
		
		
		user = UtilisateurManager.getInstance().selectByPseudo(pseudo);
		user2 = UtilisateurManager.getInstance().selectByEmail(email);
		
		if(user != null) {
			erreur = "Ce pseudo existe déjà";
			request.setAttribute("erreur", erreur);
		}else if(user2 != null){
			erreur = "Cet email n'existe pas";
			request.setAttribute("erreur", erreur);
		}else {
			UtilisateurManager.getInstance().insert(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe);
			System.out.println("insertion validée");
		}
		doGet(request,response);
	}

}
