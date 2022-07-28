package fr.eni.ProjetEncheres.dal;

import java.util.Date;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;
import fr.eni.ProjetEncheres.bo.Utilisateur;

public interface ArticleDAO extends DAO<Article>{
	
	
	 //liste articles associée au mot clef

	 List<Article> selectByMotCle(String mot_cle);
	 
	 List<Article> selectByCategorie(int identifiant);

	
	
	//liste d'articles associée a la categorie	 
}
