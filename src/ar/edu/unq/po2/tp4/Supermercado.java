package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Supermercado {

	private String nombre;
	private String direccion;
	private List<Producto> catalogo;
	
	public Supermercado(String nombre, String direccion) {
		super();
		this.setNombre(nombre);
		this.setDireccion(direccion);
		catalogo = new ArrayList<Producto>();
	}
	
	public void agregarProducto(Producto producto) {
		catalogo.add(producto);
	}
	
	public double getPrecioTotal() {
		double precioTotalHastaAhora = 0;
		for(Producto producto:catalogo) {
			precioTotalHastaAhora = precioTotalHastaAhora + producto.getPrecio();
		}
		return(precioTotalHastaAhora);
	}
	
	public int getCantidadDeProductos() {
		return(catalogo.size());
	}

	public List<Producto> getCatalogo() {
		return catalogo;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}
}
