package ar.edu.unq.po2.tp6.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.BancoClientes;
import ar.edu.unq.po2.tp6.Cliente;

public class BancoClientesTest {

	private BancoClientes banco;
	private Cliente cliente;

	@BeforeEach
	public void setUp() {
	
	banco = new BancoClientes();
	cliente = new Cliente("Juan", "Ramos", "Corrientes 1100", 56, 5000d, banco);
	}
	
	@Test
	public void testCaseRegistrarClientes() {
		banco.registrar(cliente);
		assertTrue(banco.getClientes().contains(cliente));
	}
}
