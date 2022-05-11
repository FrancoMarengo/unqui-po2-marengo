package ar.edu.unq.po2.tp5;

public class Caja {

	private double montoTotalAPagar;
	
	public Caja() {
		super();
		this.setMontoTotalAPagar(0);
	}
    
	public void registrar(Pagable pagable) {
		pagable.registrar();
		this.setMontoTotalAPagar(this.getMontoTotalAPagar() + pagable.getPrecio());
	}
	
	public double getMontoTotalAPagar() {
		return montoTotalAPagar;
	}

	private void setMontoTotalAPagar(double montoTotalAPagar) {
		this.montoTotalAPagar = montoTotalAPagar;
	}
	
	
}
