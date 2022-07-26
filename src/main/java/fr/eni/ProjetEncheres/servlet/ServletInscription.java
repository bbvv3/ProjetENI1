package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.bll.UtilisateurManager;

/**
 * Servlet implementation class ServletInscription
 * @author Victor BOISSON
 */
public class ServletInscription extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 * Redirection vers la jsp Inscription.jsp
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url;
		HttpSession session = request.getSession();
			if(session.getAttribute("id")!=null) {
				url="/Accueil";
			}else {
				url="/WEB-INF/jsp/Inscription.jsp";	
			}
		RequestDispatcher rd = request.getRequestDispatcher(url);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * recupere des parametres d'inscription puis les envoie à la BLL
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, confirmation;
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
			
		//insertion et renvoi à l'acceuil si toutes les conditions sont validées sinon renvoi sur le formulaire avec les erreurs signalées
		try {
			UtilisateurManager.getInstance().insert(pseudo, nom, prenom, email, telephone, rue, code_postal, ville, mot_de_passe, confirmation);
			System.out.println("insertion validée");
			RequestDispatcher rd = request.getRequestDispatcher("/Connexion");
			rd.forward(request, response);
		} catch (Exception e) {
			erreur = e.getMessage();
			request.setAttribute("erreur", erreur);
			doGet(request,response);
		}
		
	}
}
