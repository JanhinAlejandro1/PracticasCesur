
public class alumnoCesur {

	public static void main(String[] args) {
		Alumno janhin = new Alumno("janhin", 27, "DAM");
		Alumno andres = new Alumno("Andres", 20, "DAM");
		Alumno paquillo = new Alumno("Paquillo", 18, "DAM");
		Alumno Santi = new Alumno("Santi", 22, "DAM");
		Alumno ramonsin = new Alumno("Ramonsin", 24, "DAM");
		Alumno juanca = new Alumno("juanca", 24, "DAM");
		Alumno alvaro = new Alumno("alvaro", 18, "DAM");
		Alumno adrian = new Alumno("adrian", 25, "DAM");
		Alumno alejandro = new Alumno("alejandro", 23, "DAM");
		Alumno sinri = new Alumno("Simira", 23, "DAM");
		Alumno ramon = new Alumno("ramon", 39, "DAM");
		Alumno dario = new Alumno("dario", 17, "DAM");
		Alumno juanan = new Alumno("Juanan", 26, "DAW");
		Clase premiumplus = new Clase("PremiumPlus");
		System.out.println(premiumplus);

		premiumplus.add(janhin);
		premiumplus.add(andres);
		premiumplus.add(paquillo);
		premiumplus.add(Santi);
		premiumplus.add(ramonsin);
		premiumplus.add(juanca);
		premiumplus.add(alvaro);
		premiumplus.add(adrian);
		premiumplus.add(alejandro);
		premiumplus.add(sinri);
		premiumplus.add(ramon);
		premiumplus.add(dario);
		premiumplus.add(juanan);
		System.out.println(premiumplus);
		for (int i = 0; i < premiumplus.getNumAlumnos(); i++) {
			if (premiumplus.getAlumnos()[i].getNombre() == "dario") {
				premiumplus.getAlumnos()[i].setEdad(18);
				System.out.println(premiumplus.getAlumnos()[i]);
			}
		
			if (premiumplus.getAlumnos()[i].getCurso() == "DAM")
				System.out.println("Los alumnos de DAM son:" + premiumplus.getAlumnos()[i] );
		}

			for (int c = 0; c < premiumplus.getNumAlumnos(); c++) {
				if (premiumplus.getAlumnos()[c].getCurso() =="DAW")
					System.out.println("Los alumnos de DAW son:" + premiumplus.getAlumnos()[c] );
			
		}
	} // finmain
}// fin alumnoCesur

class Alumno {

	String nombre;
	int edad;
	String curso;

	public Alumno(String nombre, int edad, String curso) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.curso = curso;

	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}

	public String toString() {
		return ("[Alumno:" + nombre + " Edad: " + edad + " Curso " + curso + "]");
	}
}

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
