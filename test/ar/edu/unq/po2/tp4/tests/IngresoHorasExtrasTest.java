package ar.edu.unq.po2.tp4.tests;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp4.IngresoHorasExtras;

public class IngresoHorasExtrasTest {
    private IngresoHorasExtras ingresoHorasExtras50;
    
    @BeforeEach
    public void setUp() throws Exception {
    	ingresoHorasExtras50 = new IngresoHorasExtras(9, "Horas extra", 50d, 10);
    }
    
    @Test
    public void testCaseObtenerMesDePercepcion() {
    	assertEquals(ingresoHorasExtras50.getMesDePercepcion(), 9);
    }
    
    @Test
    public void testCaseObtenerConcepto() {
    	assertEquals(ingresoHorasExtras50.getConcepto(), "Horas extra");
    }
    
    @Test
    public void testCaseCalcularMontoPercibido() {
    	assertEquals(ingresoHorasExtras50.getMontoPercibido(), new Double(50d));
    }
    
    @Test
    public void testCaseCalcularMontoImponible() {
    	assertEquals(ingresoHorasExtras50.getMontoImponible(), 0d);
    }
    
    @Test
    public void testCaseCalcularCantidadHorasExtras() {
    	assertEquals(ingresoHorasExtras50.getCantidadDeHorasExtras(), 10);
    }
}