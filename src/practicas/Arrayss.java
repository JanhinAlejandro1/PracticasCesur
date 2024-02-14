package practicas;

import java.util.Scanner;
import java.util.Random;

public class Arrayss {
	public static void main(String[] args) {
		// pedir por teclado el tamaño del array.
		// construir array de int de ese tamaño
		// pedir rango de valores que se quieren introducir
		// maximoy minimo [max...min]
		// intrducir esos valores en el array de forma aleatoria hata llenarlos
		// valores positivos

		// almacenar en un array los numero pares y en otro

		Random aleatorio = new Random();
		int[] arrays;
		int tamanoArray;
		Scanner teclado = new Scanner(System.in);

		System.out.println("cual es el tamaño de la array?");
		tamanoArray = teclado.nextInt();
		arrays = new int[tamanoArray];
		int max;
		int min;
		System.out.println("cual es el máximo");
		max = teclado.nextInt();
		System.out.println("cual es el minimo");
		min = teclado.nextInt();
int contadorPar=0;
int contadorImpar=0;
int [] arrayPar;
int[] arrayImpar;
int maxImpar=0;
int maxPar=0;

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = aleatorio.nextInt(min, max);
			System.out.println(arrays[i]+ " ");
			if (arrays[i]%2==0 ) {
				maxPar++;
			}
			else {
				maxImpar++;
				
			}
		}
		arrayPar= new int[maxPar];
		arrayImpar=new int[maxImpar];
		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = aleatorio.nextInt(min, max);
			System.out.println(arrays[i]+ " ");
			if (arrays[i]%2==0 ) {
				arrays [i]= arrayPar [contadorPar];
				contadorPar++;
				System.out.println(arrays[i]);
			}
			else {
			arrays[i]=arrayImpar[contadorPar];
			contadorPar++;
			System.out.println(arrays[i]);
			}
			}
			
		
		
	
	}
}