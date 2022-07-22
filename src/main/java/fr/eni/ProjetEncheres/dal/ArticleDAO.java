package fr.eni.ProjetEncheres.dal;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;

public interface ArticleDAO extends DAO<Article>{
	
	
	 //liste articles associée au mot clef

	 List<Article> selectByMotCle(String mot_cle);
	 
	 List<Article> selectByCategorie(int identifiant);
	
	//liste d'articles associée a la categorie
	
	 
	 //select Categorie byId-fonction
	 
	 Categorie selectCategorieById(int id_categorie );
	 //
}
