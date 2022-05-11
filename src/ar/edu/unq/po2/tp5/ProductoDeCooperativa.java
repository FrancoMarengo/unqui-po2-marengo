package ar.edu.unq.po2.tp5;

public class ProductoDeCooperativa extends Producto {
    
	public ProductoDeCooperativa(double precio, int stock) {
		super(precio, stock);
	}
	
	public double getPrecio() {
		return (super.getPrecio() * 0.9);
	}
}
