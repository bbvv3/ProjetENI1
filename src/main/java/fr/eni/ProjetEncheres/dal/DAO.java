package fr.eni.ProjetEncheres.dal;

import java.util.List;

public interface DAO<T>{

	List<T> selectAll();
	
	T selectById(int id);
	
	void insert(T value);
	
	void delete(int id);
	
	void update(T value);
}
