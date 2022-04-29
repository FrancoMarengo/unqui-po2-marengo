package ar.edu.unq.po2.tp4.tests;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp4.IngresoHorasExtras;
import ar.edu.unq.po2.tp4.IngresosPercibidos;
import ar.edu.unq.po2.tp4.Trabajador;

public class TrabajadorTest {
    private Trabajador trabajadorA;
    private IngresosPercibidos ingresosPercibidos10;
    private IngresoHorasExtras ingresoHorasExtras10;
    private ArrayList<IngresosPercibidos> ingresosPercibidosAnuales20;
    
    @BeforeEach
    public void setUp() throws Exception {
    	
    	ingresosPercibidosAnuales20 = new ArrayList<IngresosPercibidos>();
    	ingresosPercibidos10 = new IngresosPercibidos(3, "Pago", 10d);
    	ingresoHorasExtras10 = new IngresoHorasExtras(12, "Horas extra", 10d, 3);
    	
    	ingresosPercibidosAnuales20.add(ingresosPercibidos10);
    	ingresosPercibidosAnuales20.add(ingresoHorasExtras10);
    	
    	trabajadorA = new Trabajador(ingresosPercibidosAnuales20);
    }
    
    @Test
    public void testCaseCalcularTotalPercibido() {
    	assertEquals(trabajadorA.getTotalPercibido(), 20d);
    }
    
    @Test
    public void testCaseCalcularMontoImponible() {
    	assertEquals(trabajadorA.getMontoImponible(), 10d);
    }
    
    @Test
    public void testCaseCalcularImpuestoAPagar() {
    	assertEquals(trabajadorA.getImpuestoAPagar(), 0.2d);
    }
}
