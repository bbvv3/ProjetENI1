package fr.eni.ProjetEncheres.dal;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;

public interface ArticleDAO extends DAO<Article> {
	
	 List<Article> selectByMotCle (String mot_cle);

	 List<Article> selectByCategorie(Categorie categorie);
	 
	 
}
