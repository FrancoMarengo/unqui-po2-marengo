package ar.edu.unq.po2.tp3.tests;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Multioperador;

public class MultioperadorTest {
	
	private Multioperador multioperador;
	
	@BeforeEach
	public void setUp() throws Exception {
		
		// Se crea un nuevo contador
		multioperador = new Multioperador();
		
		// Se agregan al array 5 números
		multioperador.agregarAlArray(1);
		multioperador.agregarAlArray(2);
		multioperador.agregarAlArray(3);
		multioperador.agregarAlArray(4);
		multioperador.agregarAlArray(5);
		
	}
	
	@Test
	public void sumaMultioperadorTestCase() {
		int sumaFinal = multioperador.sumaArray();
		
		assertEquals(sumaFinal, 15);
	}
	
	@Test
	public void restaMultioperadorTestCase() {
		int restaFinal = multioperador.restaArray();
		
		assertEquals(restaFinal, -15);
	}
	
	@Test
	public void multiplicacionMultioperadorTestCase() {
		int multiplicacionFinal = multioperador.multiplicacionArray();
		
		assertEquals(multiplicacionFinal, 120);
	}
}
