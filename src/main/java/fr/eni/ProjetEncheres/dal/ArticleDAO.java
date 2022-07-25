package fr.eni.ProjetEncheres.dal;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;

public interface ArticleDAO extends DAO<Article>{
	
	
	 //liste articles associée au mot clef

	 List<Article> selectByMotCle(String mot_cle);
	 
	 List<Article> selectByCategorie(int identifiant);
	
	//liste d'articles associée a la categorie	 
}
