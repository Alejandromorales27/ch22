package test.bank;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class VerificaPrimerCaracter {


	
	/**
	 * de una palabra, verificar el primer caracter y determinar
	 * si este es un numero, es una letra minuscula, o mayuscula
	 * en caso contrario si no cumple con ningua de las anteriores
	 * indicar como otro.
	 * 
	 * ejemplos
	 * 
	 * "2 de mis mejores amigos, estan en ch22"->numero
	 * "Hola crayoli"-> mayuscula
	 * "ya tengo hambre"->minuscula
	 * #valen1000(base 10)->otro
	 * 
	 */
	
	public static void verificarCaracter(String palabra) {
	    char primerCaracter = palabra.charAt(0);

	    if (Character.isDigit(primerCaracter)) {
	        System.out.println("numero");
	    } else if (Character.isUpperCase(primerCaracter)) {
	        System.out.println("mayuscula");
	    } else if (Character.isLowerCase(primerCaracter)) {
	        System.out.println("minuscula");
	    } else {
	        System.out.println("otro");
	    }
	}
	
	public static void main(String[] args) {
		verificarCaracter("Hola");
	}

}
