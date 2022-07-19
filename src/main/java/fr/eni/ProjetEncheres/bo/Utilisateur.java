package fr.eni.ProjetEncheres.bo;

public class Utilisateur {

	
		
		private int no_utilisateur;
		private String pseudo;
		private String nom;
		private String prenom;
		private String email;
		private String telephone;
		private String rue;
		private String code_postal;
		private String ville;
		private String mot_de_passe;
		private int credit;
		private boolean administrateur;
		
		
		//CONSTRUCTEURS
		
		
		/**
		 * 
		 */
		public Utilisateur() {
		}
		/**
		 * @param pseudo
		 * @param nom
		 * @param prenom
		 * @param email
		 * @param telephone
		 * @param rue
		 * @param code_postal
		 * @param ville
		 * @param mot_de_passe
		 * @param credit
		 * @param administrateur
		 */
		public Utilisateur(String pseudo, String nom, String prenom, String email, String telephone, String rue, String code_postal,
				String ville, String mot_de_passe, int credit, boolean administrateur) {
			this.pseudo = pseudo;
			this.nom = nom;
			this.prenom = prenom;
			this.email = email;
			this.telephone = telephone;
			this.rue = rue;
			this.code_postal = code_postal;
			this.ville = ville;
			this.mot_de_passe = mot_de_passe;
			this.credit = credit;
			this.administrateur = administrateur;
		}
		
		//GETTER/SETTER
		
		
		/**
		 * @return the no_utilisateur
		 */
		public int getNo_utilisateur() {
			return no_utilisateur;
		}
		/**
		 * @param no_utilisateur the no_utilisateur to set
		 */
		public void setNo_utilisateur(int no_utilisateur) {
			this.no_utilisateur = no_utilisateur;
		}
		/**
		 * @return the pseudo
		 */
		public String getPseudo() {
			return pseudo;
		}
		/**
		 * @param pseudo the pseudo to set
		 */
		public void setPseudo(String pseudo) {
			this.pseudo = pseudo;
		}
		/**
		 * @return the nom
		 */
		public String getNom() {
			return nom;
		}
		/**
		 * @param nom the nom to set
		 */
		public void setNom(String nom) {
			this.nom = nom;
		}
		/**
		 * @return the prenom
		 */
		public String getPrenom() {
			return prenom;
		}
		/**
		 * @param prenom the prenom to set
		 */
		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}
		/**
		 * @return the email
		 */
		public String getEmail() {
			return email;
		}
		/**
		 * @param email the email to set
		 */
		public void setEmail(String email) {
			this.email = email;
		}
		/**
		 * @return the telephone
		 */
		public String getTelephone() {
			return telephone;
		}
		/**
		 * @param telephone the telephone to set
		 */
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		/**
		 * @return the rue
		 */
		public String getRue() {
			return rue;
		}
		/**
		 * @param rue the rue to set
		 */
		public void setRue(String rue) {
			this.rue = rue;
		}
		/**
		 * @return the code_postal
		 */
		public String getCode_postal() {
			return code_postal;
		}
		/**
		 * @param code_postal the code_postal to set
		 */
		public void setCode_postal(String code_postal) {
			this.code_postal = code_postal;
		}
		/**
		 * @return the ville
		 */
		public String getVille() {
			return ville;
		}
		/**
		 * @param ville the ville to set
		 */
		public void setVille(String ville) {
			this.ville = ville;
		}
		/**
		 * @return the mot_de_passe
		 */
		public String getMot_de_passe() {
			return mot_de_passe;
		}
		/**
		 * @param mot_de_passe the mot_de_passe to set
		 */
		public void setMot_de_passe(String mot_de_passe) {
			this.mot_de_passe = mot_de_passe;
		}
		/**
		 * @return the credit
		 */
		public int getCredit() {
			return credit;
		}
		/**
		 * @param credit the credit to set
		 */
		public void setCredit(int credit) {
			this.credit = credit;
		}
		/**
		 * @return the administrateur
		 */
		public boolean isAdministrateur() {
			return administrateur;
		}
		/**
		 * @param administrateur the administrateur to set
		 */
		public void setAdministrateur(boolean administrateur) {
			this.administrateur = administrateur;
		}
		
		//toString
		
		@Override
		public String toString() {
			return "Utilisateur [no_utilisateur=" + no_utilisateur + ", pseudo=" + pseudo + ", nom=" + nom + ", prenom="
					+ prenom + ", email=" + email + ", telephone=" + telephone + ", rue=" + rue + ", code_postal="
					+ code_postal + ", ville=" + ville + ", mot_de_passe=" + mot_de_passe + ", credit=" + credit
					+ ", administrateur=" + administrateur + "]";
		}
		
		
		
		
		
		
	

}
