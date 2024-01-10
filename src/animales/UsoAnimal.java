package animales;

public class UsoAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mamifero perro=new Mamifero("perro",15,true);
Insecto hormiga= new Insecto ("hormiga",1,false,true,"oso hormiguero");
System.out.println("El animal:"+ hormiga.getNombre()+" tiene alas?:"+hormiga.isAlas());
System.out.println(hormiga.getNombre()+" tiene de enemigo a:"+ hormiga.getEnemigo().getNombre()  );
	}

}
