package ar.edu.unq.po2.tp4;

import java.util.ArrayList;
import java.util.List;

public class Trabajador {
	
    private List<IngresosPercibidos> ingresosPercibidosAnuales;
    
    public Trabajador(ArrayList<IngresosPercibidos> ingresosPercibidosAnuales20) {
    	super();
    	this.setIngresosPercibidosAnuales(ingresosPercibidosAnuales20);
    }
    
    public double getTotalPercibido() {
    	double totalPercibidoHastaAhora = 0d;
    	for(IngresosPercibidos ingresoPercibidoMensual:ingresosPercibidosAnuales) {
    		totalPercibidoHastaAhora = totalPercibidoHastaAhora + ingresoPercibidoMensual.getMontoPercibido();
    	}
    	return totalPercibidoHastaAhora;
    }
    
    public double getMontoImponible() {
    	double montoImponibleHastaAhora = 0d;
    	for(IngresosPercibidos ingresoPercibidoMensual:ingresosPercibidosAnuales) {
    		montoImponibleHastaAhora = montoImponibleHastaAhora + ingresoPercibidoMensual.getMontoImponible();
    	}
    	return montoImponibleHastaAhora;
    }
    
    public double getImpuestoAPagar() {
    	return (this.getMontoImponible() * 0.02d);
    }
    
	public List<IngresosPercibidos> getIngresosPercibidosAnuales() {
		return ingresosPercibidosAnuales;
	}

	private void setIngresosPercibidosAnuales(List<IngresosPercibidos> ingresosPercibidosAnuales) {
		this.ingresosPercibidosAnuales = ingresosPercibidosAnuales;
	}
}
