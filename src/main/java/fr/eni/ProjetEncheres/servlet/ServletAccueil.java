package fr.eni.ProjetEncheres.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import fr.eni.ProjetEncheres.bll.ArticleManager;
import fr.eni.ProjetEncheres.bll.CategorieManager;
import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;

/**
 * Servlet implementation class ServletAcceuil
 */

public class ServletAccueil extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List<Categorie> categories = CategorieManager.getInstance().selectAll();
		request.setAttribute("categories", categories);
		
		HttpSession session = request.getSession();
		String deconnexion = request.getParameter("logout");
		System.out.println(deconnexion);
		if(deconnexion != null && deconnexion.equals("1")){
			session.invalidate();
		}
		
		List<Article> articles = ArticleManager.getInstance().selectAll();
		request.setAttribute("articles", articles);
		System.out.println(articles);
		
		RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/jsp/index.jsp");
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
