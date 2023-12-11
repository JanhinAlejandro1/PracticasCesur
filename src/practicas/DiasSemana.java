package practicas;
import java.util.Scanner;

public class DiasSemana {
	public static void main(String[] args) {

		System.out.println();
		Scanner teclado = new Scanner(System.in);
		int mes = 0;
		int semana = 0;
		int diaSemana;
		int ano = 0;
		int TotalDias = 0;
		int mesCompleto=0;
		int mesIncompleto = 0;
		int semanaIcompleta= 0;
		int diasSueltos=0;
		
		
		
		do {

			System.out.println("introduce un número");
			TotalDias = teclado.nextInt();
		    mesCompleto=TotalDias/28;
		}while (TotalDias > 336 || TotalDias < 0);

		  while (mes < mesCompleto) {
			semana = 0;

			switch (ano) {
			case 0:
				System.out.print("Enero");
				break;
			case 1:
				System.out.print("Febrero");
				break;
			case 2:
				System.out.print("Marzo");
				break;
			case 3:
				System.out.print("Abril");
				break;
			case 4:
				System.out.print("Mayo");
				break;
			case 5:
				System.out.print("Junio");
				break;
			case 6:
				System.out.print("Julio");
				break;
			case 7:
				System.out.print("Agosto");
				break;
			case 8:
				System.out.print("Septiembre");
				break;
			case 9:
				System.out.print("Octubre");
				break;
			case 10:
				System.out.print("Noviembre");
				break;
			case 11:
				System.out.print("Diciembre");
				break;
			}
			ano++;
			while (semana < 4) {
				diaSemana = 1;
				while (diaSemana < 8) {
					switch (diaSemana) {
					case 1:

						System.out.print("[");
						System.out.print("L");
						System.out.print(" ");
						break;
					case 2:

						System.out.print("M");
						System.out.print(" ");
						break;
					case 3:

						System.out.print("X");
						System.out.print(" ");
						break;
					case 4:

						System.out.print("J");
						System.out.print(" ");
						break;
					case 5:

						System.out.print("V");
						System.out.print(" ");
						break;
					case 6:

						System.out.print("S");
						System.out.print(" ");
						break;
					case 7:

						System.out.print("D");
						System.out.print("]");
						break;

					}
					diaSemana = diaSemana + 1;
				}
				semana++;

			}
			mes++;
			System.out.println();
			;
		}
		  teclado.close();
		  
	}
}
