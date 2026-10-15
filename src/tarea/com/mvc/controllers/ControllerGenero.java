package tarea.com.mvc.controllers;

import java.util.ArrayList;

import tarea.com.mvc.models.Genero;
import tarea.com.mvc.models.dao.DAOGenero;

public class ControllerGenero {

	public DAOGenero dao;
	
	public ControllerGenero() {
		dao = new DAOGenero();
	}
	
	public Genero findGenderById(String gender) {
		ArrayList<Genero> list = dao.all();
		
		for(Genero g : list) {
			if(g.getNombre().equalsIgnoreCase(gender)) {
				return g;
			}
		}
		return null;
	}
	
	public ArrayList<Genero> getListGender() {
		return dao.all();
	}
}
