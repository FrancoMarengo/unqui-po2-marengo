package ar.edu.unq.po2.tp8.tests;

import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Publicacion;

public class PublicacionTest {

	private Publicacion publicacion;
	private ArrayList<String> autores;
	private ArrayList<String> filiacionesDeAutores;
	private ArrayList<String> palabrasClave;
	
	@BeforeEach
	public void setUp() {
		autores = new ArrayList<String>();
		filiacionesDeAutores = new ArrayList<String>();
		palabrasClave = new ArrayList<String>();
		palabrasClave.add("Patrones");
		palabrasClave.add("POO");
		filiacionesDeAutores.add("Laboratorio");
		filiacionesDeAutores.add("Investigacion");
		autores.add("Gamma");
		autores.add("Helm");
		publicacion = new Publicacion("Design Patterns", autores, filiacionesDeAutores,
				                      "Investigacion", "Quilmes", palabrasClave);
	}
	
	@Test
	public void testCaseConocerTemasDeLaPublicacion() {
		assertTrue(publicacion.getTemas().contains("Design Patterns"));
		assertTrue(publicacion.getTemas().contains("Gamma"));
		assertTrue(publicacion.getTemas().contains("Helm"));
		assertTrue(publicacion.getTemas().contains("Laboratorio"));
		assertTrue(publicacion.getTemas().contains("Investigacion"));
		assertTrue(publicacion.getTemas().contains("Investigacion"));
		assertTrue(publicacion.getTemas().contains("Quilmes"));
		assertTrue(publicacion.getTemas().contains("Patrones"));
		assertTrue(publicacion.getTemas().contains("POO"));
		
	}
	
	@Test
	public void testCaseConocerAutoresDePublicacion() {
		List<String> autoresEsperados = Arrays.asList("Gamma", "Helm");
		assertEquals(autoresEsperados, publicacion.getAutores());
	}
	
	@Test
	public void testCaseConocerTituloDePublicacion() {
		assertEquals(publicacion.getTitulo(), "Design Patterns");
	}
	
	@Test
	public void testCaseConocerFiliacionesDeAutores() {
		List<String> filiacionesEsperadas = Arrays.asList("Laboratorio", "Investigacion");
		assertEquals(filiacionesEsperadas, publicacion.getFiliacionesDeAutores());
	}
	
	@Test
	public void testCaseConocerTipoDeArticulo() {
		assertEquals(publicacion.getTipoDeArticulo(), "Investigacion");
	}
	
	@Test
	public void testCaseConocerLugarDePublicacion() {
		assertEquals(publicacion.getLugarDePublicacion(), "Quilmes");
	}
	
	@Test
	public void testCaseConocerPalabrasClave() {
		List<String> palabrasClaveEsperadas = Arrays.asList("Patrones", "POO");
		assertEquals(palabrasClaveEsperadas, publicacion.getPalabrasClave());
	}
}
