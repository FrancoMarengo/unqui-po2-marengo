package ar.edu.unq.po2.tp6;

import java.util.ArrayList;
import java.util.List;

public class BancoClientes {

	private List<Cliente> clientes;
	
	public BancoClientes() {
		super();
		this.setClientes(new ArrayList<Cliente>());
	}
	
	public void registrar(Cliente cliente) {
		clientes.add(cliente);
	}
	
	public void otorgarCredito(SolicitudDeCredito solicitud, Cliente cliente) {
		// otorga el credito al cliente, implementación desconocida
	}

	public List<Cliente> getClientes() {
		return clientes;
	}

	private void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}
}
