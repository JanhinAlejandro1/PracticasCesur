package TopGun;

public class Piloto {
 private int idPiloto;
 private String nomPiloto;
  private int horasVueloPiloto;
 private String rangoPiloto;
public void mostrarPiloto() {
 System.out.println("el idPiloto es :"+idPiloto+", el nombre del piloto es "+nomPiloto+ "sus horas de vuelo son: "+ horasVueloPiloto+", su rango es: "+rangoPiloto );
}//contructor
public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
	super();
	this.idPiloto = idPiloto;
	this.nomPiloto = nomPiloto;
	this.horasVueloPiloto = horasVueloPiloto;
	this.rangoPiloto = rangoPiloto;
}//getter y setter
public int getIdPiloto() {
	return idPiloto;
}
public void setIdPiloto(int idPiloto) {
	this.idPiloto = idPiloto;
}
public String getNomPiloto() {
	return nomPiloto;
}
public void setNomPiloto(String nomPiloto) {
	this.nomPiloto = nomPiloto;
}
public int getHorasVueloPiloto() {
	return horasVueloPiloto;
}
public void setHorasVueloPiloto(int horasVueloPiloto) {
	this.horasVueloPiloto = horasVueloPiloto;
}
public String getRangoPiloto() {
	return rangoPiloto;
}
public void setRangoPiloto(String rangoPiloto) {
	this.rangoPiloto = rangoPiloto;
}
	
	

}
 

