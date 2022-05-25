package ar.edu.unq.po2.tp8.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.AppMobile;
import ar.edu.unq.po2.tp8.Partido;
import ar.edu.unq.po2.tp8.Servidor;
import ar.edu.unq.po2.tp8.SistemaDeportivo;

class SistemaDeportivoTest {

	private SistemaDeportivo sistema;
	private List<String> intereses = new ArrayList<String>();
	private List<String> topics1 = new ArrayList<String>();
	private List<String> topics2 = new ArrayList<String>();
	private String deporteFutbol = "Futbol";
	private String deporteBasket = "Basket";
	private String equipoRiver = "River";
	private String equipoBoca = "Boca";
	private String jugadorGinobili = "Ginobili";
	
	@BeforeEach
	void setUp() throws Exception {
		this.sistema = new SistemaDeportivo();
		this.intereses.add(deporteFutbol);
		this.topics1.add(equipoRiver);
		this.topics1.add(equipoBoca);
		this.topics1.add(deporteFutbol);
		this.topics1.add(deporteBasket);
		this.topics1.add(jugadorGinobili);
	}
	
	@Test
	void testCreation() {
		assertNotNull(this.sistema);
	}
	
	@Test
	void testAgregarSuscriptor() {
		Servidor server = mock(Servidor.class);
		this.sistema.agregar(server);
		int cantidadDeSubscriptores = this.sistema.getSubscriptores().size();
		assertEquals(1, cantidadDeSubscriptores);
	}
	
	@Test
	void testSacarSuscriptor() {
		Servidor server = mock(Servidor.class);
		AppMobile app = mock(AppMobile.class);
		this.sistema.agregar(app);
		this.sistema.agregar(server);
		this.sistema.eliminar(app);
		int cantidadDeSubscriptores = this.sistema.getSubscriptores().size();
		assertEquals(1, cantidadDeSubscriptores);
	}
	
	@Test
	void testAgregarPartido() {
		Partido partido = mock(Partido.class);
		this.sistema.agregarPartido(partido);
		int cantidadDePartidos = this.sistema.getPartidos().size();
		assertEquals(1, cantidadDePartidos);
	}
	
	@Test
	void testAgregarPartidoAlertaSuscriptoresInteresados() {
		Partido partido = mock(Partido.class);
		Servidor server = mock(Servidor.class);
		
		when(server.getIntereses()).thenReturn(intereses);
		when(partido.getTopics()).thenReturn(topics1);
		
		this.sistema.agregar(server);
		this.sistema.agregarPartido(partido);
		
		verify(server).update(partido);
	}
	
	@Test
	void testAgregarPartidoNoAlertaSuscriptoresPorqueNoHayInteresados() {
		Partido partido = mock(Partido.class);
		Servidor server = mock(Servidor.class);
		
		when(server.getIntereses()).thenReturn(intereses);
		when(partido.getTopics()).thenReturn(topics2);
		
		this.sistema.agregar(server);
		this.sistema.agregarPartido(partido);
		
		verify(server,never()).update(partido);
	}

}
