package ar.edu.unq.po2.tp3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp3.Point;
import ar.edu.unq.po2.tp3.Cuadrado;

public class CuadradoTest {

	private Cuadrado cuadrado;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		cuadrado = new Cuadrado((new Point(7, 10)), 5);
	}
	
	@Test
	public void creacionDeCuadradoTestCase() {
		Point esquinaSuperiorIzquierdaResultante = new Point(7, 10);
		Point esquinaSuperiorDerechaResultante = new Point((7+5), 10);
		Point esquinaInferiorIzquierdaResultante = new Point(7, (10-5));
		Point esquinaInferiorDerechaResultante = new Point((7+5), (10-5));
		
		assert(esquinaSuperiorIzquierdaResultante.sonMismoPunto(cuadrado.getEsquinaSuperiorIzquierda()));
		assert(esquinaSuperiorDerechaResultante.sonMismoPunto(cuadrado.getEsquinaSuperiorDerecha()));
		assert(esquinaInferiorIzquierdaResultante.sonMismoPunto(cuadrado.getEsquinaInferiorIzquierda()));
		assert(esquinaInferiorDerechaResultante.sonMismoPunto(cuadrado.getEsquinaInferiorDerecha()));
	}
	
	@Test
	public void calculoDeAreaDeCuadradoTestCase() {
		int areaResultante = (cuadrado.getLargoDeLados() * cuadrado.getLargoDeLados());
		
		assertEquals(areaResultante, cuadrado.area());
	}
	
	@Test
	public void calculoDePerimetroDeCuadradoTestCase() {
		int perimetroResultante = (4 * (cuadrado.getLargoDeLados()));
		
		assertEquals(perimetroResultante, cuadrado.perimetro());
	}
}
	
