package fr.eni.ProjetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Categorie;

public class CategorieDaoJdbcImpl implements CategorieDAO{

	private static final String SELECT_ALL = "SELECT * FROM CATEGORIES";
	private static final String SELECT_BY_ID = "SELECT * FROM CATEGORIES WHERE no_categorie = ?";

	@Override
	public List<Categorie> selectAll() {
		List<Categorie> categories = new ArrayList<>();
		try(Connection cnx = ConnectionProvider.getConnection()){
			Statement Stmt = cnx.createStatement();
			ResultSet rs = Stmt.executeQuery(SELECT_ALL);
			while(rs.next()) {
				Categorie categorie = new Categorie(rs.getInt(1),rs.getString("libelle"));
				categories.add(categorie);
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return categories;
	}

	@Override
	public Categorie selectById(int id) {
		Categorie categorie = null;
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(SELECT_BY_ID);
			pStmt.setInt(1,id);
			ResultSet rs = pStmt.executeQuery();
			if(rs.next()) {
				//TODO
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return categorie;
	}

	@Override
	public void insert(Categorie value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Categorie value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}
	
	
	
}
