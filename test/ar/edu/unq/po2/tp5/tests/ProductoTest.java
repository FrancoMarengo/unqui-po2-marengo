package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.Producto;

public class ProductoTest {
	
    private Producto vino;
    private Producto arroz;
    
    @BeforeEach
    public void setUp() throws Exception {
    	vino = new Producto(100d, 20);
    	arroz = new Producto(30d, 50);
    }
    
    @Test
    public void testCaseObtenerStockDeProducto() {
    	assertEquals(20, vino.getStock());
    	assertEquals(50, arroz.getStock());
    }
    
    @Test
    public void testCaseObtenerPrecioDeProducto() {
    	assertEquals(100d, vino.getPrecio());
    	assertEquals(30d, arroz.getStock());
    }
    
    @Test
    public void testCaseModificarStockDeProducto() {
    	vino.modificarStock();
    	arroz.modificarStock();
    	assertEquals(vino.getStock(), 19);
    	assertEquals(arroz.getStock(), 49);
    }
}
