package formulaUno;

public class Ingeniero extends Persona{
	//atributos
	private int inteligencia;
	private int innovacion;
	private int experiencia;
	//constructor
	public Ingeniero(int edad, String nombre, int dni, int inteligencia, int innovacion, int experiencia) {
		super(edad, nombre, dni);
		this.inteligencia = inteligencia;
		this.innovacion = innovacion;
		this.experiencia = experiencia;
	}
	//getter y setter
	public int getInteligencia() {
		return inteligencia;
	}
	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	public int getInnovacion() {
		return innovacion;
	}
	public void setInnovacion(int innovacion) {
		this.innovacion = innovacion;
	}
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	

}
