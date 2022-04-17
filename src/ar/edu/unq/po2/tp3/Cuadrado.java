package ar.edu.unq.po2.tp3;

public class Cuadrado {
	
	private Point esquinaSuperiorIzquierda;
	private Point esquinaSuperiorDerecha;
	private Point esquinaInferiorIzquierda;
	private Point esquinaInferiorDerecha;
	private int largoDeLados;
	
	public Cuadrado(Point esquinaSuperiorIzquierda, int largoDeLados) {
	    
		this.setEsquinaSuperiorIzquierda(esquinaSuperiorIzquierda);
		this.setEsquinaSuperiorDerecha(new Point((esquinaSuperiorIzquierda.getX()+largoDeLados), esquinaSuperiorIzquierda.getY()));
		this.setEsquinaInferiorIzquierda(new Point(esquinaSuperiorIzquierda.getX(), (esquinaSuperiorIzquierda.getY()-largoDeLados)));
		this.setEsquinaInferiorDerecha(new Point((esquinaSuperiorIzquierda.getX()+largoDeLados), (esquinaSuperiorIzquierda.getY()-largoDeLados)));
		this.setLargoDeLados(largoDeLados);
	}

	public int area() {
		return(this.getLargoDeLados() * this.getLargoDeLados());
	}
	
	public int perimetro() {
		return(4 * (this.getLargoDeLados()));
	}
    
	// Getters y Setters
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

	public int getLargoDeLados() {
		return largoDeLados;
	}

	private void setLargoDeLados(int largoDeLados) {
		this.largoDeLados = largoDeLados;
	}
	
}
	
