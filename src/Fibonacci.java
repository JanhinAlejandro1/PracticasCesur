
public class Fibonacci {

	public static void main(String[] args) {
		int maxNumFib = 100;
		int actual = 1;
		int suma = 1;
System.out.print("1 ");
		for (int i = 0; i < maxNumFib; i++) {
			suma = actual + suma;
			actual = suma - actual;
			System.out.print(actual + " ");

		}

	}

}
