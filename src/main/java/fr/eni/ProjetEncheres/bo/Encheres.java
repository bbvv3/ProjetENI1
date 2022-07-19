package fr.eni.ProjetEncheres.bo;

import java.util.Date;

public class Encheres {
	
	private  Utilisateur utilisateur;
	private Article article;
	private Date date_enchere;
	private int montant_enchere;
	
	
	//CONSTRUCTEURS
	
	/**
	 * 
	 */
	public Encheres() {
	}

	/**
	 * @param utilisateur
	 * @param article
	 * @param date_enchere
	 * @param montant_enchere
	 */
	public Encheres(Utilisateur utilisateur, Article article, Date date_enchere, int montant_enchere) {
		this.utilisateur = utilisateur;
		this.article = article;
		this.date_enchere = date_enchere;
		this.montant_enchere = montant_enchere;
	}
	
	
	//GETTER/SETTER

	/**
	 * @return the utilisateur
	 */
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	/**
	 * @param utilisateur the utilisateur to set
	 */
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	/**
	 * @return the article
	 */
	public Article getArticle() {
		return article;
	}

	/**
	 * @param article the article to set
	 */
	public void setArticle(Article article) {
		this.article = article;
	}

	/**
	 * @return the date_enchere
	 */
	public Date getDate_enchere() {
		return date_enchere;
	}

	/**
	 * @param date_enchere the date_enchere to set
	 */
	public void setDate_enchere(Date date_enchere) {
		this.date_enchere = date_enchere;
	}

	/**
	 * @return the montant_enchere
	 */
	public int getMontant_enchere() {
		return montant_enchere;
	}

	/**
	 * @param montant_enchere the montant_enchere to set
	 */
	public void setMontant_enchere(int montant_enchere) {
		this.montant_enchere = montant_enchere;
	}

	
	//toString
	
	@Override
	public String toString() {
		return "Encheres [utilisateur=" + utilisateur + ", article=" + article + ", date_enchere=" + date_enchere
				+ ", montant_enchere=" + montant_enchere + "]";
	}
	
	
	

}
