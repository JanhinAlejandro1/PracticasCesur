package formulaUno;
import java.util.Random;
public class Turbo {
	// atributos
	int idTurbo;
	private final int RPM;
	private final int TAMAÑO;
	private final int ingeniero;

//contructor
	public Turbo(int idTurbo, int ingeniero ) {
		super();
		Random aleatorio = new Random();
		this.idTurbo = idTurbo;
		this.RPM = aleatorio.nextInt(10);
		this.TAMAÑO = aleatorio.nextInt(10);
		this.ingeniero = ingeniero;
		
		

	}
//getter y setter

	public int getIdTurbo() {
		return idTurbo;
	}

	public void setIdTurbo(int idTurbo) {
		this.idTurbo = idTurbo;
	}

	public int getRpm(int rpm) {
		return RPM;
	}

	public int getTamaño(int tamaño) {
	return TAMAÑO;
	}

public int getIngeniero() {
	return idTurbo;

public void setIngeniero(Ingeniero ingeniero) {
	this.ingeniero = ingeniero;
}

}

}
