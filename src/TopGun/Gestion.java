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
String nomPiloto4 = teclado.nextLine();
System.out.println("Escriba sus horas de vuelvo" );
String horasVueloPiloto4 = teclado.nextLine();
System.out.println("escriba su rango" );
String rangoPiloto4 = teclado.nextLine();

//piloto5
System.out.println("Escriba nombre del piloto" );
String nomPiloto5 = teclado.nextLine();
System.out.println("Escriba sus horas de vuelvo" );
String horasVueloPiloto5 = teclado.nextLine();
System.out.println("escriba su rango" );
String rangoPiloto5 = teclado.nextLine();









teclado.close();

System.out.println();

	}

}
