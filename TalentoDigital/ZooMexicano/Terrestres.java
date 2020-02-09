package ZooMexicano;

public class Terrestres extends Animales {
	private int cantPatas;
	private String tipoAlimentacion;
	private int horasSueno;
	
	public Terrestres(String nombre, String paisOrigen, String fechaIngreso,
						int cantPatas, String tipoAlimentacion, int horasSueno) {
		
		super(nombre, paisOrigen, fechaIngreso);
		
		this.cantPatas = cantPatas;
		this.tipoAlimentacion = tipoAlimentacion;
		this.horasSueno = horasSueno;
	}

	public int getCantPatas() {
		return cantPatas;
	}

	public void setCantPatas(int cantPatas) {
		this.cantPatas = cantPatas;
	}

	public String getTipoAlimentacion() {
		return tipoAlimentacion;
	}

	public void setTipoAlimentacion(String tipoAlimentacion) {
		this.tipoAlimentacion = tipoAlimentacion;
	}

	public int getHorasSueno() {
		return horasSueno;
	}

	public void setHorasSueno(int horasSueno) {
		this.horasSueno = horasSueno;
	}

	@Override
	public String toString() {
		return "Terrestres [Nombre = " + getNombre() + ", País de Origen = " + getPaisOrigen()
				+ ", Fecha Ingreso = " + getFechaIngreso() + ", Cantidad de Patas = " + cantPatas + ","
				+ " Tipo Alimentacion= " + tipoAlimentacion + ", Horas de sueño = " + horasSueno + " ]";
	}
	
	

}
