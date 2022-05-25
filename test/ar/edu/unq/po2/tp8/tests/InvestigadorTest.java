package ar.edu.unq.po2.tp8.tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Investigador;
import ar.edu.unq.po2.tp8.Publicacion;
import ar.edu.unq.po2.tp8.SistemaDeReferencias;

public class InvestigadorTest {
	
    private SistemaDeReferencias sistemaDeReferencias;
	private ArrayList<String> temasDeInteres;
	private Investigador investigador;
	private Publicacion publicacion;
	
	@BeforeEach
	public void setUp() {
		sistemaDeReferencias = mock(SistemaDeReferencias.class);
		temasDeInteres = new ArrayList<String>();
		temasDeInteres.add("Design Patterns");
		investigador = new Investigador(sistemaDeReferencias, temasDeInteres);
		publicacion = mock(Publicacion.class);
	}
	
	@Test
	public void testCaseConocerTemasDeInteres() {
		assertTrue(investigador.getTemasDeInteres().contains("Design Patterns"));
	}
	
	@Test
	public void testCaseConocerElSistemaDeReferencias() {
		assertEquals(investigador.getSistemaDeReferencias(), sistemaDeReferencias);
	}
	
	@Test
	public void testCaseConocerElTituloDeLaPublicacionLlegada() {
		when(publicacion.getTitulo()).thenReturn("Design Patterns");
		investigador.actualizar(publicacion);
		verify(publicacion).getTitulo();	
	}
}
