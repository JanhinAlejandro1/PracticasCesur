package practicas;

public class objetos {

	public static void main(String[] args) {

		String[] cadenaInicial=new String[10];
		for(int i=0;i<3;i++){
			cadenaInicial[i]="hola";
		}
			listaFijaCadena cadena1;
			cadena1= new listaFijaCadena (4, cadenaInicial);
			System.out.println("num elementros:" + cadena1.getNumeroElementos());
			for (int i=0;i<cadena1.getNumeroElementos();i++) {
				System.out.println(cadena1.getArray()[i]);
			// TODO Auto-generated method stub
		}
	}
}

class listaFijaCadena {
	public listaFijaCadena(int numeroElementos, String[] array) {
	
		this.numeroElementos = numeroElementos;
		this.array = array;
	}
	public int getNumeroElementos() {
		return numeroElementos;
	}
	public void setNumeroElementos(int numeroElementos) {
		this.numeroElementos = numeroElementos;
	}
	public String[] getArray() {
		return array;
	}
	public void setArray(String[] array) {
		this.array = array;
	}
	public static int getMaxnum() {
		return MAXNUM;
	}
	private int numeroElementos;
	private String[] array= new String[10];
	private static final int MAXNUM = 10;

}
