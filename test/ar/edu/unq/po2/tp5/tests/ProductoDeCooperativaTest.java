package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.ProductoDeCooperativa;

public class ProductoDeCooperativaTest {
    
	private ProductoDeCooperativa vinoDeCooperativa;
	private ProductoDeCooperativa arrozDeCooperativa;
	
	@BeforeEach
	public void setUp() throws Exception {
		vinoDeCooperativa = new ProductoDeCooperativa(100d, 20);
		arrozDeCooperativa = new ProductoDeCooperativa(10d, 40);
	}
	
	@Test
	public void testCaseObtenerStockDeProducto() {
        assertEquals(20, vinoDeCooperativa.getStock());
        assertEquals(40, arrozDeCooperativa.getStock());
	}
	
	@Test
	public void testCaseObtenerPrecioDeProductoConDescuento() {
		assertEquals(90d, vinoDeCooperativa.getPrecio());
		assertEquals(9d, arrozDeCooperativa.getPrecio());
	}
	
	@Test
	public void testCaseModificarStockDeProducto() {
		vinoDeCooperativa.registrar();
		arrozDeCooperativa.registrar();
		assertEquals(19, vinoDeCooperativa.getStock());
        assertEquals(39, arrozDeCooperativa.getStock());
	}
}
