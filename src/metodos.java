import java.util.Scanner;

public class metodos {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		int max;
		int min;
		int valor;
do {
		System.out.println("Escribe el maximo");
		max = teclado.nextInt();
		System.out.println("Escribe el minimo");
		min = teclado.nextInt();
} while(!metodos.comprobarmaxmin(max, min));


		do {
			System.out.print("Escribe el valor");
			valor = teclado.nextInt();
		} while (!metodos.comprobarValor(max, min, valor));

		System.out.println("Es cierto que el valor" + valor + "esta entre" + min + "y" + max + " ?");
		System.out.println(metodos.comprobarValor(max, min, valor));
		teclado.close();
	}

	static boolean comprobarValor(int max, int min, int valor) {
		if (valor >= min && valor <= max) {
			return true;
		}

		else {
			return false;
		}
	}

	static boolean comprobarmaxmin(int max, int min) {
		if (max >= min) {
			return true;
		}

		else {
			return false;
		}

	}
}
