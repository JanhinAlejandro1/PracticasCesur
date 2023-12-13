package alumnoCesur;

class Administrativo {
	 //ATRIBUTOS
	 
 String nombre;
 int edad;
 boolean idiomas;
 
 //constructor
public Administrativo(String nombre, int edad, boolean idiomas) {
	super();
	this.nombre = nombre;
	this.edad = edad;
	this.idiomas = idiomas;
	//getter y setter
}
public Administrativo(String nombre) {
	super();
	this.nombre = nombre;
	this.idiomas = false;
}
public String getNombre() {
	return nombre;
}
public void setNombre(String nombre) {
	this.nombre = nombre;
}
public int getEdad() {
	return edad;
}
public void setEdad(int edad) {
	this.edad = edad;
}
public boolean isIdiomas() {
	return idiomas;
}
public void setIdiomas(boolean idiomas) {
	this.idiomas = idiomas;
}
 
}