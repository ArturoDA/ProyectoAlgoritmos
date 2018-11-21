package Arreglos;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Clases.Producto;

public class ArregloProducto {

	//Atributos privados
private ArrayList<Producto> produc;
	//Constructor
public ArregloProducto() {
	produc = new ArrayList<Producto>();
	add.(new Producto(5, 20001, "Cartera", 50.5));
	cargarProductos();
}
	//OPeraciones publicas basicas
public void adicionar(Producto x) {
	produc.add(x);
}
public int tamaño() {
	return produc.size();
}
public Producto Obtener(int i) {
	return produc.get(i);
}
public Producto Buscar(int codigoProducto) {
	for (int i=0;i<tamaño();i++)
		if(Obtener(i).getCodigoProducto()==codigoProducto)
			return Obtener(i);
	return null;
}
public void eliminar(Producto x) {
	produc.remove(x);
}
	
public void grabarProductos() {
	try {
		PrintWriter pw;
		String linea;
		Producto x;
		pw = new PrintWriter(new FileWriter("productos.txt"));
		for (int i=0; i<tamaño(); i++) {
			x = Obtener(i);
			linea = x.getCodigoProducto() + ";" +
					x.getDetalle() + ";" +
					x.getPrecioUnitario() + ";" +
					x.getStock();
					
			pw.println(linea);
		}
		pw.close();
	}
	catch (Exception e) {	
	}
}






}
