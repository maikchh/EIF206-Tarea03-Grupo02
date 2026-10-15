package tarea.com.mvc.models;

public class Serie {
	
	private String titulo;
	private String genero;
	private int temporadas;
	private int calificacion;
	
	public Serie() {
		// TODO Auto-generated constructor stub
	}

	public Serie(String titulo, String genero, int temporadas, int calificacion) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.temporadas = temporadas;
		this.calificacion = calificacion;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getTemporadas() {
		return temporadas;
	}

	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}

	public int getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", genero=" + genero + ", temporadas=" + temporadas + ", calificacion="
				+ calificacion + "]";
	}
}
