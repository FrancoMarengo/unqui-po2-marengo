package ar.edu.unq.po2.tp8;

import java.util.ArrayList;
import java.util.List;

public class Publicacion {

	private String titulo;
	private ArrayList<String> autores;
	private ArrayList<String> filiacionesDeAutores;
	private String tipoDeArticulo;
	private String lugarDePublicacion;
	private ArrayList<String> palabrasClave;
	
	public Publicacion(String titulo, ArrayList<String> autores, ArrayList<String> filiacionesDeAutores, String tipoDeArticulo, String lugarDePublicacion, ArrayList<String> palabrasClave) {
		super();
		this.setTitulo(titulo);
		this.setAutores(autores);
		this.setFiliacionesDeAutores(filiacionesDeAutores);
		this.setTipoDeArticulo(tipoDeArticulo);
		this.setLugarDePublicacion(lugarDePublicacion);
		this.setPalabrasClave(palabrasClave);
	}
	
	public List<String> getTemas() {
		List<String> temas = this.palabrasClave;
		temas.add(tipoDeArticulo);
		temas.add(lugarDePublicacion);
		temas.addAll(filiacionesDeAutores);
		temas.add(titulo);
		temas.addAll(autores);
		return temas;
	}

	public String getTitulo() {
		return titulo;
	}

	private void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public ArrayList<String> getAutores() {
		return autores;
	}

	private void setAutores(ArrayList<String> autores) {
		this.autores = autores;
	}

	public ArrayList<String> getFiliacionesDeAutores() {
		return filiacionesDeAutores;
	}

	private void setFiliacionesDeAutores(ArrayList<String> filiacionesDeAutores) {
		this.filiacionesDeAutores = filiacionesDeAutores;
	}

	public String getTipoDeArticulo() {
		return tipoDeArticulo;
	}

	private void setTipoDeArticulo(String tipoDeArticulo) {
		this.tipoDeArticulo = tipoDeArticulo;
	}

	public String getLugarDePublicacion() {
		return lugarDePublicacion;
	}

	private void setLugarDePublicacion(String lugarDePublicacion) {
		this.lugarDePublicacion = lugarDePublicacion;
	}

	public ArrayList<String> getPalabrasClave() {
		return palabrasClave;
	}

	private void setPalabrasClave(ArrayList<String> palabrasClave) {
		this.palabrasClave = palabrasClave;
	}
}
