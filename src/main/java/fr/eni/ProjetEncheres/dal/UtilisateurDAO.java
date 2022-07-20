package fr.eni.ProjetEncheres.dal;

import fr.eni.ProjetEncheres.bo.Utilisateur;

public interface UtilisateurDAO extends DAO<Utilisateur> {
	
	
	public Utilisateur selectByPseudo(String pseudo);
	
	public Utilisateur selectByEmail(String email);

}
