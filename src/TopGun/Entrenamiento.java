package TopGun;

public class Entrenamiento extends Avion {
private boolean tieneDobleMando;
//constructor
public Entrenamiento(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean tieneDobleMando) {
	super(idAvion, modAvion, capAvion, piloto);
	this.tieneDobleMando = tieneDobleMando;
}
//getter y setter
public boolean isTieneDobleMando() {
	return tieneDobleMando;
}
public void setTieneDobleMando(boolean tieneDobleMando) {
	this.tieneDobleMando = tieneDobleMando;
}

}
