package practicas;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class EjemploFichero {

	public static void main(String[] args) {
		
		FileInputStream entrada = null;
		FileOutputStream salida=null;

		try {
			entrada = new FileInputStream("PruebaFichero.txt");
			int asci;
			asci=entrada.read();
			while (asci!=-1) {//el fichero esta vacio 
			System.out.print((char)asci+" ");
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
	
/////////////////////////output


try {
	salida = new FileOutputStream("PruebaFichero.txt");
	salida.write(72);
	
	
} catch (Exception e) {
	System.out.println(e.getMessage());
} finally {
	if (salida != null) {
		
			if (salida !=null) {
			try {
				salida.close();
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		
		

	}
}
}
}
}