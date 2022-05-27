package ar.edu.unq.po2.tp8;

public class Participante {

	private String pregunta1;
	private String pregunta2;
	private String pregunta3;
	private String pregunta4;
	private String pregunta5;
	private ServidorDeJuego servidor;
	private int respuestasCorrectas;
	private String nombre;
	
	public Participante(ServidorDeJuego servidor, String nombre) {
		super();
		this.setServidor(servidor);
		this.setPregunta1("Sin pregunta aun");
		this.setPregunta2("Sin pregunta aun");
		this.setPregunta3("Sin pregunta aun");
		this.setPregunta4("Sin pregunta aun");
		this.setPregunta5("Sin pregunta aun");
		this.setNombre(nombre);
		this.setRespuestasCorrectas(0);
	}

	public void agregarPreguntas(String p1, String p2, String p3, String p4, String p5) {
		this.setPregunta1(p1);
		this.setPregunta2(p2);
		this.setPregunta3(p3);
		this.setPregunta4(p4);
		this.setPregunta5(p5);
	}
	
	public void agregarRespuestaCorrecta() {
		respuestasCorrectas ++;
	}
	
	public void recibirMensaje(String s) {
		System.out.println(s);
	}
	
	public void solicitarUnirseAPartida() {
		this.getServidor().solicitarUnirA(this);
	}
	
	public void enviarRespuesta1(String respuesta) {
		this.getServidor().verificarRespuesta(pregunta1, respuesta, this);
	}
	
	public void enviarRespuesta2(String respuesta) {
		this.getServidor().verificarRespuesta(pregunta2, respuesta, this);
	}
	
	public void enviarRespuesta3(String respuesta) {
		this.getServidor().verificarRespuesta(pregunta3, respuesta, this);
	}
	
	public void enviarRespuesta4(String respuesta) {
		this.getServidor().verificarRespuesta(pregunta4, respuesta, this);
	}
	
	public void enviarRespuesta5(String respuesta) {
		this.getServidor().verificarRespuesta(pregunta5, respuesta, this);
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

	public ServidorDeJuego getServidor() {
		return servidor;
	}

	private void setServidor(ServidorDeJuego servidor) {
		this.servidor = servidor;
	}
	
	public int getRespuestasCorrectas() {
		return respuestasCorrectas;
	}

	private void setRespuestasCorrectas(int respuestasCorrectas) {
		this.respuestasCorrectas = respuestasCorrectas;
	}

	public String getNombre() {
		return nombre;
	}

	private void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
