package ar.edu.unq.po2.tp8.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import ar.edu.unq.po2.tp8.Investigador;
import ar.edu.unq.po2.tp8.Publicacion;
import ar.edu.unq.po2.tp8.SistemaDeReferencias;

public class SistemaDeReferenciasTest {

	private SistemaDeReferencias sistemaDeReferencias;
	private Publicacion publicacion;
	private Investigador investigador;
	private ArrayList<String> temasDeInteres;
	
	@BeforeEach
	public void setUp() {
		sistemaDeReferencias = new SistemaDeReferencias();
		temasDeInteres = new ArrayList<String>();
		temasDeInteres.add("Design Patterns");
		publicacion = mock(Publicacion.class);
		investigador = mock(Investigador.class);
	}
	
	@Test
	public void testCaseConocerLosObservadoresDelSistema() {
		sistemaDeReferencias.suscribir(investigador);
		assertTrue(sistemaDeReferencias.getObservadores().contains(investigador));
	}
	
	@Test
	public void testCaseCuandoUnObservadorSeSuscribeEntoncesRecibeNotificaciones() {
		when(publicacion.getTemas()).thenReturn(temasDeInteres);
		when(investigador.getTemasDeInteres()).thenReturn(temasDeInteres);
		
		sistemaDeReferencias.suscribir(investigador);
		sistemaDeReferencias.agregarPublicacion(publicacion);
		
		verify(investigador).actualizar(publicacion);
	}

    @Test
    void testAgregarArticulo() {
	    sistemaDeReferencias.agregarPublicacion(publicacion);
	    int resultado = sistemaDeReferencias.getPublicaciones().size();
	    assertEquals(1, resultado);
    }

    @Test
    void testAgregarArticuloSinInteresadosNoNotificaANadie() {
    	ArrayList<String> temas2 = new ArrayList<String>();
    	temas2.add("Gaming");
	    when(publicacion.getTemas()).thenReturn(temasDeInteres);
	    when(investigador.getTemasDeInteres()).thenReturn(temas2);
	
	    sistemaDeReferencias.suscribir(investigador);
	    sistemaDeReferencias.agregarPublicacion(publicacion);
	
	    verify(investigador, never()).actualizar(publicacion);
    }

    @Test
    void testDesuscribir() {
	    sistemaDeReferencias.suscribir(investigador);
	    sistemaDeReferencias.desuscribir(investigador);
	    assertEquals(0, sistemaDeReferencias.getObservadores().size());
    }
}
