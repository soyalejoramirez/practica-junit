package co.alejandro.domain;

public class Ciudad {
	private String nombre;
	private int poblacion;
	private String sitioRepresentativo;
	
	public Ciudad(String nombre, String sitioRepresentativo) {
		this.nombre = nombre;
		this.sitioRepresentativo = sitioRepresentativo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPoblacion() {
		return poblacion;
	}
	public void setPoblacion(int poblacion) {
		this.poblacion = poblacion;
	}
	public String getSitioRepresentativo() {
		return sitioRepresentativo;
	}
	public void setSitioRepresentativo(String sitioRepresentativo) {
		this.sitioRepresentativo = sitioRepresentativo;
	}
}
