package como.banamex.Banco;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExcepcionesConceptos {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
			//una excepcion es una situacion no esperada
		/**
		 * durante  la ejecucion de programa.
		 * 
		 * ecisten dos tipos de excepciones:
		 * 
		 * a)checkted exceptions: son excepciones que se heredan
		 * de la clase exceptions: se tiene que declara la excepcion 
		 * de la firma del metodo o bien manejar la excepcion con 
		 * el bloque try-catch
		 * 
		 * 
		 * B) unchacked exceptions: son excepsiones que se heredan
		 * de clase RuntimeException. no se esta obligado a procesarlas.
		 * es opcional manerjar con el bloque try-catch o declararlas
		 * en la firma del metodo
		 * 
		 * las excepciones de error son arrojadas por la jvm, son errores de los que 
		 * no nos podemos recuperar en cambio las de tipo exception o runtimeExcetption
		 * son provocadas por nuestro codigo
		 * 
		 * manejo de expeciones con el bloque try-catch
		 * 
		 * sintaxis
		 * 
		 * try{
		 * 
		 * }
		 * 
		 * catch(exception e){
		 * 
		 * }
		 * try: bloque de codigo que contendra instruccion que pudiera
		 * generar una excepcion
		 * 
		 * catch: se ejecutara si ocurre una excepcionn en el bloque try.
		 * 
		 * 
		 * finally este se ejecutara despues del tray y catch
		 * 
		 * el stacktrace de una expcepcion es un conjunto de mensajes
		 * de excepciones.
		 * 
		 * 
		 */
		
		System.out.println("inicio del programa");
		
		double division;
		int[] myArray= {5,4,5};
	
		
		try {
			division=5/1;
			System.out.println(myArray[5]);
			
			File file = new File("myfile.txt");
			Scanner myReader=new Scanner(file);
		}
		catch(ArithmeticException e) {
			System.out.println("no se puede dividir entre cero");
			System.out.println(e);
		}
		
		catch(FileNotFoundException e){
			System.out.println("el archo no se encuentra");
			System.out.println(e);
		}
		
		catch(Exception e) {
			System.out.println("llama a los bomberos");
			System.out.println(e);
		}

		
		finally {
			System.out.println("fin del programa");
		}
		
		
	
	}

}
