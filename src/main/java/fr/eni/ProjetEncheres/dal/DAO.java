package fr.eni.ProjetEncheres.dal;

import java.sql.SQLException;
import java.util.List;

public interface DAO<T>{

	List<T> selectAll();
	
	T selectById(int id);
	
	void insert(T value) throws SQLException;
	
	void delete(int id);
	
	void update(T value);
}
