package practicas;

import java.util.Scanner;

public class Palindromo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		System.out.println("escribe una palabra:");
		String palabra = teclado.nextLine();
		char[] cadena = palabra.toCharArray();
		teclado.close();
//longitud par
		int j = cadena.length;
		boolean esPalindromo = true;
		int i = 0;
		while (esPalindromo && (i < cadena.length / 2)) {
			j--;
			if (cadena[i] != cadena[j]) {
				esPalindromo = false;

			}
			i++;
		}
		System.out.println("la palabra es palindramo: " + esPalindromo);

	}

}
