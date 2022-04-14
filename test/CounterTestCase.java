import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp3.Counter;

public class CounterTestCase {
	private Counter counter;
	/**
	 * Crea un escenario de test b�sico, que consiste en un contador
	 * con 10 enteros
	 *
	 * @throws Exception
	 */
	@BeforeEach
	public void setUp() throws Exception {
		// Se crea el contador
		counter = new Counter();
		
		// Se agregan los numeros. Un solo par y nueve impares
		counter.addNumber(1);
		counter.addNumber(3);
		counter.addNumber(5);
		counter.addNumber(7);
		counter.addNumber(9);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(1);
		counter.addNumber(4);
	}
	
	
	// Verifica la cantidad de pares 
	
	@Test
	public void testNumerosPares() {
		
		int cantidadPares = counter.cantidadPares();
		
		assertEquals(cantidadPares, 1);    
	}
	
	// Verifica la cantidad de impares pero usando el assert
	@Test
	public void testNumerosImpares() {
		
		int cantidadImpares = counter.cantidadImpares();
		
		assert(cantidadImpares == 9);    
	}
	
	// Verifica la cantidad de multiplos de 8
	@Test
	public void testNumerosMultiplosDe8() {
		
		int cantidadMultiplos8 = counter.cantidadDeMultiplosDe(8);
		
		assert(cantidadMultiplos8 == 6);
	}
}
