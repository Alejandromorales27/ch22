package animal;
// para conocer si estamos aplicando adecuadamente la herenciaa
//podriamos preguntarnos con is-a(es un).

public class Canino extends Animal {

	public Canino(String nombre,String sonido) {
		super(nombre,sonido);
	}
	@Override
	public String emitirSonido(){
		return "soy un canino, me llamo" + super.getNombre() + "y hago"  
		+ super.getSonido();
	}
	
	@Override
	public int aniosAproxDeVida() {
		return 12;
	}
	@Override
	public double pesoEnkgAprox() {
		
		return 12.1;
	}
	

	
	
}
