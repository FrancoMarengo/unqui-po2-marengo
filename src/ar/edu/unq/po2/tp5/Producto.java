package ar.edu.unq.po2.tp5;

public class Producto implements Pagable{
	
    private double precio;
    private int stock;
    
    public Producto(double precio, int stock) {
    	super();
    	this.setStock(stock);
    	this.setPrecio(precio);
    }
    
    public void registrar() {
    	this.setStock(this.getStock() - 1);
    }
    
	public double getPrecio() {
		return precio;
	}

	private void setPrecio(double precio) {
		this.precio = precio;
	}

	public int getStock() {
		return stock;
	}

	private void setStock(int stock) {
		this.stock = stock;
	}
}
