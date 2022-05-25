package ar.edu.unq.po2.tp8;

import java.util.ArrayList;

public class Investigador implements ISuscripcion {
	
	private SistemaDeReferencias sistemaDeReferencias;
	private ArrayList<String> temasDeInteres;

	public Investigador(SistemaDeReferencias sistemaDeReferencias, ArrayList<String> temasDeInteres) {
		super();
		this.setSistemaDeReferencias(sistemaDeReferencias);
		sistemaDeReferencias.suscribir(this);
		this.setTemasDeInteres(temasDeInteres);
	}
	
	public ArrayList<String> getTemasDeInteres() {
		return temasDeInteres;
	}

	private void setTemasDeInteres(ArrayList<String> temasDeInteres) {
		this.temasDeInteres = temasDeInteres;
	}

	public SistemaDeReferencias getSistemaDeReferencias() {
		return sistemaDeReferencias;
	}

	private void setSistemaDeReferencias(SistemaDeReferencias sistemaDeReferencias) {
		this.sistemaDeReferencias = sistemaDeReferencias;
	}

	public void actualizar(Publicacion publicacion) {
		System.out.println("Se ha publicado " + publicacion.getTitulo() + ", podria ser de tu interés.");
	}
}
