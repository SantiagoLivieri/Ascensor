package alumno.unlam.edu.ar.Ascensor;

import java.util.Objects;

public class Persona {

	private String nombreApellido;
	private Integer doc;
	private Double peso;

	public Persona(String nombreApellido, Integer doc, Double peso) {
		this.nombreApellido = nombreApellido;
		this.doc = doc;
		this.peso = peso;
	}
	
	public Persona (Double peso) {
		this.peso = peso;
	}
	

	public Integer getDoc() {
		return doc;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public String getNombreApellido() {
		return nombreApellido;
	}

	@Override
	public int hashCode() {
		return Objects.hash(doc);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		return Objects.equals(doc, other.doc);
	}
	
	
	
}
