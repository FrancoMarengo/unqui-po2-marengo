package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;


import ar.edu.unq.po2.tp7.Carta;
import ar.edu.unq.po2.tp7.PokerStatus;

public class PokerStatusTestDouble {

	private PokerStatus pokerStatus;
	private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;
	
	@BeforeEach
	public void setUp() {
		pokerStatus = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	
	@Test
	public void testCaseVerificarPokerStatusPoker() throws Exception {
		when(carta1.getValor()).thenReturn("Q");
		when(carta2.getValor()).thenReturn("Q");
		when(carta3.getValor()).thenReturn("T");
		when(carta4.getValor()).thenReturn("Q");
		when(carta5.getValor()).thenReturn("Q");
		
		String resultadoEsperado = pokerStatus.verificar(carta5, carta4, carta3, carta2, carta1);
		
		assertEquals(resultadoEsperado, "Poker");
	}
	
	@Test
	public void testCaseVerificarPokerStatusColor() throws Exception {
		when(carta1.getPalo()).thenReturn("C");
		when(carta2.getPalo()).thenReturn("C");
		when(carta3.getPalo()).thenReturn("C");
		when(carta4.getPalo()).thenReturn("C");
		when(carta5.getPalo()).thenReturn("C");
		
		String resultadoEsperado = pokerStatus.verificar(carta5, carta4, carta3, carta2, carta1);
		
		assertEquals(resultadoEsperado, "Color");
	}
	
	@Test
	public void testCaseVerificarPokerStatusTrio() throws Exception {
		when(carta1.getValor()).thenReturn("1");
		when(carta2.getValor()).thenReturn("5");
		when(carta3.getValor()).thenReturn("1");
		when(carta4.getValor()).thenReturn("10");
		when(carta5.getValor()).thenReturn("1");
		
		String resultadoEsperado = pokerStatus.verificar(carta5, carta4, carta3, carta2, carta1);
		
		assertEquals(resultadoEsperado, "Trio");
	}	
	
	@Test
	public void testCaseVerificarPokerStatusSinJuego() throws Exception {
		when(carta1.getValor()).thenReturn("1");
		when(carta2.getValor()).thenReturn("2");
		when(carta3.getValor()).thenReturn("3");
		when(carta4.getValor()).thenReturn("4");
		when(carta5.getValor()).thenReturn("5");
		when(carta1.getPalo()).thenReturn("D");
		when(carta2.getPalo()).thenReturn("T");
		when(carta3.getPalo()).thenReturn("C");
		when(carta4.getPalo()).thenReturn("P");
		when(carta5.getPalo()).thenReturn("T");
		
		String resultadoEsperado = pokerStatus.verificar(carta5, carta4, carta3, carta2, carta1);
		
		assertEquals(resultadoEsperado, "Nada");
	}
	
	@Test
	public void testCaseVerificarPokerStatusConCartasRepetidas() {
		when(carta1.getValor()).thenReturn("1");
		when(carta1.getPalo()).thenReturn("D");
		
		try {
			pokerStatus.verificar(carta1, carta1, carta3, carta4, carta5);
			fail("Error esperado por repeticion de cartas");
		} catch(Exception e) {
			assertEquals(e.getMessage(), "Error, se encontraron cartas repetidas");
		}
	}
	
 }
