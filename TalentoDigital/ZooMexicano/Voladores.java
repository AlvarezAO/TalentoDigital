package ZooMexicano;

public class Voladores extends Animales {
	
	private String colorPluma;
	private int size;
	private boolean migrante;
	
	public Voladores() {
		
	}
	
	public Voladores(String nombre, String paisOrigen, String fechaIngreso,
						String colorPluma, int size, boolean migrante) {
		
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

	public boolean isMigrante() {
		return migrante;
	}

	public void setMigrante(boolean migrante) {
		this.migrante = migrante;
	}

	@Override
	public String toString() {
		return "Voladores [colorPluma=" + colorPluma + ", size=" + size + ", migrante=" + migrante + ", getNombre()="
				+ getNombre() + ", getPaisOrigen()=" + getPaisOrigen() + ", getFechaIngreso()=" + getFechaIngreso()
				+ "]";
	}
	
	

}
