import java.util.Scanner;

public class numeroCifra {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int primerNum;
		int ultimoNum;
		int num;
		int contador = 0;
        int num1;
		do {
			num = teclado.nextInt();
			num1=num;
		} while (num < 0);
		

//blucle contador
		while (num > 0) {
			contador++;
			num= num / 10;
		
		}
		
		System.out.println("el numero de cifras es " + contador);
		
		
		
		
		
		primerNum = num1 % 10;
		
		do {
			num1=num1/10;
				
		}while (num1 >10);
		ultimoNum = num1 %10;
		
		System.out.println("el último numero es " + primerNum);
		System.out.println("el primer numero es " + ultimoNum);

		
		teclado.close();
	}

}