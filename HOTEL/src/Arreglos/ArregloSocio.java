package Arreglos;
import java.io.FileWriter;
import java.io.PrintWriter;
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
		public Socio obtener(int i) {
			return socio.get(i);
		}
		public Socio buscar(int codigoSocio) {
			for(int i=0; i<tamaño();i++)
				if(obtener(i).getCodigoSocio() == codigoSocio)
					return obtener(i);
			return null;
		}
		public void eliminar(Socio x) {
			socio.remove(x);
		}
		public void grabarSocio() {
			try {
				PrintWriter pw;
				String linea;
				Socio x;
				pw = new PrintWriter(new FileWriter("socio.txt"));
				for(int i = 0;i<tamaño();i++) {
					x = obtener(i);
					linea = x.getCodigoSocio() + ";" +
							x.getNombres() + ";" +
							x.getApellidos() + ";" +
							x.getDni() + ";" +
							x.getTelefono();
					pw.println(linea);
				}
				pw.close();
			}
			catch (Exception e) {
				
			}
		}
		private void cargarSocio() {
			
		}
	

}
