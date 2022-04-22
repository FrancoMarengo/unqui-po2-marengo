package ar.edu.unq.po2.tp4;

public class ProductoPrimeraNecesidad extends Producto {
    
	public ProductoPrimeraNecesidad(String nombre, double precio, boolean esPrecioCuidado) {
		super(nombre, (precio * 0.9), esPrecioCuidado);
	}
	
}
