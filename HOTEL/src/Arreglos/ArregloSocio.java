package Arreglos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Clases.Socio;
import java.io.IOException;
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
			try {
				BufferedReader br;
				String linea;
				String[] s;
				int codigoSocio;
				String nombre, apellidos, telefono, dni;
				br = new BufferedReader(new FileReader("socios.txt"));
				while ((linea = br.readLine()) != null) {
					s = linea.split(";");
					codigoSocio = Integer.parseInt(s[0].trim());
					nombre = s[1].trim();
					apellidos = s[2].trim();
					telefono = s[3].trim();
					dni = s[4].trim();
					adicionar(new Socio(codigoSocio, nombre, apellidos, telefono, dni));
				}
				br.close();
			}
			catch (Exception e) {
			}
			
		}
	//Operaciones publicas complementarias
		public int codigoCorrelativo() {
			if (tamaño() == 0)
				return 10001;
			else {
				int ultimoCodigo = obtener(tamaño()-1).getCodigoSocio();
				return ultimoCodigo + 1;
			}
		}

}
