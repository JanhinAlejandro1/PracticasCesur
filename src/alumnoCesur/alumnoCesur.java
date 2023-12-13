package alumnoCesur;

import practicas.Creator;
import java.util.Random;

public class alumnoCesur {

	public static void main(String[] args) {
		CentroEstudio cesurEste = new CentroEstudio("CESUR El Palo", 5, 4);
		CentroEstudio cesurPTA = new CentroEstudio("CESUR DEL PTA");
		System.out.println(cesurEste);
		System.out.println(cesurPTA);
		Clase claseTemp;
		String nombreClaseTemp;
		
		Random aleatorio=new Random();
		
		for (int i = 0; i < 5; i++) {
			nombreClaseTemp = Creator.newClase();
			claseTemp = new Clase(Creator.newClase());
			// meto un profesor aleatorio en la clasei-ésima.
			claseTemp.setProfesor(new Profesor(Creator.newName(), Creator.newAge(), Creator.newClase()));
			for (int j = 0; j < 15; j++) {
				claseTemp.add(new Alumno(Creator.newName(), Creator.newAge(), nombreClaseTemp));
			}
			cesurEste.getClases()[i] = claseTemp;

		}
		Administrativo adminTemp;
		for(int i=0; i<4;i++) {
			adminTemp=new Administrativo( 
			Creator.newName(),
			Creator.newAge(),
			aleatorio.nextBoolean());
		}
    System.out.println( );
	}
}
