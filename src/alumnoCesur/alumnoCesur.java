package alumnoCesur;

import practicas.Creator;
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

		
		for (int c = 0; c <15;c++) {
			premiumplus.add(new Alumno(Creator.newName(),Creator.newAge(),"DAM"));
			
		}
		//rrr
		
		
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
