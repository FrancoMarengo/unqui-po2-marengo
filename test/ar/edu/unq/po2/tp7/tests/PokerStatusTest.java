package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.PokerStatus;

public class PokerStatusTest {

	private PokerStatus pokerStatus;
	
	@BeforeEach    
	public void setUp() {
		pokerStatus = new PokerStatus();    // setUp
	}
	
	@Test
	public void testCaseVerificarPokerStatusConPoker() throws Exception {
		assertTrue(pokerStatus.verificar("QD", "QT", "QC", "5D", "QP"));    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusSinPoker() throws Exception {
		assertFalse(pokerStatus.verificar("QD", "6T", "KT", "1C", "QT"));    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusConPokerRepetidas() throws Exception {
		try {
			pokerStatus.verificar("QD", "QD", "QD", "QD", "QP");    // Excercise
			fail("Error esperado");
		}
		catch (Exception e) {
			assertEquals(e.getMessage(), "Error, se encontraron cartas repetidas");    // Verify
		}
	}
	
	@Test
	public void testCaseVerificarPokerStatusSinPokerConRepetidas() throws Exception {
		try {
			pokerStatus.verificar("QD", "QD", "2D", "5T", "KC");    // Excercise
			fail("Error esperado");
		}
		catch (Exception e) {
			assertEquals(e.getMessage(), "Error, se encontraron cartas repetidas");    // Verify
		}
	}
	// En ninguno de los casos se realiza tearDown, se encarga de eso el GarbageCollector
}
