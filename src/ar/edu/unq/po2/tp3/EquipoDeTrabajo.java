package ar.edu.unq.po2.tp3;
import java.util.ArrayList;


public class EquipoDeTrabajo {
	
    private String nombre;
    private ArrayList<Persona2> integrantes = new ArrayList<Persona2>();
    
    public EquipoDeTrabajo(String nombre, ArrayList<Persona2> integrantes) {
    	super();
    	this.setNombre(nombre);
    	this.setIntegrantes(integrantes);
    }
   
    public int promedioEdadDeIntegrantes() {
    	int promedioHastaAhora = 0;
    	int cantidadDeIntegrantesHastaAhora = 0;
    	for(Persona2 integrante:integrantes) {
    		promedioHastaAhora = promedioHastaAhora + integrante.getEdad();
    		cantidadDeIntegrantesHastaAhora++;
    	}
    	if (cantidadDeIntegrantesHastaAhora == 0) {
    		promedioHastaAhora = -1;
    	} else {
    		promedioHastaAhora = promedioHastaAhora / cantidadDeIntegrantesHastaAhora;
    	}
    	return(promedioHastaAhora);
    }
    
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Persona2> getIntegrantes() {
		return integrantes;
	}
	private void setIntegrantes(ArrayList<Persona2> integrantes) {
		this.integrantes = integrantes;
	}
    
    
}
