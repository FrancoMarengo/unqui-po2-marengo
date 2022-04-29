package ar.edu.unq.po2.tp4;

public class IngresosPercibidos {
	
    private int mesDePercepcion;
    private String concepto;
    private double montoPercibido;
    
    public IngresosPercibidos(int mesDePercepcion, String concepto, double montoPercibido) {
    	super();
    	this.setMesDePercepcion(mesDePercepcion);
    	this.setConcepto(concepto);
    	this.setMontoPercibido(montoPercibido);
    }
    
    public double getMontoImponible() {
    	return(this.getMontoPercibido());
    }
    
	public int getMesDePercepcion() {
		return mesDePercepcion;
	}

	private void setMesDePercepcion(int mesDePercepcion) {
		this.mesDePercepcion = mesDePercepcion;
	}

	public String getConcepto() {
		return concepto;
	}

	private void setConcepto(String concepto) {
		this.concepto = concepto;
	}

	public double getMontoPercibido() {
		return montoPercibido;
	}

	private void setMontoPercibido(double montoPercibido) {
		this.montoPercibido = montoPercibido;
	}
}
