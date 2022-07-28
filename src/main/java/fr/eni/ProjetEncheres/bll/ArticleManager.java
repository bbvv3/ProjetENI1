package fr.eni.ProjetEncheres.bll;

import java.util.Date;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;
import fr.eni.ProjetEncheres.bo.Utilisateur;
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
		/**
		 * Retourne la liste complète des articles du tableau portant le même nom
		 * @return
		 */
		public List<Article> selectAll(){
			return DAOFactory.getArticleDAO().selectAll();
		}
		
		public void insert(String nom_article,String description,int prix_initial,Date date_debut_encheres,Date date_fin_encheres,int no_vendeur,int no_categorie) {
			Utilisateur vendeur = DAOFactory.getUtilisateurDAO().selectById(no_vendeur);
			Categorie categorie = DAOFactory.getCategorieDAO().selectById(no_categorie);
			
			
			Article article = new Article(nom_article,description,date_debut_encheres,date_fin_encheres,prix_initial,vendeur,categorie);		
		
			DAOFactory.getArticleDAO().insert(article);
		}
}
