package ar.edu.unq.po2.tp3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Point;

public class PointTest {
	
	@Test
	public void inicializacionXYPointTestCase() {
		Point puntoResultante = new Point(2, 4);
		
		assertEquals(puntoResultante.getX(), 2);
		assertEquals(puntoResultante.getY(), 4);
	}
	
	@Test
	public void inicializacionSinXYPointTestCase() {
        Point puntoResultante = new Point();
		
		assertEquals(puntoResultante.getX(), 0);
		assertEquals(puntoResultante.getY(), 0);
	}
	
	@Test
	public void moverPuntoXYTestCase() {
		Point unPunto = new Point();
		unPunto.moverPunto(2, 5);
		
		assertEquals(unPunto.getX(), 2);
		assertEquals(unPunto.getY(), 5);
	}
	
	@Test
	public void sumarPuntosTestCase() {
		Point unPunto = new Point(2, 3);
		Point otroPunto = new Point(1, 2);
		Point puntoResultante = unPunto.sumarPuntos(otroPunto);
		
		assertEquals(puntoResultante.getX(), 3);
		assertEquals(puntoResultante.getY(), 5);
	}
}
