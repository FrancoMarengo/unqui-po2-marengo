package ar.edu.unq.po2.tp5;

public class Impuesto extends Factura {
	
    private double tasaDelServicio;
    
    public Impuesto(double tasa, Agencia agenciaRecaudadora) {
    	super(agenciaRecaudadora);
    	this.setTasaDelServicio(tasa);
    }
    
	public double getPrecio() {
		return tasaDelServicio;
	}

	private void setTasaDelServicio(double tasaDelServicio) {
		this.tasaDelServicio = tasaDelServicio;
	}   
}
