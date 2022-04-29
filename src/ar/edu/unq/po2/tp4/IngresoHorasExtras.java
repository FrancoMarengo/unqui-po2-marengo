package ar.edu.unq.po2.tp4;

public class IngresoHorasExtras extends IngresosPercibidos {
    
	private int cantidadDeHorasExtras;
	
	public IngresoHorasExtras(int mesDePercepcion, String concepto, double montoPercibido, int cantidadDeHorasExtras) {
		super(mesDePercepcion, concepto, montoPercibido);
		this.setCantidadDeHorasExtras(cantidadDeHorasExtras);
	}
    
	public double getMontoImponible() {
		return 0d;
	}
	
	public int getCantidadDeHorasExtras() {
		return cantidadDeHorasExtras;
	}

	private void setCantidadDeHorasExtras(int cantidadDeHorasExtras) {
		this.cantidadDeHorasExtras = cantidadDeHorasExtras;
	}
}
