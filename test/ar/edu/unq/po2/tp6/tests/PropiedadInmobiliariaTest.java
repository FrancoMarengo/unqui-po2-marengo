package ar.edu.unq.po2.tp6.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp6.PropiedadInmobiliaria;

public class PropiedadInmobiliariaTest {

	private PropiedadInmobiliaria propiedad;
	
	@BeforeEach
	public void setUp() {
		propiedad = new PropiedadInmobiliaria("Casa", "Calle 1 22", 500d);
	}
	
	@Test
	public void testCaseObtenerDescripcion() {
		assertEquals("Casa", propiedad.getDescripcion());
	}
	
	@Test
	public void testCaseObtenerDireccion() {
		assertEquals("Calle 1 22", propiedad.getDireccion());
	}
	
	@Test
	public void testCaseObtenerValorFiscal() {
		assertEquals(500d, propiedad.getValorFiscal());
	}
}
