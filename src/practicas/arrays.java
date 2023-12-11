package practicas;
import java.util.Random;

public class arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random aleatorio;
		aleatorio = new Random();
		int[] listaInteger = new int[10];

		int contadorPar = 0;
		int contadorImpar = 0;
		int[] listaPar;
		int[] listaImpar;
		int contadorP;
		int contadorI;
	
		System.out.print("el array inicial es: [");
		for (int c = 0; c <= 9; c++) {

			listaInteger[c] = c;
			System.out.print(listaInteger[c] + " ");

		}
		System.out.println("]");

		for (int indice = 0; indice < listaInteger.length; indice++) {

			if (listaInteger[indice] % 2 == 0) {
				contadorPar++;
			} else {
				contadorImpar++;
			}

		}
		System.out.println();

		listaPar = new int[contadorPar];
		listaImpar = new int[contadorImpar];

		contadorP = 0;
		contadorI = 0;
		for (int indice = 0; indice < listaInteger.length; indice++) {
		
				listaInteger[indice] =  aleatorio;
				}
		for (int indice = 0; indice < listaInteger.length; indice++) {
			if (listaInteger[indice] % 2 == 0) {
				listaPar[contadorP] = listaInteger[indice];
				contadorP++;

			} else {
				listaImpar[contadorI] = listaInteger[indice];
				contadorI++;
			}

		}
		System.out.print("el array de pares [");
		for (int indice = 0; indice < contadorPar; indice++) {
			System.out.print(listaPar[indice]+",");
		}
		
		System.out.println("]");
		System.out.print("el array de impares [");
		
		for (int indice = 0; indice < contadorImpar; indice++)
			System.out.print(listaImpar[indice]+",");
		System.out.println("]");
	}//fin array

}
