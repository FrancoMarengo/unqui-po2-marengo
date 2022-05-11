package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp5.AgenciaFalsa;
import ar.edu.unq.po2.tp5.Servicio;

public class ServicioTest {
    
	private AgenciaFalsa agencia;
	private Servicio unServicio;
	
	@BeforeEach
	public void setUp() throws Exception {
		agencia = new AgenciaFalsa();
		unServicio = new Servicio(10d, 10, agencia);
	}
	
	@Test
	public void testCaseObtenerTasaDeImpuesto() {
		assertEquals(100d, unServicio.getPrecio());
	}
}
