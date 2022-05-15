package ar.edu.unq.po2.tp6;

public class Cliente {

	private String nombre;
	private String apellido;
	private String direccion;
	private int edad;
	private double sueldoNetoMens;
	
	public Cliente(String nombre, String apellido, String direccion, int edad, double sueldoNetoMens, BancoClientes banco) {
		super();
		this.setApellido(apellido);
		this.setNombre(nombre);
		this.setDireccion(direccion);
		this.setEdad(edad);
		this.setSueldoNetoMens(sueldoNetoMens);
		banco.registrar(this);
	}
	
	public double sueldoNetoAnual() {
		return(this.getSueldoNetoMens() * 12);
	}
	
	public void solicitarCredito(SolicitudDeCredito solicitud, BancoSolicitudes banco) {
		banco.registrarSolicitudDeCredito(solicitud);
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

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getEdad() {
		return edad;
	}

	private void setEdad(int edad) {
		this.edad = edad;
	}

	public double getSueldoNetoMens() {
		return sueldoNetoMens;
	}

	private void setSueldoNetoMens(double sueldoNetoMens) {
		this.sueldoNetoMens = sueldoNetoMens;
	}
}
