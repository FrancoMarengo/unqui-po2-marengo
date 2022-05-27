package ar.edu.unq.po2.tp8.tests;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unq.po2.tp8.Participante;
import ar.edu.unq.po2.tp8.Partida;
import ar.edu.unq.po2.tp8.ServidorDeJuego;

public class ServidorTest {

	private Participante participante1;
	private Partida partida;
	private ServidorDeJuego servidor;
	
	@BeforeEach
	public void setUp() {
		partida = mock(Partida.class);
		servidor = new ServidorDeJuego(partida);
		participante1 = mock(Participante.class);
	}
	
	@Test
	public void testNotificarAParticipanteCuandoLaRespuestaEsIncorrecta() {
		
		servidor.notificarRespuestaIncorrecta("Pregunta de test", participante1);
		
		verify(participante1).recibirMensaje("Tu respuesta a la pregunta Pregunta de test no fue correcta");
	}
}
