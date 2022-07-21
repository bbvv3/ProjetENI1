package fr.eni.ProjetEncheres.bo;

import java.io.Serializable;

public class Categorie implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private int no_categorie;
	private String libelle;
	/**
	 * 
	 */
	
	//CONSTRUCTEURS
	
	public Categorie() {
	}
	/**
	 * @param libelle
	 */
	public Categorie(String libelle) {
		this.libelle = libelle;
	}
	
	
	//GETTER/SETTER
	/**
	 * @return the libelle
	 */
	public String getLibelle() {
		return libelle;
	}
	/**
	 * @param libelle the libelle to set
	 */
	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}
	/**
	 * @return the no_categorie
	 */
	public int getNo_categorie() {
		return no_categorie;
	}
	/**
	 * @param no_categorie the no_categorie to set
	 */
	public void setNo_categorie(int no_categorie) {
		this.no_categorie = no_categorie;
	}
	
	//toString
	
	@Override
	public String toString() {
		return "Categorie [no_categorie=" + no_categorie + ", libelle=" + libelle + "]";
	}
	
	

}
