 package fr.eni.ProjetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Article;
import fr.eni.ProjetEncheres.bo.Categorie;

public class ArticleDaoJdbcImpl implements ArticleDAO{
	
	private static final String SELECT_MOT_CLE = "SELECT * FROM ARTICLES WHERE nom LIKE ?;";

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
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(SELECT_MOT_CLE);
			mot_cle = "%"+mot_cle+"%";//Select_by_mot_cle
			pStmt.setString(1,mot_cle);
			ResultSet rs = pStmt.executeQuery();//récupère liste d'article qui contient le mot clef dans leur nom
			
			while (rs.next()) {
				Article article = new Article(rs.getString("nom_article"));
			}
			} 
			
		
		catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
		
		
		
		return null;
	}

	@Override
	public List<Article> selectByCategorie(Categorie categorie) {
		// TODO Auto-generated method stub
		return null;
	}

}
