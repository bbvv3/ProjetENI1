package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.bll.CategorieManager;
import fr.eni.ProjetEncheres.bo.Categorie;
import fr.eni.ProjetEncheres.bo.Utilisateur;
import fr.eni.ProjetEncheres.dal.DAOFactory;

public class ServletNouvelleVente extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Categorie> categories = CategorieManager.getInstance().selectAll();
		request.setAttribute("categories", categories);
		
		String url = "/WEB-INF/jsp/nouvelleVente.jsp";
		Utilisateur utilisateur ;
		HttpSession session = request.getSession();
		if(session.getAttribute("id")!=null) {
			int id = (int) session.getAttribute("id");
			utilisateur = DAOFactory.getUtilisateurDAO().selectById(id);
			request.setAttribute("utilisateur", utilisateur);
		}
		else
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
