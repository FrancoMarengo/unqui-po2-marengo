package ar.edu.unq.po2.tp3;

public class Point {
    private int x;
    private int y;
    
	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public Point() {
		super();
		this.x = 0;
		this.y = 0;
	}
	
	public void moverPunto(int x, int y) {
		this.setX(x);
		this.setY(y);
	}
	
	public Point sumarPuntos(Point unPunto) {
		Point puntoResultante = new Point();
		puntoResultante.setX(unPunto.getX() + this.getX());
		puntoResultante.setY(unPunto.getY() + this.getY());
		
		return puntoResultante;
	}
	
	public boolean sonMismoPunto(Point unPunto) {
	    return((this.getX() == unPunto.getX()) && (this.getY() == unPunto.getY()));
	}
	
	//Getters y Setters
	public int getX() {
		return x;
	}

	private void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	private void setY(int y) {
		this.y = y;
	}
}
