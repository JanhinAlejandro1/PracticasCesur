package formulaUno;
import java.util.Random;
public class Turbo {
	// atributos
	int idTurbo;
	private final int RPM;
	private final int TAMAÑO;
	private Ingeniero INGENIERO;

//contructor
	public Turbo(int idTurbo, Ingeniero INGENIERO) {
		super();
		Random aleatorio = new Random();
		this.idTurbo = idTurbo;
		this.RPM = aleatorio.nextInt(10);
		this.TAMAÑO = aleatorio.nextInt(10);
		this.INGENIERO = INGENIERO;
		
		

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

	public Ingeniero getIngeniero() {
		return INGENIERO;
	}
	public void setIngeniero(Ingeniero ingeniero) {
		this.INGENIERO = ingeniero;

	}
}

