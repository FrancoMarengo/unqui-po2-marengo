package ar.edu.unq.po2.tp6.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;

import org.junit.jupiter.api.BeforeEach;

public class ClienteTest {

	private Cliente cliente1;
	private BancoClientes banco;
	
	@BeforeEach
	public void setUp() {
		banco = new BancoClientes();
		cliente1 = new Cliente("Juan", "Pastor", "Falsa 123", 25, 20000d, banco);
	}
	
	@Test
	public void testCaseObtenerNombreDeCliente() {
		assertEquals(cliente1.getNombre(), "Juan");
	}
	
	@Test
	public void testCaseObtenerApellidoDeCliente() {
		assertEquals(cliente1.getApellido(), "Pastor");
	}
	
	@Test
	public void testCaseObtenerDireccionDeCliente() {
		assertEquals(cliente1.getDireccion(), "Falsa 123");
	}
	
	@Test
	public void testCaseObtenerEdadDeCliente() {
		assertEquals(cliente1.getEdad(), 25);
	}
	
	@Test
	public void testCaseObtenerSueldoMensualNetoDeCliente() {
		assertEquals(cliente1.getSueldoNetoMens(), 20000d);
	}
	
	@Test
	public void testCaseObtenerSueldoNetoAnualDeCliente() {
		double sueldoNetoAnualEsperado = 20000d * 12;
		assertEquals(sueldoNetoAnualEsperado, cliente1.sueldoNetoAnual());
	}
}
