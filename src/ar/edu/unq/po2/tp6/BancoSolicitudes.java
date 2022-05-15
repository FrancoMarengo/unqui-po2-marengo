package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class BancoSolicitudes {

	private BancoClientes banco;
	private List<SolicitudDeCredito> solicitudesDeCredito;
	
	public BancoSolicitudes(BancoClientes banco) {
		super();
		this.setBanco(banco);
		this.setSolicitudesDeCredito(new ArrayList<SolicitudDeCredito>());
	}
	
	public void registrarSolicitudDeCredito(SolicitudDeCredito solicitud) {
		solicitudesDeCredito.add(solicitud);
	}
	
	public double montoADesembolsar() {
		double montoADesembolsarPorAhora = 0d;
		for(SolicitudDeCredito solicitud:solicitudesDeCredito) {
			if(solicitud.esAceptable()) {
				montoADesembolsarPorAhora = montoADesembolsarPorAhora + solicitud.getMonto();
			}
		}
		return(montoADesembolsarPorAhora);
	}
	
	public void verificarSiguienteSolicitud() {
		SolicitudDeCredito siguienteSolicitud = solicitudesDeCredito.get(0);
		if(siguienteSolicitud.esAceptable()) {
			banco.otorgarCredito(siguienteSolicitud, siguienteSolicitud.getCliente());
		}
	}

	public BancoClientes getBanco() {
		return banco;
	}

	private void setBanco(BancoClientes banco) {
		this.banco = banco;
	}

	public List<SolicitudDeCredito> getSolicitudesDeCredito() {
		return solicitudesDeCredito;
	}

    private void setSolicitudesDeCredito(List<SolicitudDeCredito> solicitudesDeCredito) {
		this.solicitudesDeCredito = solicitudesDeCredito;
	}
}
