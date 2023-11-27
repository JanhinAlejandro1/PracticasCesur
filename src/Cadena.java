import java.util.Scanner;

public class Cadena {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cadena = "hola mundo";

		for (int contador = 0; contador < cadena.length(); contador++) {
			if (contador % 2 == 0) {
				System.out.println(cadena.charAt(contador));
			}
			else 
				System.out.println(cadena.toUpperCase().charAt(contador));
		
		}
		cadena=cadena.toUpperCase();
		System.out.println(cadena);
		System.out.println("-----------------------------");
		
		
		}
	
	
	
			public static void imprime (String[]args) {
				String cadena ="Hola mundo";
				int indice= 5
						System.out.println(cadena(indice));
			}
}
