package ZooMexicano;

public class Acuaticos extends Animales {
	
	private int ambiente;
	private int numAletas;
	private int nivelAgresividad;
	
	public Acuaticos() {
		
	}
	
	public Acuaticos(String nombre, String paisOrigen, String fechaIngreso,
						int ambiente, int numAletas, int nivelAgresividad) {
		
		super(nombre, paisOrigen, fechaIngreso);
		
		this.ambiente = ambiente;
		this.numAletas = numAletas;
		this.nivelAgresividad = nivelAgresividad;
	}

	public String isAmbiente() {
		String ambiente = "";
		if(this.ambiente == 1) {
			ambiente = "Es agua dulce";
		} 
		else if (this.ambiente == 2) {
			ambiente = "Es agua salada";
		}
				
		return ambiente;
	}

	public void setAmbiente(int ambiente) {
		this.ambiente = ambiente;
		
	}

	public int getNumAletas() {
		return numAletas;
	}

	public void setNumAletas(int numAletas) {
		this.numAletas = numAletas;
	}

	public String getNivelAgresividad() {
		String levelAgresividad = "";
		if(this.nivelAgresividad == 1) {
			levelAgresividad = "Es poco Agresivo";
		} 
		else if (this.nivelAgresividad == 2) {
			levelAgresividad = "Es de agresividad normal";
		}
		else if (this.nivelAgresividad == 3) {
			levelAgresividad = "Es muy agresivo";
		} 
		
		return levelAgresividad;
	}

	public void setNivelAgresividad(int nivelAgresividad) {
		this.nivelAgresividad = nivelAgresividad;
	}

	@Override
	public String toString() {
		return "Acuaticos [Nombre = " + getNombre() + ", País de Origen = "
				 + getPaisOrigen() + ", Fecha de Ingreso = "
				+ getFechaIngreso() +", Tipo de ambiente=" + isAmbiente() + 
				", Cantidad Aletas = " + numAletas + ", nivelAgresividad=" + getNivelAgresividad()
				 + "]";
	}
	
	

}
