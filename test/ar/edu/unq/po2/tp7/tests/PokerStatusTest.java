package ar.edu.unq.po2.tp7.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp7.Carta;
import ar.edu.unq.po2.tp7.PokerStatus;

public class PokerStatusTest {

	PokerStatus pokerStatus; //SUT
private Carta carta1;
	private Carta carta2;
	private Carta carta3;
	private Carta carta4;
	private Carta carta5;

	@BeforeEach
	void setUp() throws Exception {
		this.pokerStatus = new PokerStatus();
		carta1 = mock(Carta.class);
		carta2 = mock(Carta.class);
		carta3 = mock(Carta.class);
		carta4 = mock(Carta.class);
		carta5 = mock(Carta.class);
	}
	
	@Test
	void test4CartasDelMismoValorIndicanPoker() {
		// Setup
		when(this.carta1.getValor()).thenReturn(1);
		when(this.carta1.getPalo()).thenReturn("D");
		
		when(this.carta2.getValor()).thenReturn(1);
		when(this.carta2.getPalo()).thenReturn("P");
		
		when(this.carta3.getValor()).thenReturn(1);
		when(this.carta3.getPalo()).thenReturn("C");
		
		when(this.carta4.getValor()).thenReturn(1);
		when(this.carta4.getPalo()).thenReturn("T");

		when(this.carta5.getValor()).thenReturn(4);
		when(this.carta5.getPalo()).thenReturn("P");
		//Exercise 
		String resultado = this.pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5);
		//Verify
		assertEquals("poker",resultado);
	}

	@Test
	void test5CartasDelMismoPaloIndicanColor() {
		//Setup
		when(this.carta1.getValor()).thenReturn(1);
		when(this.carta1.getPalo()).thenReturn("D");
		
		when(this.carta2.getValor()).thenReturn(2);
		when(this.carta2.getPalo()).thenReturn("D");
		
		when(this.carta3.getValor()).thenReturn(3);
		when(this.carta3.getPalo()).thenReturn("D");
		
		when(this.carta4.getValor()).thenReturn(4);
		when(this.carta4.getPalo()).thenReturn("D");

		when(this.carta5.getValor()).thenReturn(5);
		when(this.carta5.getPalo()).thenReturn("D");

		//Exercise
		String resultado = this.pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5);
		//Verify
		assertEquals("color",resultado);
	}

	
	@Test
	void test3CartasDelMismoValorIndicanTrio() {
		//Setup
		when(this.carta1.getValor()).thenReturn(1);
		when(this.carta1.getPalo()).thenReturn("D");
		
		when(this.carta2.getValor()).thenReturn(1);
		when(this.carta2.getPalo()).thenReturn("P");
		
		when(this.carta3.getValor()).thenReturn(1);
		when(this.carta3.getPalo()).thenReturn("C");
		
		when(this.carta4.getValor()).thenReturn(6);
		when(this.carta4.getPalo()).thenReturn("T");

		when(this.carta5.getValor()).thenReturn(4);
		when(this.carta5.getPalo()).thenReturn("P");
		//Exercise
		String resultado = this.pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5);
		//Verify
		assertEquals("trio",resultado);
	}
	@Test
	void testCartasDiferentesValorYPaloNoIndicanNada() {
		//Setup
		when(this.carta1.getValor()).thenReturn(1);
		when(this.carta1.getPalo()).thenReturn("D");
		
		when(this.carta2.getValor()).thenReturn(2);
		when(this.carta2.getPalo()).thenReturn("P");
		
		when(this.carta3.getValor()).thenReturn(3);
		when(this.carta3.getPalo()).thenReturn("C");
		
		when(this.carta4.getValor()).thenReturn(4);
		when(this.carta4.getPalo()).thenReturn("T");

		when(this.carta5.getValor()).thenReturn(5);
		when(this.carta5.getPalo()).thenReturn("P");
		//Exercise
		String resultado = this.pokerStatus.verificar(carta1,carta2,carta3,carta4,carta5);
		//Verify
		assertEquals("",resultado);
	}
}
