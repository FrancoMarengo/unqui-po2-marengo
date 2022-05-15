package ar.edu.unq.po2.tp6;

public class PropiedadInmobiliaria {
	
	private String descripcion;
	private String direccion;
	private double valorFiscal;
	
	public PropiedadInmobiliaria(String descripcion, String direccion, double valorFiscal) {
		super();
		this.setDescripcion(descripcion);
		this.setDireccion(direccion);
		this.setValorFiscal(valorFiscal);
	}

	public String getDescripcion() {
		return descripcion;
	}

	private void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDireccion() {
		return direccion;
	}

	private void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public double getValorFiscal() {
		return valorFiscal;
	}

	private void setValorFiscal(double valorFiscal) {
		this.valorFiscal = valorFiscal;
	}

}
