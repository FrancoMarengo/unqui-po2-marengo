package ar.edu.unq.po2.tp6;

public class SolicitudCreditoHipotecario extends SolicitudDeCredito {
	
	private PropiedadInmobiliaria propiedadGarantia;
	
	public SolicitudCreditoHipotecario(Cliente cliente, double monto, int plazo, PropiedadInmobiliaria propiedad) {
		super(cliente, monto, plazo);
		this.setPropiedadGarantia(propiedad);
	}
	
	public boolean esAceptable() {
		return(
				(this.getMonto() < (this.getCliente().getSueldoNetoMens() * 0.5)) &&
				(this.getMonto() < (this.getPropiedadGarantia().getValorFiscal() * 0.7)) &&
				((this.getCliente().getEdad() + (this.getPlazo() / 12)) < 65d)
			  );
	}

	public PropiedadInmobiliaria getPropiedadGarantia() {
		return propiedadGarantia;
	}

	private void setPropiedadGarantia(PropiedadInmobiliaria propiedadGarantia) {
		this.propiedadGarantia = propiedadGarantia;
	}

}
