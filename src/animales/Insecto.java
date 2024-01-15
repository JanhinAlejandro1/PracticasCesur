package animales;

public class Insecto extends Animal {
	private boolean alas;
	private boolean antenas;
	private Enemigo [] enemigos;
	
	
	
	//getter y setter
	public boolean isAlas() {
		return alas;
	}
	public void setAlas(boolean alas) {
		this.alas = alas;
	}
	public boolean isAntenas() {
		return antenas;
	}
	public void setAntenas(boolean antenas) {
		this.antenas = antenas;
	}
	
	public Enemigo[] getEnemigo() {
		return enemigos;
	}
	public void setEnemigo(String enemigo) {
		enemigos[0]=new Enemigo(enemigo);
	}
	//constyructor
	public Insecto(String nombre, int tpvida, boolean alas, boolean antenas, String enemigo) {
		super(nombre, tpvida);
	
		this.alas = alas;
		this.antenas = antenas;
	
		enemigos =new Enemigo[5];
	}
class Enemigo{
	private String nombre;
//getter y stter
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Enemigo(String nombre) {
		super();
		this.nombre = nombre;
	}
	
	
	
}
}
