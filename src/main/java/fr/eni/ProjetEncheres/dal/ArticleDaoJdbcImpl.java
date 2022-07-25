 package fr.eni.ProjetEncheres.dal;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;
import fr.eni.ProjetEncheres.bo.Utilisateur;

public class ArticleDaoJdbcImpl implements ArticleDAO{
	
	private static final String SELECT_MOT_CLE = "SELECT * FROM ARTICLES WHERE nom LIKE ?;";
	private static final String SELECT_BY_CATEGORIE="SELECT * FROM ARTICLES WHERE no_categorie = ?;";
	@Override
	public List<Article> selectAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Article selectById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insert(Article value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Article value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Article> selectByMotCle(String mot_cle) {
		
		List<Article> articles = new ArrayList<Article>();
		
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(SELECT_MOT_CLE);
			mot_cle = "%"+mot_cle+"%";//Select_by_mot_cle
			pStmt.setString(1,mot_cle);
			ResultSet rs = pStmt.executeQuery();//récupère liste d'article qui contient le mot clef dans leur nom
			//boucle quand c'est une liste
			while (rs.next()) {
				//rs.getInt("no_categorie");
				int id_acheteur = rs.getInt("no_acheteur");//je stocke dans la variable l'identifiant de l'acheteur de l'article
				int id_vendeur = rs.getInt("no_vendeur");
				int id_categorie = rs.getInt("no_categorie");
				
				//= Utilisateur acheteur = DAOFactory.getUtilisateurDAO().selectById(rs.getInt("no_acheteur"));
				//supprime la variable id_acheteur
				Utilisateur acheteur = DAOFactory.getUtilisateurDAO().selectById(id_acheteur);
				Utilisateur vendeur = DAOFactory.getUtilisateurDAO().selectById(id_vendeur);
				Categorie categorie = DAOFactory.getCategorieDAO().selectById(id_categorie);
				
				Article article = new Article(rs.getString("nom_article"),rs.getString("description"),rs.getDate("date_debut_encheres"),rs.getDate("date_fin-encheres"),rs.getInt("prix_vente"),acheteur,vendeur,categorie);
				
				articles.add(article);
			}
			
		} 
		
		catch (SQLException e) {
				e.printStackTrace();
		}
		return articles;
	}
	
	

	@Override
	public List<Article> selectByCategorie(int identifiant) {
		List<Article> articles= new ArrayList<Article>();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(SELECT_BY_CATEGORIE);
			pStmt.setInt(1, identifiant);
			ResultSet rs = pStmt.executeQuery();
			while(rs.next()) {
				//rs.getInt("no_categorie");
				int id_acheteur = rs.getInt("no_acheteur");//je stocke dans la variable l'identifiant de l'acheteur de l'article
				int id_vendeur = rs.getInt("no_vendeur");
				int id_categorie = rs.getInt("no_categorie");
				
				//= Utilisateur acheteur = DAOFactory.getUtilisateurDAO().selectById(rs.getInt("no_acheteur"));
				//supprime la variable id_acheteur
				Utilisateur acheteur = DAOFactory.getUtilisateurDAO().selectById(id_acheteur);
				Utilisateur vendeur = DAOFactory.getUtilisateurDAO().selectById(id_vendeur);
				Categorie categorie = DAOFactory.getCategorieDAO().selectById(id_categorie);
				
				Article article = new Article(rs.getString("nom_article"),rs.getString("description"),rs.getDate("date_debut_encheres"),rs.getDate("date_fin-encheres"),rs.getInt("prix_vente"),acheteur,vendeur,categorie);
				
				articles.add(article);
				
			}
			
			} 
	catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		return articles;
	}

		
	
}
