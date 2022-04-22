package ar.edu.unq.po2.tp4;

public class Producto {
    
	private String nombre;
	private double precio;
	private boolean esPrecioCuidado;
	
	public Producto(String nombre, double precio, boolean esPrecioCuidado) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(esPrecioCuidado);
	}
	
	public Producto(String nombre, double precio) {
		super();
		this.setNombre(nombre);
		this.setPrecio(precio);
		this.setEsPrecioCuidado(false);
	}
	
	public void aumentarPrecio(double monto) {
	    this.setPrecio(this.getPrecio() + monto);
	}
	
	public String getNombre() {
		return nombre;
	}
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPrecio() {
		return precio;
	}
	private void setPrecio(double precio) {
		this.precio = precio;
	}
	public boolean esPrecioCuidado() {
		return esPrecioCuidado;
	}
	private void setEsPrecioCuidado(boolean esPrecioCuidado) {
		this.esPrecioCuidado = esPrecioCuidado;
	}
	
}
