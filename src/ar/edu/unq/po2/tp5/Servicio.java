package ar.edu.unq.po2.tp5;

public class Servicio extends Factura {
	
    private double costoUnidadConsumida;
    private double cantidadUnidadesConsumidas;
    
    public Servicio(double costoUnidadConsumida, int cantidadUnidadesConsumidas, Agencia agenciaRecaudadora) {
    	super(agenciaRecaudadora);
    	this.setCantidadUnidadesConsumidas(cantidadUnidadesConsumidas);
    	this.setCostoUnidadConsumida(costoUnidadConsumida);
    }
    
    public double getPrecio() {
    	return (this.getCostoUnidadConsumida() * this.getCantidadUnidadesConsumidas());
    }

	public double getCostoUnidadConsumida() {
		return costoUnidadConsumida;
	}

	public double getCantidadUnidadesConsumidas() {
		return cantidadUnidadesConsumidas;
	}

	private void setCostoUnidadConsumida(double costoUnidadConsumida) {
		this.costoUnidadConsumida = costoUnidadConsumida;
	}

	private void setCantidadUnidadesConsumidas(double cantidadUnidadesConsumidas) {
		this.cantidadUnidadesConsumidas = cantidadUnidadesConsumidas;
	}

}
