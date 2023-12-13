package alumnoCesur;

class Administrativo extends Persona {
	 //ATRIBUTOS
	 

  private boolean idiomas;
 
 //constructor
public Administrativo(String nombre, int edad, boolean idiomas) {
	super(nombre, edad);

	this.idiomas = idiomas;
	//getter y setter
}
public Administrativo(String nombre) {
	super(nombre,0);

	this.idiomas = false;

}


public boolean isIdiomas() {
	return idiomas;
}
public void setIdiomas(boolean idiomas) {
	this.idiomas = idiomas;
}
 
}