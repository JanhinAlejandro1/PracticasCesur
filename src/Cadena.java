import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena="Hola mundo";
		int indice=5;
		for (int contador = 0; contador < indice; contador++) {
			if (contador % 2 == 0) {
				System.out.println(cadena.toLowerCase().charAt(contador));
			} else {
				System.out.println(cadena.charAt(contador));
	}
		}
	}

	public static void imprime(String cadena, int indice) {

		System.out.println(cadena.charAt(indice));

		for (int contador = 0; contador < indice; contador++) {
			if (contador % 2 == 0) {
				System.out.println(cadena.toLowerCase().charAt(contador));
			} else {
				System.out.println(cadena.charAt(contador));
			}
		}	
}
}
