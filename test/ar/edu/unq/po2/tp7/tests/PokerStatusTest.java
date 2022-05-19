package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Carta;
import ar.edu.unq.po2.tp7.PokerStatus;

public class PokerStatusTest {

	private PokerStatus pokerStatus;
	private Carta queenDiamante;
	private Carta queenTrebol;
	private Carta queenCorazon;
	private Carta queenPica;
	private Carta cincoDiamante;
	private Carta asDiamante;
	private Carta sieteDiamante;
	private Carta kingDiamante;
	private Carta cuatroTrebol;
	
	@BeforeEach    
	public void setUp() {
		pokerStatus = new PokerStatus();// setUp
		queenDiamante = new Carta("Q", "D");
		queenTrebol = new Carta("Q", "T");
		queenCorazon = new Carta("Q", "C");
		queenPica = new Carta("Q", "P");
		cincoDiamante = new Carta("5", "D");
		asDiamante = new Carta("1", "D");
		sieteDiamante = new Carta("7", "D");
		kingDiamante = new Carta("K", "D");
		cuatroTrebol = new Carta("4", "T");
		
	}
	
	@Test
	public void testCaseVerificarPokerStatusPoker() throws Exception {
		assertEquals(pokerStatus.verificar(cincoDiamante, queenTrebol, queenCorazon, queenDiamante, queenPica),
				                           "Poker");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusColor() throws Exception {
		assertEquals(pokerStatus.verificar(queenDiamante, cincoDiamante, asDiamante, sieteDiamante, kingDiamante),
				                           "Color");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusTrio() throws Exception {
		assertEquals(pokerStatus.verificar(queenDiamante, queenTrebol, queenCorazon, cincoDiamante, asDiamante),
				                           "Trio");    // Verify
	}	
	
	@Test
	public void testCaseVerificarPokerStatusSinJuego() throws Exception {
		assertEquals(pokerStatus.verificar(queenDiamante, cincoDiamante, queenPica, cuatroTrebol, kingDiamante),
				                           "Nada");    // Verify
	}
	
	@Test
	public void testCaseVerificarPokerStatusConCartasRepetidas() {
		try {
			pokerStatus.verificar(queenDiamante, queenDiamante, cuatroTrebol, asDiamante, kingDiamante);    // Excercise
			fail("Se esperaba un error de cartas repetidas");
		} 
		catch (Exception e) {
			assertEquals(e.getMessage(), "Error, se encontraron cartas repetidas");    // Verify
		}
	}
	// En ninguno de los casos se realiza tearDown, se encarga de eso el GarbageCollector
}
