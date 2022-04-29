package ar.edu.unq.po2.tp4.tests;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp4.IngresosPercibidos;

public class IngresosPercibidosTest {
	
    private IngresosPercibidos ingresoPercibido100;
    
    @BeforeEach
    public void setUp() throws Exception {
    	ingresoPercibido100 = new IngresosPercibidos(5, "Pago", 100d);
    }
    
    @Test
    public void testCaseObtenerMesDePercepcion() {
    	assertEquals(ingresoPercibido100.getMesDePercepcion(), 5);
    }

    @Test
    public void testCaseObtenerConcepto() {
    	assertEquals(ingresoPercibido100.getConcepto(), "Pago");
    }
    
    @Test
    public void testCaseCalcularMontoPercibido() {
    	assertEquals(ingresoPercibido100.getMontoPercibido(), 100d);
    }
    
    @Test
    public void testCaseCalcularMontoImponible() {
    	assertEquals(ingresoPercibido100.getMontoImponible(), 100d);
    }
}
