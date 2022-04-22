package ar.edu.unq.po2.tp3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Rectangulo;

public class RectanguloTest {

	private Rectangulo rectangulo;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		rectangulo = new Rectangulo((new Point(2, 3)), 5, 2);
	}
	
	@Test
	public void creacionDeRectanguloTestCase() {
		Point esquinaSuperiorIzquierdaResultante = new Point(2, 3);
		Point esquinaSuperiorDerechaResultante = new Point((2+5), 3);
		Point esquinaInferiorIzquierdaResultante = new Point(2, (3-2));
		Point esquinaInferiorDerechaResultante = new Point((2+5), (3-2));
		
		assert(esquinaSuperiorIzquierdaResultante.sonMismoPunto(rectangulo.getEsquinaSuperiorIzquierda()));
		assert(esquinaSuperiorDerechaResultante.sonMismoPunto(rectangulo.getEsquinaSuperiorDerecha()));
		assert(esquinaInferiorIzquierdaResultante.sonMismoPunto(rectangulo.getEsquinaInferiorIzquierda()));
		assert(esquinaInferiorDerechaResultante.sonMismoPunto(rectangulo.getEsquinaInferiorDerecha()));
		
	}
	
	@Test
	public void calculoDeAreaDeRectanguloTestCase() {
		int areaResultante = rectangulo.getAlto() * rectangulo.getAncho();
		
		assertEquals(areaResultante, rectangulo.area());
	}
	
	@Test
	public void calculoDePerimetroDeRectanguloTestCase() {
		int perimetroResultante = (2 * (rectangulo.getAncho() + rectangulo.getAlto()));
		
		assertEquals(perimetroResultante, rectangulo.perimetro());
	}
	
	@Test
	public void rectanguloHorizontalOVerticalTestCase() {
		assertTrue(rectangulo.esHorizontal());
		assertFalse(rectangulo.esVertical());
	}
}
