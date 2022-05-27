package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class ServidorDeJuego {

	private List<Participante> participantes;
	private Partida partida;
	
	public ServidorDeJuego(Partida partida) {
		super();
		this.setParticipantes(new ArrayList<Participante>());
		this.setPartida(partida);
	}
	
	public void notificarRespuestaCorrecta(String pregunta, Participante p) {
        p.agregarRespuestaCorrecta();
        for(Participante par:this.getParticipantes()) {
        	par.recibirMensaje("El participante" + p.getNombre() + "respondio correctamente la pregunta" + pregunta);
        }
        if(p.getRespuestasCorrectas() == 5) {
            for(Participante par:this.getParticipantes()) {
            	par.recibirMensaje("El jugador " + p.getNombre() + "gano el juego!");
            }
        }
	}
	
	public void notificarRespuestaIncorrecta(String pregunta, Participante p) {
		p.recibirMensaje("Tu respuesta a la pregunta " + pregunta + " no fue correcta");
	}
	
	public void verificarRespuesta(String pregunta, String respuesta, Participante p) {
		this.getPartida().verificarRespuesta(pregunta, respuesta, p);
	}
	
	public void solicitarUnirA(Participante p) {
		if(this.getParticipantes().size() < 5) {
			this.getParticipantes().add(p);
		}
		if (this.getParticipantes().size() == 5) {
			this.getPartida().comenzarJuego();
		}
	}
	
	public void notificarListosParaJugar(String p1, String p2, String p3, String p4, String p5) {
		for(Participante p:this.getParticipantes()) {
			p.agregarPreguntas(p1, p2, p3, p4, p5);
		}
	}

	public List<Participante> getParticipantes() {
		return participantes;
	}

	private void setParticipantes(List<Participante> participantes) {
		this.participantes = participantes;
	}

	public Partida getPartida() {
		return partida;
	}

	private void setPartida(Partida partida) {
		this.partida = partida;
	}
}
