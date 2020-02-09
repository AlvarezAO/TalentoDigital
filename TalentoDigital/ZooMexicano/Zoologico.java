package ZooMexicano;

import java.util.ArrayList;

public class Zoologico {
	
	private ArrayList<Terrestres> listaTierra = new ArrayList<Terrestres>();
		
		public void addTierra(Terrestres variableAgrega) {
			listaTierra.add(variableAgrega);
		}
		
	private ArrayList<Acuaticos> listaAgua = new ArrayList<Acuaticos>();
		
		public void addAgua(Acuaticos variableAgrega) {
			listaAgua.add(variableAgrega);
		}
		
	private ArrayList<Voladores> listaAire = new ArrayList<Voladores>();
		
		public void addAire(Voladores variableAgrega) {
			listaAire.add(variableAgrega);
		}
		
	public int sizeTierra() {
		int tamanioLista = listaTierra.size();
		return tamanioLista;
	}
	
	public int sizeAgua() {
		int tamanioLista = listaAgua.size();
		return tamanioLista;
	}
	
	public int sizeAire() {
		int tamanioLista = listaAire.size();
		return tamanioLista;
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
