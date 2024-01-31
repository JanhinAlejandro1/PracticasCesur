package formulaUno;

import java.util.Random;

public class Cilindro {
	// atributos
	private int IdCilindro;
	private final int CAPACIDAD;
	private final int MATERIAL;
	private final Ingeniero INGENIERO;

//contructor
	public Cilindro(int idCilindro, Ingeniero iNGENIERO) {
		super();
		Random aleatorio = new Random();
		this.IdCilindro = idCilindro;
		this.CAPACIDAD = aleatorio.nextInt(10);
		this.MATERIAL = aleatorio.nextInt(10);
		this.INGENIERO = iNGENIERO;
	}

	// getter y setter
	public int getIdCilindro() {
		return IdCilindro;
	}

	public void setIdCilindro(int idCilindro) {
		this.IdCilindro = idCilindro;
	}

	public int getCAPACIDAD() {
		return CAPACIDAD;
	}

	public int getMATERIAL() {
		return MATERIAL;
	}

	public Ingeniero getINGENIERO() {
		return INGENIERO;
	}

}
