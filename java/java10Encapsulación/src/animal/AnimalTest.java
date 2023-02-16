package animal;

import java.util.ArrayList;
import java.util.List;

import mascota.Mascota;

public class AnimalTest {
	
	public static void main(String[] args) {
		Animal solovino = new Canino("solovino","guao guao");
		Animal michu =new Felino("michu", "miau",18);
		
		System.out.println(solovino.emitirSonido());
		System.out.println(michu.emitirSonido());

		
		//no deberia poder instanciar la clase animal
		//ya que es muy generica
		//Animal noSeQueTipoEs = new Animal("?","?");//que tipo de animal, que nombre le ponemos
		
		System.out.println("anios de vida: "+ michu.aniosAproxDeVida());
		
		System.out.println(michu.pesoEnkgAprox());
		System.out.println(solovino.pesoEnkgAprox());
		
		Animal chiquitin = new Perro("chiquitin","guao guao");
		
		List<Animal>animales=new ArrayList<>();
		animales.add(solovino);//canino
		animales.add(michu);//felino
		animales.add(chiquitin);//perro
		animales.add(new Felino("momo","mauuuuuuuujj",10));//felino
		
		
		
		//aplicar la 
		//animales.forEach(animal -> System.out.println(reproducirSonido(animal)));
		for(Animal animal: animales)
			System.out.println(reproducirSonido(animal));
	}
	
	static String reproducirSonido(Animal animal){
		return "Play: " + animal.emitirSonido();
	}
	

}


