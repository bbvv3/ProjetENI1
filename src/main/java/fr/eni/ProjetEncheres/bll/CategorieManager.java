package fr.eni.ProjetEncheres.bll;

import java.util.List;

import fr.eni.ProjetEncheres.bo.Categorie;
import fr.eni.ProjetEncheres.dal.DAOFactory;

public class CategorieManager {
		
	//singleton
	private static CategorieManager instance;

		
	private CategorieManager() {
	}
	
	public static CategorieManager getInstance() {
		if(instance==null) {
			instance = new CategorieManager();
		}
		return instance;
	}
	
	public List<Categorie> selectAll(){
		return DAOFactory.getCategorieDAO().selectAll();
	}
	
}
