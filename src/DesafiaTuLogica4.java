import java.util.Scanner;

public class DesafiaTuLogica4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int a = 0;
		int b = 0;
		int c = 0;

		System.out.println("introduce un número");
		a = teclado.nextInt();
		b = teclado.nextInt();
		c = teclado.nextInt();

		if (a >= b) {
			if (b >= c) {
				System.out.print(a);
				System.out.print(b);
				System.out.print(c);

			} else if (c >= b) {
				if (c >= a) {
					System.out.print(c);
					System.out.print(a);
					System.out.print(b);
				} else if (c <= a) {
					System.out.print(a);
					System.out.print(c);
					System.out.print(b);

				}
			}
		} else if (b >= a) {
			if (a >= c) {
				System.out.print(b+" "+ a+ " "+ c);
			} else if (c >= a) {
				if (c >= b) {
					System.out.print(c+""+ b+"" + a);
				} else if (c <= b) {
					System.out.print(b+""+c+""+ a);
				}
			}

		}
		teclado.close();
	}

}
