package fr.eni.ProjetEncheres.dal;

public class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDaoJdbcImpl();
	}
	
	
	//permet de faire daofactory.getArticleDAO(); 
	
	public static ArticleDAO getArticleDAO() {
		return new ArticleDaoJdbcImpl();
	}
	
	public static CategorieDAO getCategorieDAO() {
		return new CategorieDaoJdbcImpl();
	}
	
	
}
