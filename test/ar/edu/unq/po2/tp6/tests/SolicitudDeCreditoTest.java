package ar.edu.unq.po2.tp6.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.SolicitudCreditoHipotecario;
import ar.edu.unq.po2.tp6.SolicitudCreditoPersonal;

public class SolicitudDeCreditoTest {

	private SolicitudCreditoPersonal solicitudPersonal;
	private PropiedadInmobiliaria propiedad;
	private SolicitudCreditoHipotecario solicitudHipotecaria;
	private Cliente cliente1;
	private BancoClientes banco;
	
	
	@BeforeEach
	public void setUp() {
		banco = new BancoClientes();
		cliente1 = new Cliente("Juan", "Pastor", "Falsa 123", 25, 20000d, banco);
		solicitudPersonal = new SolicitudCreditoPersonal(cliente1, 20000d, 5);
		propiedad = new PropiedadInmobiliaria("Casa", "Falsa 567", 13000d);
		solicitudHipotecaria = new SolicitudCreditoHipotecario(cliente1, 20000d, 4, propiedad);
	}
	
	@Test
	public void testCaseConocerClienteDeSolicitud() {
		assertEquals(cliente1, solicitudPersonal.getCliente());
		assertEquals(cliente1, solicitudHipotecaria.getCliente());
	}
	
	@Test
	public void testCaseCalcularMontoDeCuotaMensual() {
		assertEquals(4000d, solicitudPersonal.montoCuotaMensual());
		assertEquals(5000d, solicitudHipotecaria.montoCuotaMensual());
	}
	
	@Test
	public void testCaseConocerMontoTotalPedido() {
		assertEquals(20000d, solicitudPersonal.getMonto());
		assertEquals(20000d, solicitudHipotecaria.getMonto());
	}
	
	@Test
	public void testCaseConocerPlazoMensual() {
		assertEquals(5, solicitudPersonal.getPlazo());
		assertEquals(4, solicitudHipotecaria.getPlazo());
	}
	
}
