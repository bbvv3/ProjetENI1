package fr.eni.ProjetEncheres.bll;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.dal.DAOFactory;

public class ArticleManager {
	
		//singleton
		private static ArticleManager instance;

		private ArticleManager() {}
		
		public static ArticleManager getInstance() {
			if(instance==null) {
				instance = new ArticleManager();
			}
			return instance;
		}
		
		public List<Article> selectBymotcle(String mot_cle){
			return DAOFactory.getArticleDAO().selectByMotCle(mot_cle); 
		}
		
		public List<Article> selectByCategorie(int identifiant){
			return DAOFactory.getArticleDAO().selectByCategorie(identifiant);
		}
		
		
}
