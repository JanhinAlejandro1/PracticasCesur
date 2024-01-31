package formulaUno;

import java.util.Random;

public class Ingeniero extends Persona{
	//atributos
	private final int INTELIGENCIA;
	private final int INNOVACION;
	private int experiencia;
	//constructor
	public Ingeniero(int edad, String nombre, int dni, int inteligencia, int innovacion, int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio= new Random();
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.INNOVACION = aleatorio.nextInt(10);
		this.experiencia = experiencia;
	}
	//getter y setter
	public int getInteligencia() {
		return INTELIGENCIA;
	}
	
	
	public int getInnovacion() {
		return INNOVACION;
	}
	
	
	public int getExperiencia() {
		return experiencia;
	}
	public void setExperiencia(int experiencia) {
		this.experiencia = experiencia;
	}
	

}
