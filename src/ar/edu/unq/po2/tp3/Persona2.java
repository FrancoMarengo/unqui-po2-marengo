package ar.edu.unq.po2.tp3;

public class Persona2 {
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona2(String nombre, String apellido, int edad) {
    	super();
    	this.setNombre(nombre);
    	this.setApellido(apellido);
    	this.setEdad(edad);
    }
    
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	private void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	private void setEdad(int edad) {
		this.edad = edad;
	}
    
}
