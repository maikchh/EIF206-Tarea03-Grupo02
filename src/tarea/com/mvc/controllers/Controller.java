package tarea.com.mvc.controllers;

interface Controller<T> {

	// Para las vistas
	public void index();
	public void create();
	public void edit(int id);

	//Para los modelos

	public void store(T item);
	public void update(T item,int id);
	public void destroy(int id);

}