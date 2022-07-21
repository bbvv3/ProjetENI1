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
		
		String pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, confirmation;
		Boolean mdpValide = false;
		Boolean pseudoValide = false;
		Boolean emailValide = false;
		Utilisateur user,user2;
		String erreur = "";
		
		//recuperation des valeurs du formulaire
		pseudo = request.getParameter("pseudo");
		nom = request.getParameter("nom");
		prenom = request.getParameter("prenom");
		email = request.getParameter("mail");
		telephone = request.getParameter("tel");
		rue = request.getParameter("rue");
		code_postal = request.getParameter("codePostal");
		ville = request.getParameter("ville");
		mot_de_passe = request.getParameter("mdp");
		confirmation = request.getParameter("mdp2");
		
		//cherche de l'existence du pseudo et de l'email dans la BDD
		user = UtilisateurManager.getInstance().selectByPseudo(pseudo);
		user2 = UtilisateurManager.getInstance().selectByEmail(email);
		
		//test si le pseudo est valide
		if(user != null) {
			erreur = "Ce pseudo existe déjà";
		}else {
			pseudoValide = true;
		}
		
		//test si l'email est valide
		if(user2 != null){
			if(!erreur.equals("")) {
				erreur += " / ";
			}
			erreur += "Cet email existe déjà";
		}else {
			emailValide = true;
		}
		
		//test si les mot de passes sont identiques est valide
		if(!mot_de_passe.equals(confirmation)){
			if(!erreur.equals("")) {
				erreur += " / ";
			}
			erreur += "Les deux mots de passe ne sont pas identiques";
		}else{
			mdpValide = true;
		}
		
		//insertion et renvoi à l'acceuil si toutes les conditions sont validées sinon renvoi sur le formulaire avec les erreurs signalées
		if(pseudoValide && emailValide && mdpValide){
			UtilisateurManager.getInstance().insert(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe);
			System.out.println("insertion validée");
			RequestDispatcher rd = request.getRequestDispatcher("/Connexion");
			rd.forward(request, response);
		}else {
			request.setAttribute("erreur", erreur);
			doGet(request,response);
		}
		
	}

}
