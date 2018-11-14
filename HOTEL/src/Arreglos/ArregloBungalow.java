package Arreglos;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import Clases.Bungalow;

public class ArregloBungalow 
{ 
  private ArrayList <Bungalow> Bungalow;
  
  public ArregloBungalow() 
  {
	  Bungalow= new ArrayList <Bungalow> ();
	  CargarBungalow();
  }
  public void adicionar(Bungalow x)
  {
	  Bungalow.add(x);
  }
  public int tamaño() 
  {
	return Bungalow.size();  
  }
  public Bungalow Obtener(int i)
  {
	  return Bungalow.get(i);
  }
  
  public Bungalow buscar (int numeroBungalow)
  {
	  for (int i=0; i<tamaño(); i++)
		  if (Obtener(i).getNumeroBungalow()== numeroBungalow)
			  return Obtener(i);
	  return null;
  }
  public void eliminar (Bungalow x)
  { Bungalow.remove (x);}
public void grabarBungalow() 
{ try {
	PrintWriter pw;
	String linea;
	Bungalow x;
	pw= new PrintWriter(new FileWriter("Bungalow.txt"));
	for(int i=0; i<tamaño(); i++) 
	{ x= Obtener(i);
	linea= x.getNumeroBungalow() +";"+
	       x.getCategoria() + ";" +
		   x.getPrecioDia() + ";" +
	       x.getEstado();
	pw.println(linea);
	}
	pw.close();
}
catch (Exception e) {}
	}
private void CargarBungalow() 
{  try {
        BufferedReader br;
        String linea;
        String[]s;
        int numeroBungalow, categoria,estado;
        double precioDia;
        br=new BufferedReader(new FileReader("Bungalow.txt"));
        while((linea=br.readLine()) !=null) {
        	s= linea.split(",");
        	numeroBungalow = Integer.parseInt(s[0].trim());
        	categoria = Integer.parseInt(s[1].trim());
        	precioDia = Double.parseDouble(s[2].trim());
        	estado = Integer.parseInt(s[3].trim());
        	adicionar (new Bungalow(numeroBungalow,categoria,estado,precioDia));
        }
        br.close();
}
catch (Exception e) {}
}
 public int numeroCorrelativo() 
 {
	 if(tamaño()==0)
		 return 30001;
	 else {
		 int ultimoNumero = Obtener(tamaño()-1).getNumeroBungalow();
		 return ultimoNumero+1;
	 }
 }
}

