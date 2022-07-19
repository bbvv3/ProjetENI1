package fr.eni.ProjetEncheres.dal;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import fr.eni.ProjetEncheres.bo.Utilisateur;

public class UtilisateurDaoJdbcImpl implements UtilisateurDAO{
	
	private static final String INSERT = "INSERT INTO UTILISATEURS(pseudo,nom,prenom,email,telephone,rue,code_postal,ville,mot_de_passe,credit,administrateur)"
			+" VALUES (?,?,?,?,?,?,?,?,?,?,?)";
	private static final String SELECT_BY_ID="SELECT * FROM UTILISATEURS WHERE no_utilisateur = ? ";
	
		
	
	
	@Override
	public List<Utilisateur> selectAll() {
		
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Utilisateur selectById(int id) {
		Utilisateur utilisateur = new Utilisateur();
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(SELECT_BY_ID);
			pStmt.setInt(1, id);
			ResultSet rs = pStmt.executeQuery();
			if(rs.next()){ 
			utilisateur = new Utilisateur(rs.getString("pseudo"),rs.getString("nom"),rs.getString("prenom"),rs.getString("email"),rs.getString("telephone"),rs.getString("rue"),rs.getString("code_postal"),rs.getString("ville"),rs.getString("mot_de_passe"),rs.getInt("credit"),rs.getBoolean("administrateur"));
			}
			
			
		} catch (SQLException e) {
		
			e.printStackTrace();
		}
		return utilisateur;
		
	
	}

	@Override
	public void insert(Utilisateur utilisateur) {
		try(Connection cnx = ConnectionProvider.getConnection()){
			PreparedStatement pStmt = cnx.prepareStatement(INSERT, Statement.RETURN_GENERATED_KEYS);
			pStmt.setString(1, utilisateur.getPseudo());
			pStmt.setString(2, utilisateur.getNom());
			pStmt.setString(3, utilisateur.getPrenom());
			pStmt.setString(4, utilisateur.getEmail());
			pStmt.setString(5, utilisateur.getTelephone());
			pStmt.setString(6, utilisateur.getRue());
			pStmt.setString(7, utilisateur.getCode_postal());
			pStmt.setString(8, utilisateur.getVille());
			pStmt.setString(9, utilisateur.getMot_de_passe());
			pStmt.setInt(10, utilisateur.getCredit());
			pStmt.setBoolean(1, utilisateur.isAdministrateur());
			pStmt.executeUpdate();
			ResultSet rs = pStmt.getGeneratedKeys();
			if(rs.next()) {
				utilisateur.setNo_utilisateur(rs.getInt("no_utilisateur"));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Utilisateur value) {
		// TODO Auto-generated method stub
		
	}

	
}
