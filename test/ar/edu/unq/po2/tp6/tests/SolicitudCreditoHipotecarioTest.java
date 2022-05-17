package ar.edu.unq.po2.tp6.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.PropiedadInmobiliaria;
import ar.edu.unq.po2.tp6.SolicitudCreditoHipotecario;

public class SolicitudCreditoHipotecarioTest {

	private PropiedadInmobiliaria propiedad;
	private SolicitudCreditoHipotecario solicitudHipotecariaAceptable;
	private SolicitudCreditoHipotecario solicitudHipotecariaNoAceptable;
	private Cliente cliente1;
	private BancoClientes banco;
	
	
	@BeforeEach
	public void setUp() {
		banco = new BancoClientes();
		cliente1 = new Cliente("Juan", "Pastor", "Falsa 123", 25, 20000d, banco);
		propiedad = new PropiedadInmobiliaria("Casa", "Falsa 567", 13000d);
		solicitudHipotecariaAceptable = new SolicitudCreditoHipotecario(cliente1, 1000d, 4, propiedad);
		solicitudHipotecariaNoAceptable = new SolicitudCreditoHipotecario(cliente1, 50000d, 6, propiedad);
	}
	
	@Test
	public void testCaseSolicitudAceptable() {
		assertTrue(solicitudHipotecariaAceptable.esAceptable());
	}
	
	@Test
	public void testCaseSolicitudNoAceptable() {
		assertFalse(solicitudHipotecariaNoAceptable.esAceptable());
	}
	
	@Test
	public void testCaseConocerPropiedadDeSolicitud() {
		assertEquals(solicitudHipotecariaAceptable.getPropiedadGarantia(), propiedad);
	}
}
