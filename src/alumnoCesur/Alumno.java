package alumnoCesur;

class Alumno extends Persona {

	
	String curso;
//Constructor
	public Alumno(String nombre, int edad, String curso) {
		super(nombre, edad);
		this.curso = curso;

	}

	
	//getter y setter

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("[Alumno:" + super.getNombre() + " Edad: " + super.getEdad() + " Curso " + curso + "]");
	}
}//fin alumno