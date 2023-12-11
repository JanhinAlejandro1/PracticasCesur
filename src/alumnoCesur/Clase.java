package alumnoCesur;

class Clase {

	private String nombre;
	private int numAlumnos;
	private Alumno[] alumnos;

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	static final int TOTALALUMNOS = 15;

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

	public Clase(String nombre) {

		numAlumnos = 0;
		this.nombre = nombre;
		alumnos = new Alumno[TOTALALUMNOS];
	}

	public String toString() {
		return "[Clase:" + nombre + " numero alumno: " + numAlumnos + "]";

	}

	public void add(Alumno nuevoalumno) {
		if (numAlumnos <= 15) {
			alumnos[numAlumnos] = nuevoalumno;
			numAlumnos++;
		}

	}
}