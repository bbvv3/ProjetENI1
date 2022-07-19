package fr.eni.ProjetEncheres.bo;

public class Retrait {

	
	private String rue;
	private String code_postal;
	private String ville;
	private Article article;
	/**
	 * 
	 */
	public Retrait() {
	}
	/**
	 * @param rue
	 * @param code_postal
	 * @param ville
	 * @param article
	 */
	public Retrait(String rue, String code_postal, String ville, Article article) {
		this.rue = rue;
		this.code_postal = code_postal;
		this.ville = ville;
		this.article = article;
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
	@Override
	public String toString() {
		return "Retrait [rue=" + rue + ", code_postal=" + code_postal + ", ville=" + ville + ", article=" + article
				+ "]";
	}
	
	
	
}
