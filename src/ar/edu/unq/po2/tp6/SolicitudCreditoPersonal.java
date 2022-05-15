package ar.edu.unq.po2.tp6;

public class SolicitudCreditoPersonal extends SolicitudDeCredito {

	public SolicitudCreditoPersonal(Cliente cliente, double monto, int plazo) {
		super(cliente, monto, plazo);
	}
	
	public boolean esAceptable() {
		return(
			   (
				((this.getCliente().sueldoNetoAnual())>= 15000d) &&
				(this.getMonto() < (this.getCliente().getSueldoNetoMens() * 0.7))
			   )
			  );
	}
}
