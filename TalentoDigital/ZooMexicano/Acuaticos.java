package ZooMexicano;

public class Acuaticos extends Animales {
	
	private boolean ambiente;
	private int numAletas;
	private int nivelAgresividad;
	
	public Acuaticos() {
		
	}
	
	public Acuaticos(String nombre, String paisOrigen, String fechaIngreso,
						boolean ambiente, int numAletas, int nivelAgresividad) {
		
		super(nombre, paisOrigen, fechaIngreso);
		
		this.ambiente = ambiente;
		this.numAletas = numAletas;
		this.nivelAgresividad = nivelAgresividad;
	}

	public boolean isAmbiente() {
		return ambiente;
	}

	public void setAmbiente(boolean ambiente) {
		this.ambiente = ambiente;
	}

	public int getNumAletas() {
		return numAletas;
	}

	public void setNumAletas(int numAletas) {
		this.numAletas = numAletas;
	}

	public int getNivelAgresividad() {
		return nivelAgresividad;
	}

	public void setNivelAgresividad(int nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}

	@Override
	public String toString() {
		return "Acuaticos [ambiente=" + ambiente + ", numAletas=" + numAletas + ", nivelAgresividad=" + nivelAgresividad
				+ ", getNombre()=" + getNombre() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaIngreso()="
				+ getFechaIngreso() + "]";
	}
	
	

}
