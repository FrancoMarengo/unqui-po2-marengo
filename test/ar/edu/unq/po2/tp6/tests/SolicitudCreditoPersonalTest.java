package ar.edu.unq.po2.tp6.tests;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;
import ar.edu.unq.po2.tp6.SolicitudCreditoPersonal;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class SolicitudCreditoPersonalTest {

	private SolicitudCreditoPersonal solicitudAceptable;
	private Cliente cliente1;
	private BancoClientes banco;
	private Cliente cliente2;
	private SolicitudCreditoPersonal solicitudNoAceptable;
	
	@BeforeEach
	public void setUp() {
		banco = new BancoClientes();
		cliente1 = new Cliente("Juan", "Pastor", "Falsa 123", 25, 20000d, banco);
		cliente2 = new Cliente("Pepe", "Gomez", "Falsa 234", 29, 1000d, banco); 
		solicitudAceptable = new SolicitudCreditoPersonal(cliente1, 12000d, 6);
		solicitudNoAceptable = new SolicitudCreditoPersonal(cliente2, 50000d, 8);
	}
	
	@Test
	public void testCaseEsAceptable() {
		assertTrue(solicitudAceptable.esAceptable());
	}
	
	@Test
	public void testCaseNoEsAceptable() {
		assertFalse(solicitudNoAceptable.esAceptable());
	} 
}
