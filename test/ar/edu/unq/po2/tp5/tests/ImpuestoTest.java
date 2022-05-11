package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.AgenciaFalsa;
import ar.edu.unq.po2.tp5.Impuesto;

public class ImpuestoTest {
    
	private AgenciaFalsa agencia;
	private Impuesto unImpuesto;
	
	@BeforeEach
	public void setUp() throws Exception {
		agencia = new AgenciaFalsa();
		unImpuesto = new Impuesto(10d, agencia);
	}
	
	@Test
	public void testCaseObtenerTasaDeImpuesto() {
		assertEquals(10d, unImpuesto.getPrecio());
	}
}
