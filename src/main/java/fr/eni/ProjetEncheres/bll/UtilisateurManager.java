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
	
	public Utilisateur selectByPseudo(String pseudo) {
		return DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
	}
	
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
	
	public Utilisateur selectByEmail(String email) {
		return DAOFactory.getUtilisateurDAO().selectByEmail(email);
	}
	
	public void update(int id,String pseudo,String nom,String prenom,String email,String telephone,String rue,String code_postal,String ville,String mot_de_passe,String conf_mot_de_passe) throws Exception {
		 Utilisateur utilisateur = DAOFactory.getUtilisateurDAO().selectById(id);
		 Utilisateur user = DAOFactory.getUtilisateurDAO().selectByPseudo(pseudo);
		 
		 	//nouveau pseudo != ancien pseudo
		 if( pseudo!=utilisateur.getPseudo() && user!= null ) {
			 throw new Exception("ce pseudo existe déjà");}
		
		 utilisateur.setPseudo(pseudo);
		 utilisateur.setNom(nom);
		 utilisateur.setPrenom(prenom);
		 
		 user = DAOFactory.getUtilisateurDAO().selectByEmail(email);
		 if (email!=utilisateur.getEmail() && user!=null ) {
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
	
	
}
