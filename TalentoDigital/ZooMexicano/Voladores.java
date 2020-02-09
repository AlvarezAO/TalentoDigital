package ZooMexicano;

public class Voladores extends Animales {
	
	private String colorPluma;
	private int size;
	private int migrante;
	
	public Voladores() {
		
	}
	
	public Voladores(String nombre, String paisOrigen, String fechaIngreso,
						String colorPluma, int size, int migrante) {
		
		super(nombre, paisOrigen, fechaIngreso);
		
		this.colorPluma = colorPluma;
		this.size = size;
		this.migrante = migrante;
	}

	public String getColorPluma() {
		return colorPluma;
	}

	public void setColorPluma(String colorPluma) {
		this.colorPluma = colorPluma;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String isMigrante() {
		String migranteRespuesta = "";
		if (this.migrante == 1) {
			migranteRespuesta = "Es un animal migrante";
		}else {
			migranteRespuesta = "Es un animal No migrante";
		}
		return migranteRespuesta;
	}

	public void setMigrante(int migrante) {
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "Voladores [Nombre = " + getNombre() + ", País de Origen = " + 
				 getPaisOrigen() + ", Fecha de Ingreso = " + getFechaIngreso() +
				 " Color de Pluma = " + colorPluma + ", size = " + size + 
				 "cms, migrante = " + isMigrante() + "]";
	}
	
	

}
