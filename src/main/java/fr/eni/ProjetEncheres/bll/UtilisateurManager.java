package fr.eni.ProjetEncheres.bll;




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
	
	/**
	 * 
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param mdp1
	 * @param mdp2
	 * @throws Exception
	 * 
	 * Recupère tout les parametres pour les inserer dans le tableau utilisateur de la BDD via la DAL si les critères sont valides
	 */
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
	
	/**
	 * 
	 * @param id
	 * @return Utilisateur
	 * 
	 * Retourne zero ou un utilisateur associé à l'id donné en paramètre
	 */
	public Utilisateur selectById(int id) {
		
		return DAOFactory.getUtilisateurDAO().selectById(id);
		
	}
	/**
	 * 
	 * @param pseudo
	 * @return Utilisateur
	 * 
	 * Retourne zero ou un utilisateur associé au pseudo donné en paramètre
	 */
	public Utilisateur selectByPseudo(String pseudo) {
		return DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
	}
	/**
	 * 
	 * @param pseudo
	 * @param mot_de_passe
	 * @return Utilisateur
	 * @throws Exception
	 * 
	 * Retourne un utilisateur si le pseudo existe dans la BDD et si le mot de passe correspond
	 */
	public Utilisateur connexion (String pseudo,String mot_de_passe) throws Exception {
		
		Utilisateur utilisateur= DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
		
		if(utilisateur  == null ) {
			throw new Exception("Pseudo inconnu");
			
		} else if( !mot_de_passe.equals(utilisateur.getMot_de_passe()))
		{
			throw new Exception("Mot de passe incorrect");
		}
	return utilisateur;
	}
	/**
	 * 
	 * @param email
	 * @return Utilisateur
	 * 
	 * Retourne zero ou un utilisateur associé à l'email donné en paramètre 
	 */
	public Utilisateur selectByEmail(String email) {
		return DAOFactory.getUtilisateurDAO().selectByEmail(email);
	}
	/**
	 * 
	 * @param id
	 * @param pseudo
	 * @param nom
	 * @param prenom
	 * @param email
	 * @param telephone
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param mot_de_passe
	 * @param conf_mot_de_passe
	 * @throws Exception
	 * 
	 * Recupère tout les parametres pour mettre à jour la ligne du tableau utilisateur associée à l'id donné en paramètre si les critères sont valides
	 */
	public void update(int id,String pseudo,String nom,String prenom,String email,String telephone,String rue,String code_postal,String ville,String mot_de_passe,String conf_mot_de_passe) throws Exception {
		 Utilisateur utilisateur = DAOFactory.getUtilisateurDAO().selectById(id);
		 Utilisateur user = DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
		 
		 	//nouveau pseudo != ancien pseudo
		 if( !pseudo.equals(utilisateur.getPseudo()) && user != null) {
			 throw new Exception("ce pseudo existe déjà");
		 }
		 utilisateur.setPseudo(pseudo);
		 utilisateur.setNom(nom);
		 utilisateur.setPrenom(prenom);
		 
		 user = DAOFactory.getUtilisateurDAO().selectByEmail(email);
		 if (!email.equals(utilisateur.getEmail()) && user != null ) {
			 throw new Exception("Cet email existe déjà");
		 }
		 utilisateur.setEmail(email);
		 utilisateur.setTelephone(telephone);
		 utilisateur.setRue(rue);
		 utilisateur.setCode_postal(code_postal);
		 utilisateur.setVille(ville);
		 
		 if(!mot_de_passe.equals(conf_mot_de_passe)) {
			 throw new Exception("Les deux mots de passe ne sont pas identiques");
		 }
		utilisateur.setMot_de_passe(mot_de_passe);
		 
		DAOFactory.getUtilisateurDAO().update(utilisateur);
		 
	}
	
	public void delete(int id) {
		DAOFactory.getUtilisateurDAO().delete(id);
	}

	
}
