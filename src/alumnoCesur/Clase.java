package alumnoCesur;

class Clase {
	private Profesor profesor;
	private String nombre;
	private int numAlumnos;
	static final int TOTALALUMNOS = 15;
	private Alumno[] alumnos;

	
	public Clase(String nombre) {

		numAlumnos = 0;
		this.nombre = nombre;
		alumnos = new Alumno[TOTALALUMNOS];
	}

	public Profesor getProfesor() {
		return profesor;
	}

	public void setProfesor(Profesor profesor) {
		this.profesor = profesor;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getNumAlumnos() {
		return numAlumnos;
	}

	public void setNumAlumnos(int numAlumnos) {
		this.numAlumnos = numAlumnos;
	}

	public Alumno[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumno[] alumnos) {
		this.alumnos = alumnos;
	}

	public static int getTotalalumnos() {
		return TOTALALUMNOS;
	}

	//METODOS
	public String toString() {
		return "[Clase:" + nombre + ", Profesor: "+ profesor+" + numAlumnos  " + numAlumnos + "]";

	}

	public void add(Alumno nuevoalumno) {
		if (numAlumnos <= 15) {
			alumnos[numAlumnos] = nuevoalumno;
			numAlumnos++;
		}

	}
}