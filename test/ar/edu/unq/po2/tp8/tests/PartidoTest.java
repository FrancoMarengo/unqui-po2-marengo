package ar.edu.unq.po2.tp8.tests;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Partido;

class PartidoTest {

	private Partido partido;
	private List<String> contrincantes;
	private List<String> topics;
	private String contrincanteBoca;
	private String contrincanteRiver;
	private String resultado;
	private String deporte;
	
	@BeforeEach
	void setUp() throws Exception {
		contrincantes = new ArrayList<String>();
		contrincanteBoca = "Boca";
		contrincanteRiver = "River";
		resultado = "1-1";
		deporte = "Futbol";
		this.contrincantes.add(contrincanteBoca);
		this.contrincantes.add(contrincanteRiver);
		this.partido = new Partido(resultado, contrincantes, deporte);
	}
	
	@Test
	void testCreation() {
		assertNotNull(this.partido);
	}
	
	@Test
	void testContrincantes() {
		assertEquals(contrincanteBoca, partido.getContrincantes().get(0));
		assertEquals(contrincanteRiver, partido.getContrincantes().get(1));
	}
	@Test
	void testResultado() {
		assertEquals(resultado, partido.getResultado());
	}
	
	@Test
	void TestDeporte() {
		assertEquals(deporte, partido.getDeporte());
	}
	
	@Test
	void testTopics() {
		topics = new ArrayList<String>();
		topics.addAll(partido.getContrincantes());
		topics.add(partido.getDeporte());
		assertEquals(3, partido.getTopics().size());
	}

}
