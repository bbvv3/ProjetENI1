package fr.eni.ProjetEncheres.dal;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;

public interface ArticleDAO extends DAO<Article> {
	
	
	// a droite c'est ce que je posséde_ a gauche c'est ce que je veux récupèrer
	//liste d'article aasocié au mot clef
	
	
	 List<Article> selectByMotCle (String mot_cle);

	 List<Article> selectByCategorie(Categorie categorie);
	 
	 //liste d'article associée au catégorie
	 
}
