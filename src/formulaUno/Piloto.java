package formulaUno;

public class Piloto extends Persona {
	//atributo
	private final int REFLEJOS;
	private final int INTELIGENCIA;
	private final int AGRESIVIDAD ;
	private int experiencia;
//constructor
	public Piloto(int edad, String nombre, int dni, int reflejos, int inteligencia, int agresividad, int experiencia) {
		super(edad, nombre, dni);
		this.REFLEJOS = reflejos;
		this.INTELIGENCIA = inteligencia;
		this.AGRESIVIDAD = agresividad;
		this.experiencia = experiencia;
	}
	//getter y setter
	public int getReflejos() {
		return REFLEJOS;
	}
	
	
	public int getInteligencia() {
		return INTELIGENCIA;
	}
	
	public int getAgresividad() {
		return AGRESIVIDAD;
	}
	
	
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	
}
