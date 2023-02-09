package mx.generation;

public class DatosInmutables {
	
	public static void main(String[] args) {
		
		String nombre= "pax";
		//nombre = "juan";
		String participante = "pax";
		String personaCh22 = new String("pax");
		
		if(nombre==participante) {
			System.out.println("CEO DE CH22");
		}
		
		if(nombre==personaCh22) {
			System.out.println("CEO DE Generation");
		}
		
		if(nombre.equals(personaCh22)) {
			System.out.println("CEO DE mundo");
		}
		
		System.out.println("mi " + "mejor " + "amigo " + "se llama " + nombre);
		
		//garbage collector -> recolector de basura
		//elimina los objetos que no sean utilizados.
	}

}
