package tarea.com.mvc.models;

public class Serie {
	

	private int id;
	private String titulo ; 
	private int temporadas ; 
	private double calificacion;
	private int idGenero;
	
	
	public Serie(String titulo, int temporadas, double calificacion, int idGenero) {
		this.id = 0;
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.calificacion = calificacion;
		this.idGenero = idGenero;
	}
	
	public Serie(int id, String titulo, int temporadas, double calificacion, int idGenero) {
		this.id = id;
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.calificacion = calificacion;
		this.idGenero = idGenero;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public int getIdGenero() {
		return idGenero;
	}

	public void setIdGenero(int idGenero) {
		this.idGenero = idGenero;
	}
	
	

}
