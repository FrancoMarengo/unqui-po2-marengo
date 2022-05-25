package ar.edu.unq.po2.tp8;

import java.util.ArrayList;

public class SistemaDeReferencias {

	private ArrayList<Investigador> observadores;
	private ArrayList<Publicacion> publicaciones;
	
	public SistemaDeReferencias() {
		super();
		this.setObservadores(new ArrayList<Investigador>());
		this.setPublicaciones(new ArrayList<Publicacion>());
	}
	
	public void agregarPublicacion(Publicacion publicacion) {
		this.getPublicaciones().add(publicacion);
		for(Investigador investigador : this.getObservadores()) {
			if(investigador
					.getTemasDeInteres()
					.stream()
					.anyMatch(interes -> publicacion.getTemas().contains(interes))) {
				investigador.actualizar(publicacion);
			}
		}
	}
	
	public void suscribir(Investigador observador) {
		observadores.add(observador);
	}
	
	public void desuscribir(Investigador observador) {
		observadores.remove(observador);
	}

	public ArrayList<Investigador> getObservadores() {
		return observadores;
	}

	private void setObservadores(ArrayList<Investigador> observadores) {
		this.observadores = observadores;
	}

	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}

	private void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
}
