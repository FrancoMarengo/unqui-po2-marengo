package ar.edu.unq.po2.tp3;

public class Rectangulo {
    
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	private int ancho;
	private int alto;
	
	public Rectangulo(Point puntoDeEsquinaSuperiorIzquierda, int ancho, int alto) {
		
		this.setEsquinaSuperiorIzquierda(puntoDeEsquinaSuperiorIzquierda);
		this.setEsquinaSuperiorDerecha(new Point((puntoDeEsquinaSuperiorIzquierda.getX()+ancho), puntoDeEsquinaSuperiorIzquierda.getY()));
		this.setEsquinaInferiorIzquierda(new Point(puntoDeEsquinaSuperiorIzquierda.getX(), (puntoDeEsquinaSuperiorIzquierda.getY()-alto)));
		this.setEsquinaInferiorDerecha(new Point((puntoDeEsquinaSuperiorIzquierda.getX()+ancho), (puntoDeEsquinaSuperiorIzquierda.getY()-alto)));
		this.setAncho(ancho);
		this.setAlto(alto);
	}
	
	public int area() {
		return(this.getAncho() * this.getAlto());
	}
	
	public int perimetro() {
		return(2 * (this.getAncho() + this.getAlto()));
	}
	
	public boolean esHorizontal() {
		return(this.getAncho() > this.getAlto());
	}
	
	public boolean esVertical() {
		return(this.getAncho() < this.getAlto());
	}
	
    // Getters y Setters para todos las variables de instancia
	public Point getEsquinaSuperiorIzquierda() {
		return esquinaSuperiorIzquierda;
	}

	private void setEsquinaSuperiorIzquierda(Point esquinaSuperiorIzquierda) {
		this.esquinaSuperiorIzquierda = esquinaSuperiorIzquierda;
	}

	public Point getEsquinaSuperiorDerecha() {
		return esquinaSuperiorDerecha;
	}

	private void setEsquinaSuperiorDerecha(Point esquinaSuperiorDerecha) {
		this.esquinaSuperiorDerecha = esquinaSuperiorDerecha;
	}

	public Point getEsquinaInferiorIzquierda() {
		return esquinaInferiorIzquierda;
	}

	private void setEsquinaInferiorIzquierda(Point esquinaInferiorIzquierda) {
		this.esquinaInferiorIzquierda = esquinaInferiorIzquierda;
	}

	public Point getEsquinaInferiorDerecha() {
		return esquinaInferiorDerecha;
	}

	private void setEsquinaInferiorDerecha(Point esquinaInferiorDerecha) {
		this.esquinaInferiorDerecha = esquinaInferiorDerecha;
	}

	public int getAncho() {
		return ancho;
	}

	private void setAncho(int ancho) {
		this.ancho = ancho;
	}

	public int getAlto() {
		return alto;
	}

	private void setAlto(int alto) {
		this.alto = alto;
	}
	
}
