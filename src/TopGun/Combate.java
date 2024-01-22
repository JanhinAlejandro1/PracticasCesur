package TopGun;

public class Combate extends Avion {
boolean esFurtivo;

public Combate(int idAvion, String modAvion, int capAvion, Piloto piloto, boolean esFurtivo) {
	super(idAvion, modAvion, capAvion, piloto);
	this.esFurtivo = esFurtivo;
}

public boolean isEsFurtivo() {
	return esFurtivo;
}

public void setEsFurtivo(boolean esFurtivo) {
	this.esFurtivo = esFurtivo;
}


}
