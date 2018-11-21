package Clases;

public class Producto {
	private int    stock, codigoProducto;
	private String detalle;
	private double precioUnitario;
	/*constructor ps*/
	public Producto(int stock, int codigoProducto, String detalle, double precioUnitario) {
		this.stock = stock;
		this.codigoProducto = codigoProducto;
		this.detalle = detalle;
		this.precioUnitario = precioUnitario;
	}
	//getters and setters
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getCodigoProducto() {
		return codigoProducto;
	}
	public void setCodigoProducto(int codigoProducto) {
		this.codigoProducto = codigoProducto;
	}
	public String getDetalle() {
		return detalle;
	}
	public void setDetalle(String detalle) {
		this.detalle = detalle;
	}
	public double getPrecioUnitario() {
		return precioUnitario;
	}
	public void setPrecioUnitario(double precioUnitario) {
		this.precioUnitario = precioUnitario;
	}
	


	
}
