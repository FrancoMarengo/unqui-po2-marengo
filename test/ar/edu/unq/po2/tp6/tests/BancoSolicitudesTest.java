package ar.edu.unq.po2.tp6.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.BancoSolicitudes;
import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.SolicitudCreditoPersonal;
import ar.edu.unq.po2.tp6.SolicitudDeCredito;

public class BancoSolicitudesTest {

	private BancoSolicitudes bancoSolicitudes;
	private BancoClientes bancoClientes;
	private SolicitudCreditoPersonal solicitudDeCredito;
	private Cliente cliente;
	
	@BeforeEach
	public void setUp() {
		bancoClientes = new BancoClientes();
		cliente = new Cliente("Juan", "Ramos", "Corrientes 1100", 56, 5000d, bancoClientes);
		bancoSolicitudes = new BancoSolicitudes(bancoClientes);
		solicitudDeCredito = new SolicitudCreditoPersonal(cliente, 500d, 6);
	}
	
	@Test
	public void testCaseRegistrarSolicitud() {
		bancoSolicitudes.registrarSolicitudDeCredito(solicitudDeCredito);
		assertTrue(bancoSolicitudes.getSolicitudesDeCredito().contains(solicitudDeCredito));
	}
	
	@Test
	public void testCaseCalcularMontoADesembolsar() {
		bancoSolicitudes.registrarSolicitudDeCredito(solicitudDeCredito);
		assertEquals(bancoSolicitudes.montoADesembolsar(), 500d);
	}
	
	@Test
	public void testCaseObtenerSolicitudesDeCredito() {
		bancoSolicitudes.registrarSolicitudDeCredito(solicitudDeCredito);
		ArrayList<SolicitudDeCredito> solicitudesEsperadas = new ArrayList<SolicitudDeCredito>();
		solicitudesEsperadas.add(solicitudDeCredito);
		assertEquals(solicitudesEsperadas, bancoSolicitudes.getSolicitudesDeCredito());
	}
	
	@Test
	public void testCaseObtenerBancoDeClientes() {
		assertEquals(bancoClientes, bancoSolicitudes.getBanco());
	}
}
