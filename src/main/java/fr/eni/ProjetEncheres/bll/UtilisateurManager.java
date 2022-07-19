package fr.eni.ProjetEncheres.bll;

import fr.eni.ProjetEncheres.bo.Utilisateur;
import fr.eni.ProjetEncheres.dal.DAOFactory;

public class UtilisateurManager {
	
	private static UtilisateurManager instance;

	public UtilisateurManager() {
	}
	
	public static UtilisateurManager getInstance() {
		if(instance==null) {
			instance = new UtilisateurManager();
		}
		return instance;
	}
	
	public void insert(String pseudo,String nom,String prenom,String email,String telephone,String rue,String code_postal,String ville,String mot_de_passe) {
		Utilisateur utilisateur = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,0,false);
		DAOFactory.getUtilisateurDAO().insert(utilisateur);
	}
	
	public boolean isValid() {
		return false;
	}
}
