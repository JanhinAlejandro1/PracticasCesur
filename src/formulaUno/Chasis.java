package formulaUno;
import java.util.Random;
public class Chasis {
	//atributos
private int idChasis;
private final int MATERIAL;
private final Ingeniero INGENIERO;
//contructor
public Chasis(int idChasis, int mATERIAL, Ingeniero iNGENIERO) {
	super();
	Random aleatorio= new Random();
	this.idChasis = idChasis;
	this.MATERIAL = aleatorio.nextInt(10);
	INGENIERO = iNGENIERO;
}
//getter y setter
public int getIdChasis() {
	return idChasis;
}
public void setIdChasis(int idChasis) {
	this.idChasis = idChasis;
}
public int getMATERIAL() {
	return MATERIAL;
}
public Ingeniero getINGENIERO() {
	return INGENIERO;
}



}
