import java.util.HashSet;

public class HashConcepto {
	
	public static void main(String[] args) {
		/**
		 *  una coleccion de tipo set es una coleccion no ordenada
		 *  no se permiten elementos duplicados.
		 *  cualquier elemento duplicado no se insertara
		 * 
		 *  
		 *  definimos una coleccion hashset
		 */
		
		HashSet<String>paises = new HashSet<String>();
		// agregamos valores a la coleccion con add()
		paises.add("Mexico");
		paises.add("Alemania");
		paises.add("Genovia");
		paises.add("Wakanda");
		// Agregamos dato duplicado
		paises.add("Genovia");//este valor no se agrega
		System.out.println(paises);
		
		//desplegamos el tamaño de la coleccion
		
		System.out.println("N. de paises " + paises.size());
		//verificamos si algun elemento existe en la coleccion
		boolean paisExistente =  paises.contains("Wakanda");
		System.out.println("Existe Wakanda " + paisExistente);
		System.out.println("Existe tlaxcala " + paises.contains("Tlaxcala"));
		
		// removemos un elemento
		
		paises.remove("Alemania");
		System.out.println(paises);
		
		//iterar la coleccion 
		paises.forEach(pais-> System.out.println(pais));
		
		for(String pais: paises) {
			System.out.println("pais " + pais);
		}
		
	}

}
