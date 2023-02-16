package animal;

public abstract class Animal {

	private String nombre;
	private String sonido;
	
	public Animal(String nombre, String sonido){
		this.nombre=nombre;
		this.sonido=sonido;
	}
	
	public String emitirSonido(){
		return "soy un" + this.nombre + "y hago" + this.sonido;
	}
	
	//metodo abastracto
	//no tienen  cuerpo(funcionalidad), terminan con punto y coma
	//debido a que la clase padre no ha definido el compartamiento
	//la clase hija es quien implementara el comportamiento, es responsable
	//De la implementacion(al menos que la clase sea abstracta)
	//si exsite un metodo abstracto, la clase tambien debe ser 
	//Abstracta
	public abstract int aniosAproxDeVida();
	
	public abstract double pesoEnkgAprox();

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSonido() {
		return sonido;
	}

	public void setSonido(String sonido) {
		this.sonido = sonido;
	}
	
	
}
