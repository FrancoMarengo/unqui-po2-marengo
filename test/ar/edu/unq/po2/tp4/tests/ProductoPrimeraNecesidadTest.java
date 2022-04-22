package ar.edu.unq.po2.tp4.tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp4.ProductoPrimeraNecesidad;

public class ProductoPrimeraNecesidadTest {

	private ProductoPrimeraNecesidad leche;
	private ProductoPrimeraNecesidad harinaCon20PorcientoDescuento;
	
	@BeforeEach
	public void setUp() {
		leche = new ProductoPrimeraNecesidad("Leche", 8d, false);
		harinaCon20PorcientoDescuento = new ProductoPrimeraNecesidad("Harina", 10d, false, 0.8);
	}
	
	@Test
	public void testCalcularPrecio() {
		assertEquals(new Double(7.2), leche.getPrecio());
	}
	
	@Test
	public void testCalcularPrecioConDescuento() {
		assertEquals(new Double(8d), harinaCon20PorcientoDescuento.getPrecio());
	}
}