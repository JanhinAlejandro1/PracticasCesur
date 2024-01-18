package practicas;

import java.util.Random;

public class SimuladorLista {

	public static void main(String[] args) {

		Random aleatorio = new Random();

		Miarray lista = new Miarray(100);

		System.out.println();
		int contadorPar = 0;
		int contadorImpar = 0;
//insertar números
		for (int i = 0; i < 100; i++) {
			lista.insertarValor(aleatorio.nextInt(10));
			
		}
		// números pares
		System.out.println("los numero pares son:");
		// contador de pares
		for (int i = 0; i < 100; i++) {
			if (lista.getIntMiArray(i) % 2 == 0) {
				contadorPar++;

			} else {
				contadorImpar++;
			}

		}
		// meter pares e impares
		Miarray arrayPar = new Miarray(contadorPar);
		Miarray arrayImpar = new Miarray(contadorImpar);
		for (int i = 0; i < 100; i++) {
			if (lista.getIntMiArray(i) % 2 == 0) {
				arrayPar.insertarValor(lista.getIntMiArray(i));

			} else {
				arrayImpar.insertarValor(lista.getIntMiArray(i));

			}

		}

		for (int i = 0; i < 100; i++) {
			if (lista.getIntMiArray(i) % 2 == 0) {
				System.out.print(lista.getIntMiArray(i) + " ");
			}
		}
		System.out.println();

		for (int i = 0; i < arrayPar.getNumElem(); i++) {

			System.out.print(arrayPar.getIntMiArray(i) + " ");
		}

	}
}

// almacena enteros positivos
class Miarray {
	// atributos
	private int[] miArray;
	private int numElem;
	private static final int LONGITUD = 10;

//constructor
	Miarray(int longitud) {
		numElem = 0;
		miArray = new int[longitud];
		for (int c = 0; c < longitud; c = c + 1) {
			miArray[c] = -1;
		}
	}

	Miarray() {
		numElem = 0;

		miArray = new int[10];
		miArray = new int[LONGITUD];
		for (int i = 0; i < miArray.length; i = i + 1) {

			miArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMiArray() {
		return miArray;
	}

	public int getIntMiArray(int posicion) {

		if ((posicion < miArray.length) && (posicion >= 0)) {
			return miArray[posicion];

		} else {
			return -1;
		}
	}

	public void resetrar() {
		for (int c = 0; c < miArray.length; c = c + 1) {
			miArray[c] = -1;
		}
	}

	public void insertarValor(int valor) {
		if (numElem == miArray.length) {
			System.out.println(" array lleno, no se ha insertado elemento");

		} else {
			miArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp = miArray[numElem - 1];
			numElem--;
			miArray[numElem] = -1;
			return temp;

		}

	}

	public int sacarValorPrimer() {
		int temp;
		if (numElem == 0) {
			return -1;
		}

		else {
			numElem--;
			temp = miArray[0];
			// reducir en 1 num elem y meter los valores en posicion anterios

			for (int i = 0; i < numElem - 1; i++) {
				miArray[i] = miArray[i + 1];

			}
			miArray[numElem - 1] = -1;

			numElem--;
			return temp;

		}
	}
}
