package uni1a;

public class Investigador {
	private String nombre;
	private String especializacion;
	private String afiliacion;
	
	public Investigador(String nombre, String especializacion, String afiñiacion) {
		this.nombre = nombre;
		this.especializacion = especializacion;
		this.afiliacion = afiñiacion;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getEspecializacion() {
		return especializacion;
	}
	
	public void setEspecializacion(String especializacion) {
		this.especializacion = especializacion;
		
	}
	
	public String getAfiliacion() {
		return afiliacion;
	}
	
	public void setAfiliacion(String afiliacion) {
		this.afiliacion= afiliacion;
	}

}
