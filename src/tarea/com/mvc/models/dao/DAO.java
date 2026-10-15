package tarea.com.mvc.models.dao;

import java.util.ArrayList;

public interface DAO <T>{

	public ArrayList<T> all();
	public T find(int id);
	
	public boolean store(T item);
	public boolean update(T item, int id);
	public boolean destroy(int id);
}
