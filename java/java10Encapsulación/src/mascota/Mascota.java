package mascota;

/**
 * 
 * una interfaz es una declaracion formal de un
 * contrato en la cual los metodos no contienen 
 * implementaciones es similar a los metodos abastractos
 * una clase puede implementar muchas interfaces
 * aunque no tengan relacion
 * 
 * 
 * las clases abstractas se recomienda utilizar para objetos
 * que esten estrechamente relacionados, mientras que las 
 * interfaces son mas adecuadas para proporcionar funcionalidad
 * comun a clases que no esten relacionas entre si
 *
 *para patrones de diseño se suelen utilizar interfaces
 */

public interface Mascota {
	
	boolean ES_MASCOTA=true;
	
	/**
	 * 
	 * los metodos de una interfaz son del tipo public
	 * y abstract
	 * 
	 * los atributos son del tipo final(atributo constante)
	 */

	String cuidados();
	String alimento();
	
	double sizeOfMascota(int pesoAprox);
	
}
