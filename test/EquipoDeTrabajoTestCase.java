import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

import ar.edu.unq.po2.tp3.Persona2;
import ar.edu.unq.po2.tp3.EquipoDeTrabajo;

public class EquipoDeTrabajoTestCase {
    private Persona2 personaFranco;
    private Persona2 personaMatias;
    private Persona2 personaLuis;
    private Persona2 personaPablo;
    private Persona2 personaTomas;
    private EquipoDeTrabajo equipoDeTrabajo;
    private ArrayList<Persona2> integrantes;
    
    @BeforeEach
    public void setUp() throws Exception {
    	personaFranco = new Persona2("Franco", "Marengo", 20);
    	personaMatias = new Persona2("Matias", "Gonzales", 26);
    	personaLuis = new Persona2("Luis", "Montenegro", 32);
    	personaPablo = new Persona2("Pablo", "Castel", 25);
    	personaTomas = new Persona2("Tomas", "Cuello", 18);
    	integrantes = new ArrayList<Persona2>(Arrays.asList(personaFranco, personaMatias, personaLuis, personaPablo, personaTomas));
    	equipoDeTrabajo = new EquipoDeTrabajo("Programadores", integrantes);
    }
    
    @Test
    public void unEquipoDeTrabajoSabeResponderASuNombreTestCase() {
    	String nombreEsperado = "Programadores";
    	
    	assertEquals(nombreEsperado, equipoDeTrabajo.getNombre());
    }
    
    @Test
    public void unEquipoDeTrabajoSabeElPromedioDeEdadDeIntegrantesTestCase() {
    	int promedioEsperado = ((personaFranco.getEdad() + personaMatias.getEdad() + personaLuis.getEdad()
    	                         + personaPablo.getEdad() + personaTomas.getEdad()) / 5);
    	
    	assertEquals(promedioEsperado, equipoDeTrabajo.promedioEdadDeIntegrantes());
    	System.out.println("El promedio de edades de los integrantes es: " + equipoDeTrabajo.promedioEdadDeIntegrantes());
    }
    
    
}
