import java.util.HashMap;

public class HashMapConcepto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/**
		 * una coleecion map, es una relacion de llave(key)-valor
		 * que forma una especie de tabla de datos
		 * 
		 */
		
		
		//definimos una coleccion hashmap
		// <key, value>
		HashMap<Integer, String> estudiantes = new HashMap<>();
		
		//AGREGAMOS VALORES A LA COLECCION.
		estudiantes.put(1234, "pepito grillo");
		estudiantes.put(4234, "pinocho");
		estudiantes.put(5342, "luis soto de otro universo");
		estudiantes.put(5342, "Luis soto de nuestro universo");//Sustituye el anterior
		
		System.out.println(estudiantes);
		//mostramos el dato de la llave indicada con el metodo get()
		System.out.println("mi nuevo mejor amigo es: " + estudiantes.get(1234));
		
		//removemos un elemento de la coleccion
		//estudiantes.remove();
		
		//iteramos los elementos de la coleccion
		//se iteran sus claves
		
		for(int matricula: estudiantes.keySet()) {
			System.out.println(matricula + "-" + estudiantes.get(matricula));
		}
		//iterar sus valores con value()
		for(String estudiante: estudiantes.values()) {
			System.out.println("Estudiante " + estudiante);
		}
		
		//verificar si existe un valor
		if(estudiantes.containsValue("Luis soto de nuestro universo"))
			System.out.println("Me siento tranquilo");
		else
			System.out.println("se ha ido a otra cohorte");
		
	}

}
