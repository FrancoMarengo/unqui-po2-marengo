package ar.edu.unq.po2.tp6.tests;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.SolicitudCreditoPersonal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SolicitudCreditoPersonalTest {

	private SolicitudCreditoPersonal solicitud;
	private Cliente cliente1;
	private BancoClientes banco;
	
	@BeforeEach
	public void setUp() {
		banco = new BancoClientes();
		cliente1 = new Cliente("Juan", "Pastor", "Falsa 123", 25, 20000d, banco);
		solicitud = new SolicitudCreditoPersonal(cliente1, 12000d, 6);
	}
	
	@Test
	public void testCaseConocerAlClienteSolicitante() {
		assertEquals(solicitud.getCliente(), cliente1);
	}
}
