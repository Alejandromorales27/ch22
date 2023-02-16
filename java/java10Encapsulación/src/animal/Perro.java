package animal;

import mascota.Mascota;

// con implements, implemento funcionalidades que vienen 
//en el contrato de la interfaz.

public class Perro extends Canino implements Mascota{

	public Perro(String nombre, String sonido) {
		super(nombre, sonido);
	}
	
	@Override
	public int aniosAproxDeVida() {
		return 10;
	}

	@Override
	public String cuidados() {
		return "bañar, sacar a pasea, dar alimentacion y mucho cariño";
	}

	@Override
	public String alimento() {
		
		return "croquetas y agua";
	}

	@Override
	public double sizeOfMascota(int pesoAprox) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}

class PerroPeluche implements Mascota{

	@Override
	public String cuidados() {
	
		return "lavar con agua y javon";
	}

	@Override
	public String alimento() {
		// TODO Auto-generated method stub
		return "no aplica";
	}

	@Override
	public double sizeOfMascota(int pesoAprox) {
		return 0;
	}
	
	
}
