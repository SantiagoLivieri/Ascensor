package alumno.unlam.edu.ar.Ascensor;


import java.util.HashSet;
import java.util.Iterator;



public class Ascensor {
//HASHSET 
// LIST
// MAP
	private Integer pisoActual;
	private Integer pisoMaximo;
	private Integer pisoMinimo;
	private Integer cantidadDePersonas;
	private Double pesoMaximo;
	private HashSet<Persona> personas;
	private boolean puerta;

	public Ascensor(Integer pisoMaximo, Integer pisoMinimo, Integer cantidadDePersonas, Double pesoMaximo) {
		this.pisoMaximo = pisoMaximo;
		this.pisoMinimo = pisoMinimo;
		this.cantidadDePersonas = cantidadDePersonas;
		this.pesoMaximo = pesoMaximo;
		this.pisoActual = 0;
		this.puerta = true;
		personas =  new HashSet<Persona> ();	
	}

	public Boolean subir(Persona persona) {
		if( this.pesoMaximo.equals(calcularPesoTotal()) || (this.puerta ==  false))  {
				if(personas.contains(persona)  || (personas.size() == this.cantidadDePersonas)){
					System.out.println("Ya estaba o Cantidad Maxima Personas");
					return false;
			  }	 
				System.out.println("Cantidad Maxima Peso");
				 return false;
		}
		else {
			personas.add(persona);
			return true;
		}
	}

	public Boolean bajar(Persona persona) {
		if(this.puerta ==  true){
			if(personas.contains(persona)){
				personas.remove(persona);
				return true;
			}
			return true;
		}
		else 
			{
			return false;
			}	
	}
	
	public Integer getCantidadDePersonasEnElAscensor() {
		Integer cantidadDePersonas = personas.size();
		return cantidadDePersonas;
	}
	
	
	public Double calcularPesoTotal() {	
		Double pesoTotal =0.0;
		
		for (Persona persona : personas) {
			Double pesoParcial = 0.0; 
			
			System.out.println("nombre" + " " +persona.getNombreApellido()+" "+"pesa"+" "+ (pesoParcial = persona.getPeso()));
			 pesoTotal += pesoParcial;
		}	
		return pesoTotal;	
	}
	
	
	
	public Integer irAlPiso(Integer piso) {
		if(pisoMinimo > piso || piso > pisoMaximo || this.puerta !=  false) {
			return pisoActual;
			
		}else if(pisoMinimo <= piso) {
			this.pisoActual = piso;
			return pisoActual;
			
		}else if (pisoMaximo >= piso){
			this.pisoActual = piso;
			return this.pisoActual;
		}
		return this.pisoActual;
	}
	
	public Integer getPisoActual() {
		return pisoActual;
	}

	
	public boolean abrirOCerrraPuerta() {
		if(this.puerta == true) {
			this.puerta = false; 
			return this.puerta;
			
		} else  if(this.puerta == false);
			this.puerta = true; 
			return this.puerta;
	}
	
}


