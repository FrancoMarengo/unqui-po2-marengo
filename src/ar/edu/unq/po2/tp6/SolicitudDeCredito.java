package ar.edu.unq.po2.tp6;

public abstract class SolicitudDeCredito {

	private Cliente cliente;
	private double monto;
	private int plazo;
	
	public SolicitudDeCredito(Cliente cliente, double monto, int plazo) {
		super();
		this.setCliente(cliente);
		this.setMonto(monto);
		this.setPlazo(plazo);
	}
	
	public abstract boolean esAceptable();
	
	public double montoCuotaMensual() {
		return (this.getMonto() / this.getPlazo());
	}

	public Cliente getCliente() {
		return cliente;
	}

	private void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public double getMonto() {
		return monto;
	}

	private void setMonto(double monto) {
		this.monto = monto;
	}

	public int getPlazo() {
		return plazo;
	}

	private void setPlazo(int plazo) {
		this.plazo = plazo;
	}
}
