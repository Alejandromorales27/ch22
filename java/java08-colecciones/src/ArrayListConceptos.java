import java.util.ArrayList;

public class ArrayListConceptos {

	public static void main(String[] args) {
		
		/**
		 * una coleccion list es una coleccion ordenada, en la que se permite
		 * elementos duplicados
		 * 
		 * 
		 * se basa en un array redimensionable que crece su tamaño
		 * segun crece la coleccion de elementos
		 * 
		 * esta coleccion es la mejor rendimiento tiene
		 * 
		 * sintaxis 
		 * 
		 * arraylist<objec> var name;
		 * 
		 */
		
		//definimos una coleccion de tipo string.
		
		ArrayList<String>isbn=new ArrayList<>();
		ArrayList<String>nombreLibros=new ArrayList<>();
		
		//Agregar datos al arrayList con metodo add()
		nombreLibros.add("Caperucita roja");//El primer elemento es el indice 0
		nombreLibros.add("harry potter");
		nombreLibros.add("el señor de los anillos");
		
		//desplegamos el tamaño de la coleccion
		int sizeArrayList= nombreLibros.size();
		System.out.println("numero de libros que recomienda pax " + sizeArrayList );
		
		//mostramos el nombre del libro del señor de los anillos
		
		System.out.println("pax recomienda: " + nombreLibros.get(2));
		
		//removemos un libro del arrayList
		//Utilizamos el metodo remove().
		
		nombreLibros.add("el extranjero");
		nombreLibros.add("un mundo feliz");
		nombreLibros.add("el extranjero");
		nombreLibros.add(3,"los juegos del hambre");
		
		for (int i = 0; i < nombreLibros.size(); i++) {
			System.out.println("regalamos al ch22 " + nombreLibros.get(i));
		}
		
		//for mejorado
		
		for(String Libro: nombreLibros){
			System.out.println("regalamos el 14 de febrero " + Libro);
		}
		
		//remplazar
		
		nombreLibros.set(1,"nostalgia");
		
		//iterar con foreach
		
		nombreLibros.forEach( libro-> System.out.println(libro));
		
		ArrayList<String>clonLibros = nombreLibros;
		
	}

}
