package formulaUno;

import java.util.Random;

public class JefeDeEscuderia extends Persona {
	//atributos
	private final int REFLEJOS;
	private final int INTELIGENCIA;
	private final int AGRESIVIDAD;
	private  int experiencia;
	//constructor
	public JefeDeEscuderia(int edad, String nombre, int dni, int reflejos, int inteligencia, int agresividad,
			int experiencia) {
		super(edad, nombre, dni);
		Random aleatorio=new Random();
		this.REFLEJOS = aleatorio.nextInt(10);
		this.INTELIGENCIA = aleatorio.nextInt(10);
		this.AGRESIVIDAD =aleatorio.nextInt(10);
		this.experiencia = experiencia;
	}
	//getter y setter
	public int getReflejos() {
		return REFLEJOS ;
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
