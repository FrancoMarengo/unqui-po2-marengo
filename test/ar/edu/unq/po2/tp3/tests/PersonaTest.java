package ar.edu.unq.po2.tp3.tests;
import static org.junit.jupiter.api.Assertions.*;

import java.time.Period;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp3.Persona;

public class PersonaTest {
    private Persona persona;
    
    @BeforeEach
    public void setUp() throws Exception {
    	
    	persona = new Persona("Franco", Period.of(2001, 11, 20));
    }
    
    @Test
    public void obtenerNombreDeUnaPersonaTestCase() {
    	String nombreEsperado = "Franco";
    	
    	assertEquals(nombreEsperado, persona.getNombre());
    }
    
    @Test
    public void obtenerEdadDeUnaPersonaTestCase() {
    	int edadEsperada = 20;
    	
    	assertEquals(edadEsperada, persona.edad());
    }
    
    @Test
    public void saberSiUnaPersonaEsMenorQueOtraTestCase() {
    	
    	Persona personaMayor = new Persona("Matias", Period.of(2000, 5, 15));
    	
        assertTrue(persona.esMenorQue(personaMayor));
    }
}
