package Clases;

public class Producto {
	private int    stock;
	private String detalle,codigoProducto;
	private double precioUnitario;
	/*constructor ps*/
	public Producto(String cP,String d,int s,double pU) 
	{
		codigoProducto = cP;
		detalle = d;
		stock = s;
		precioUnitario = pU;
	}
	
	
	/*Objetos
	Producto habitacion = new Producto();
	Producto servicioHabitacion = new Producto();
	Producto consumoComestible = new Producto();
	Producto consumoEntrenimiento = new Producto();
	*/
	/*metodos*/
	
	public Producto() {
	this.codigoProducto = codigoProducto;
	this.stock = stock;
	this.detalle = detalle;
	
	
	}
}
