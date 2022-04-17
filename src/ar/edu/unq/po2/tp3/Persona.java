package ar.edu.unq.po2.tp3;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Persona {
    private String nombre;
    private Period fechaDeNacimiento;
    
    public Persona(String nombre, Period fechaDeNacimiento) {
    	super();
    	this.setNombre(nombre);
    	this.setFechaDeNacimiento(fechaDeNacimiento);
    }
    
    public Persona(String nombre, Date fechaNacimiento) {
    	super();
    	this.setNombre(nombre);
    	this.setFechaDeNacimiento(fechaDeNacimiento);
    }
    
    public int edad() {
    	Period edad = Period.between(LocalDate.of(
    			                                   fechaDeNacimiento.getYears(), 
    			                                   fechaDeNacimiento.getMonths(), 
    			                                   fechaDeNacimiento.getDays()), LocalDate.now()
    			                                 );
    	return (edad.getYears());
    }
    
    public boolean esMenorQue(Persona unaPersona) {
    	return(this.edad() < unaPersona.edad());
    }
    
    public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Period getFecha() {
		return fechaDeNacimiento;
	}

	private void setFechaDeNacimiento(Period fecha) {
		this.fechaDeNacimiento = fecha;
	}

}
