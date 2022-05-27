package ar.edu.unq.po2.tp8;

public class Partida {

	private String pregunta1;
	private String pregunta2;
	private String pregunta3;
	private String pregunta4;
	private String pregunta5;
	private String respuesta1;
	private String respuesta2;
	private String respuesta3;
	private String respuesta4;
	private String respuesta5;
	private ServidorDeJuego servidor;
	
	public Partida(String pregunta1, String pregunta2, String pregunta3, String pregunta4, String pregunta5,
			       String respuesta1, String respuesta2, String respuesta3, String respuesta4, String respuesta5, ServidorDeJuego servidor) {
		super();
		this.setPregunta1(pregunta1);
		this.setPregunta2(pregunta2);
		this.setPregunta3(pregunta3);
		this.setPregunta4(pregunta4);
		this.setPregunta5(pregunta5);
		this.setRespuesta1(respuesta1);
		this.setRespuesta2(respuesta2);
		this.setRespuesta3(respuesta3);
		this.setRespuesta4(respuesta4);
		this.setRespuesta5(respuesta5);
		this.setServidor(servidor);
	}
	
	public void comenzarJuego() {
		this.getServidor().notificarListosParaJugar(this.getPregunta1(), this.getPregunta2(), this.getPregunta3(),
				                                    this.getPregunta4(), this.getPregunta5());
	}
	
	public void verificarRespuestas(String pregunta, String respuesta , String respuestaEsperada, Participante p) {
		if(respuesta == respuestaEsperada) {
			notificarRespuestaCorrecta(pregunta, p);
		} else {
			notificarRespuestaIncorrecta(pregunta, p);
		}
	}
	
	private void notificarRespuestaIncorrecta(String pregunta, Participante p) {
		this.getServidor().notificarRespuestaIncorrecta(pregunta, p);
		
	}

	private void notificarRespuestaCorrecta(String pregunta, Participante p) {
		this.getServidor().notificarRespuestaIncorrecta(pregunta, p);
		
	}

	public void verificarRespuesta(String pregunta, String respuesta, Participante p) {
		if(pregunta == this.getPregunta1()) {
			this.verificarRespuestas(pregunta, respuesta, this.getRespuesta1(), p);
		} else if(pregunta == this.getPregunta2()) {
			this.verificarRespuestas(pregunta, respuesta, this.getRespuesta2(), p);
		} else if(pregunta == this.getPregunta2()) {
			this.verificarRespuestas(pregunta, respuesta, this.getRespuesta3(), p);
		} else if(pregunta == this.getPregunta2()) {
			this.verificarRespuestas(pregunta, respuesta, this.getRespuesta4(), p);
		} else if(pregunta == this.getPregunta2()) {
			this.verificarRespuestas(pregunta, respuesta, this.getRespuesta5(), p);
		}
	}

	public String getPregunta1() {
		return pregunta1;
	}

	private void setPregunta1(String pregunta1) {
		this.pregunta1 = pregunta1;
	}

	public String getPregunta2() {
		return pregunta2;
	}

	private void setPregunta2(String pregunta2) {
		this.pregunta2 = pregunta2;
	}

	public String getPregunta3() {
		return pregunta3;
	}

	private void setPregunta3(String pregunta3) {
		this.pregunta3 = pregunta3;
	}

	public String getPregunta4() {
		return pregunta4;
	}

	private void setPregunta4(String pregunta4) {
		this.pregunta4 = pregunta4;
	}

	public String getPregunta5() {
		return pregunta5;
	}

	private void setPregunta5(String pregunta5) {
		this.pregunta5 = pregunta5;
	}

	public String getRespuesta1() {
		return respuesta1;
	}

	private void setRespuesta1(String respuesta1) {
		this.respuesta1 = respuesta1;
	}

	public String getRespuesta2() {
		return respuesta2;
	}

	private void setRespuesta2(String respuesta2) {
		this.respuesta2 = respuesta2;
	}

	public String getRespuesta3() {
		return respuesta3;
	}

	private void setRespuesta3(String respuesta3) {
		this.respuesta3 = respuesta3;
	}

	public String getRespuesta4() {
		return respuesta4;
	}

	private void setRespuesta4(String respuesta4) {
		this.respuesta4 = respuesta4;
	}

	public String getRespuesta5() {
		return respuesta5;
	}

	private void setRespuesta5(String respuesta5) {
		this.respuesta5 = respuesta5;
	}

	public ServidorDeJuego getServidor() {
		return servidor;
	}

	private void setServidor(ServidorDeJuego servidor) {
		this.servidor = servidor;
	}
	
}
