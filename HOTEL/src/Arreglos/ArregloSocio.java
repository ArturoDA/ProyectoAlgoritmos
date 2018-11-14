package Arreglos;
import java.util.ArrayList;

import Clases.Socio;
public class ArregloSocio {
	//Atributos privados
	private ArrayList<Socio> socio;
	//Constructor
	public ArregloSocio() {
		socio = new ArrayList<Socio>();
		cargarSocio();
	}
	//Operaciones publicas basicas
	public void adicionar(Socio x) {
		socio.add(x);
	}
	public int tamaño() {
		return socio.size();
	}
	

}
