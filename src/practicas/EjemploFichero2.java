package practicas;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EjemploFichero2 {

	public static void main(String[] args) throws IOException {
		// pedir una frase por pantalla e introducirla en el fichero
		// pruebaFichero.txt.
		// luego mostrar por panatalla el contenido del fichero

		Scanner teclado = new Scanner(System.in);
		FileOutputStream salida = null;
		FileInputStream entrada = null;
		String frase;
		int[] arrayFrase;
		frase = teclado.nextLine();
		arrayFrase = new int[frase.length()];
		try {
			salida = new FileOutputStream("PruebaFichero.txt");

			for (int i = 0; i < frase.length(); i++) {

				arrayFrase[i] = (int)frase.charAt(i);
				salida.write(arrayFrase[i]);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();

		}finally {
			
			if(salida!=null) {
				salida.close();
			}
		}
//////////////////// in
		try {
			entrada = new FileInputStream("PruebaFichero.txt");
			int asci;
			asci=entrada.read();
			while (asci!=-1) {//el fichero esta vacio 
			System.out.print((char)asci);
			asci=entrada.read();
			
			}
		} catch (Exception e) {

		} finally {
			if (entrada != null) {
				try {
					entrada.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		}
	}

}
