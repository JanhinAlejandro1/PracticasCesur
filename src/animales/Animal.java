package animales;

public class Animal {
private String nombre;
private int tpvida;
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getTpvida() {
	return tpvida;
}
public void setTpvida(int tpvida) {
	this.tpvida = tpvida;
}
//constructor
protected Animal(String nombre, int tpvida) {
	super();
	this.nombre = nombre;
	this.tpvida = tpvida;
	if (tpvida<0 || tpvida<150) {
		tpvida=0;	
	}
	
}
 
}
