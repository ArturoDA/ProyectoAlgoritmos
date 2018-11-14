package Clases;

public class Bungalow {
	private int numeroBungalow,categoria, estado;
	private double precioDia;
	public Bungalow(int numeroBungalow, int categoria, int estado, double precioDia) {
		super();
		this.numeroBungalow = numeroBungalow;
		this.categoria = categoria;
		this.estado = estado;
		this.precioDia = precioDia;
	}
	public int getNumeroBungalow() {
		return numeroBungalow;
	}
	public void setNumeroBungalow(int numeroBungalow) {
		this.numeroBungalow = numeroBungalow;
	}
	public int getCategoria() {
		return categoria;
	}
	public void setCategoria(int categoria) {
		this.categoria = categoria;
	}
	public int getEstado() {
		return estado;
	}
	public void setEstado(int estado) {
		this.estado = estado;
	}
	public double getPrecioDia() {
		return precioDia;
	}
	public void setPrecioDia(double precioDia) {
		this.precioDia = precioDia;
	}

}
