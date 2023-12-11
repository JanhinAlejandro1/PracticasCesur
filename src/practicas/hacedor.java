package practicas;

public class hacedor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// devuelve un String que es la unión de los dos parámetros de entrada.
	static String uneCadenas(String cadena1, String cadena2) {
		return cadena1 + cadena2;
	}

	// modifica el String de entrada a mayusculas o minúsculas del segundo parámetro
	static String pasoCadenaA(String cadena, boolean mayuscula) {
		if (mayuscula == true) {
			return cadena.toUpperCase();
		} else {
			return cadena.toLowerCase();
		}

	}

	// devuvelve el número de ocurrencia de un caracater pasado como parámetro en el
	// STring pasado
	static int numOcurrenciasChar(String cadena, char caracter) {
		int contador = 0;
		for (int indice = 1; indice <= cadena.length(); indice++) {
			if (cadena.charAt(indice) == caracter) {
				contador++;
			}

		}
		return contador;
	}
}
