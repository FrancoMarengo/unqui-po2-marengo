package ar.edu.unq.po2.tp5;

public class Caja {

	private double montoTotalAPagar;
	
	public Caja() {
		super();
		this.setMontoTotalAPagar(0);
	}
    
	public void registrar(Producto producto) {
		producto.modificarStock();
		this.setMontoTotalAPagar(this.getMontoTotalAPagar() + producto.getPrecio());
	}
	
	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	private void setMontoTotalAPagar(double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}
	
	
}
