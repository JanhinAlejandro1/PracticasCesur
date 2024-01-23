package TopGun;
import java.util.Scanner;
public class Gestion {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
Piloto piloto1=new Piloto(1, "Pete Maverick", 10000, "capitan");
Piloto piloto2=new Piloto(2, "Natasha Phoenix", 3000, "teniente");
Piloto piloto3=new Piloto(3, "Bradley Rooste", 3500, "teniente");


//piloto 4
System.out.println("Escriba nombre del piloto" );
String nomPiloto = teclado.nextLine();
System.out.println("Escriba sus horas de vuelvo" );
int horasVueloPiloto = teclado.nextInt();
System.out.println("escriba su rango" );
teclado.nextLine();
String rangoPiloto = teclado.nextLine();

Piloto piloto4=new Piloto(4, nomPiloto, horasVueloPiloto, rangoPiloto);
//piloto5

System.out.println("Escriba nombre del piloto" );
nomPiloto = teclado.nextLine();
System.out.println("Escriba sus horas de vuelvo" );
 horasVueloPiloto = teclado.nextInt();
System.out.println("escriba su rango" );
teclado.nextLine();
rangoPiloto = teclado.nextLine();
Piloto piloto5=new Piloto(5, nomPiloto, horasVueloPiloto, rangoPiloto);




teclado.close();

System.out.println("los 2 primeros pilotos son:");
piloto1.mostrarPiloto();
piloto3.mostrarPiloto();

System.out.println("los 2 siguientes pilotos son:");
piloto4.mostrarPiloto();
piloto5.mostrarPiloto();


Entrenamiento avion1=new Entrenamiento(1,"falcon",2,piloto1,true) ;
Combate avion2=new Combate(2,"falcon2",2,piloto2,true);
Combate avion3=new Combate (3,"falcon3",2,piloto3, false);












	}

}
