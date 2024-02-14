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

		for (int i = 0; i < arrays.length; i++) {
			arrays[i] = aleatorio.nextInt(min, max);
			System.out.println(arrays[i]+ " ");
		}
		
		
	}
}
