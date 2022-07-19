package fr.eni.ProjetEncheres.dal;

public class DAOFactory {
	
	public static UtilisateurDAO getUtilisateurDAO() {
		return new UtilisateurDaoJdbcImpl();
	}
	
	
}
