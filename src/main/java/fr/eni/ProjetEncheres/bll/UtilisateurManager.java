package fr.eni.ProjetEncheres.bll;

import java.sql.SQLException;

import fr.eni.ProjetEncheres.bo.Utilisateur;
import fr.eni.ProjetEncheres.dal.DAOFactory;

public class UtilisateurManager {
	
	//singleton
	private static UtilisateurManager instance;

	
	private UtilisateurManager() {
	}
	
	public static UtilisateurManager getInstance() {
		if(instance==null) {
			instance = new UtilisateurManager();
		}
		return instance;
	}
	
	public void insert(String pseudo,String nom,String prenom,String email,String telephone,String rue,String code_postal,String ville,String mdp1,String mdp2) throws Exception {
		String erreur ="";
		if(getInstance().selectByPseudo(pseudo) != null) {
			erreur += "Ce pseudo existe déjà"; 
		}
		if(getInstance().selectByEmail(email) != null) {
			if(!erreur.equals("")) {
				erreur += " / ";
			}
			erreur += "Cet email existe déjà";
		}
		if(mdp1.equals(mdp2)) {
			if(!erreur.equals("")) {
				erreur += " / ";
			}
			erreur += "Les deux mots de passe ne sont pas identiques";
		}
		if(!erreur.equals("")) {
			throw new Exception(erreur);
		}
		Utilisateur utilisateur = new Utilisateur(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mdp1,0,false);
		DAOFactory.getUtilisateurDAO().insert(utilisateur);
	}
	
	public Utilisateur selectById(int id) {
		
		return DAOFactory.getUtilisateurDAO().selectById(id);
		
	}
	
	public Utilisateur selectByPseudo (String pseudo) {
		
		return DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
	}
	
	public Utilisateur selectByEmail(String email) {
		return DAOFactory.getUtilisateurDAO().selectByEmail(email);
	}
	
}
