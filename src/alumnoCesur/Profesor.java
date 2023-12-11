package alumnoCesur;

public class Profesor extends Persona {
	String curso;

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public Profesor(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;
	}
	public String toString() {
		return ("[" + this.getNombre() + "]");
	}

}
