package ar.edu.unq.po2.tp5.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp5.Caja;
import ar.edu.unq.po2.tp5.Producto;
import ar.edu.unq.po2.tp5.ProductoDeCooperativa;

public class CajaTest {
	
    private Producto vino;
    private ProductoDeCooperativa vinoDeCooperativa;
    private Caja caja1;
    
    @BeforeEach
    public void setUp() throws Exception {
    	vino = new Producto(100d, 20);
    	vinoDeCooperativa = new ProductoDeCooperativa(100d, 23);
    	caja1 = new Caja();
    }
    
    @Test
    public void testCaseRegistrarProductoYBajarStock() {
    	caja1.registrar(vino);
    	caja1.registrar(vinoDeCooperativa);
    	assertEquals(19, vino.getStock());
    	assertEquals(22, vinoDeCooperativa.getStock());
    }
    
    @Test
    public void testCaseObtenerMontoTotalAPagar() {
    	caja1.registrar(vino);
    	caja1.registrar(vinoDeCooperativa);
    	assertEquals(caja1.getMontoTotalAPagar(), 190d);
    }
}
