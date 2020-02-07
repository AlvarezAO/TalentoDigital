package ZooMexicano;

import java.util.ArrayList;

public class Zoologico {
	
	private ArrayList<Terrestres> listaTierra = new ArrayList<Terrestres>();
		
		public void addTierra(Terrestres uno) {
			listaTierra.add(uno);
		}
		
	private ArrayList<Acuaticos> listaAgua = new ArrayList<Acuaticos>();
		
		public void addAgua(Acuaticos uno) {
			listaAgua.add(uno);
		}
		
	private ArrayList<Voladores> listaAire = new ArrayList<Voladores>();
		
		public void addAire(Voladores uno) {
			listaAire.add(uno);
		}
		
		
	public void muestraTierra()	{
		for(Terrestres uno:listaTierra) {
			System.out.println(uno.toString());
		}
	}
	
	public void muestraAgua()	{
		for(Acuaticos uno:listaAgua) {
			System.out.println(uno.toString());
		}
	}
	
	public void muestraAire()	{
		for(Voladores uno:listaAire) {
			System.out.println(uno.toString());
		}
	}
		

}
