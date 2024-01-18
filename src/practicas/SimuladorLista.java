package practicas;

public class SimuladorLista {

	public static void main(String[] args) {

		Miarray yo = new Miarray(100);
		for (int i = 0; i < 100; i++) {
			yo.insertarValor(i + 10);
		}

		Miarray antonio;
		Miarray anthony;
		antonio = new Miarray();
		anthony = new Miarray(40);

		antonio.numElem = 4;

		anthony.numElem = 8;
	}
}

// almacena enteros positivos
class Miarray {
	// atributos
	public int[] myArray;
	public int numElem;
	public static final int LONGITUD = 10;

//constructor
	Miarray(int longitud) {
		numElem = 0;
		myArray = new int[longitud];
		for (int c = 0; c < longitud; c = c + 1) {
			myArray[c] = -1;
		}
	}

	Miarray() {
		numElem = 0;

		myArray = new int[10];
		myArray = new int[LONGITUD];
		for (int i = 0; i < myArray.length; i = i + 1) {

			myArray[i] = -1;
		}
	}

	// metodos
	public int getNumElem() {
		return numElem;
	}

	public void setNumElem(int numElem) {
		this.numElem = numElem;
	}

	public int[] getMyArray() {
		return myArray;
	}

	public int getIntMyArray(int posicion) {

		if ((posicion < myArray.length) && (posicion > 0)) {
			return myArray[posicion];

		} else {
			return -1;
		}
	}

	public void resetrar() {
		for (int c = 0; c < myArray.length; c = c + 1) {
			myArray[c] = -1;
		}
	}

	public void insertarValor(int valor) {
		if (numElem == myArray.length) {
			System.out.println(" array lleno, no se ha insertado elemento");

		} else {
			myArray[numElem] = valor;
			numElem++;
		}
	}

	public int sacarValorUltimo() {
		int temp;
		if (numElem == 0) {
			return -1;
		} else {
			temp = myArray[numElem - 1];
			numElem--;
			myArray[numElem] = -1;
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
			temp = myArray[0];
			// reducir en 1 num elem y meter los valores en posicion anterios

			for (int i = 0; i < numElem - 1; i++) {
				myArray[i] = myArray[i + 1];

			}
			myArray[numElem - 1] = -1;

			numElem--;
			return temp;

		}
	}
}
