package mx.generation;

import java.util.Scanner;

public class ControlSwitch {

	public static void main(String[] args) {
		
		/**
		 * sintaxis de condicional switch
		 * 
		 * switch (expresion){
		 * valor1: instrucciones;
		 * 	break
		 * valor:instrucciones;
		 * 		break;
		 * default:instrucciones
		 * 		break
		 * 
		 * la expresion debe ser de tipo
		 * entero, string o enum,
		 * 
		 * }
		 * 
		 * comparar numero de punto flotante
		 * se debe evitar realizar las operaciones con este
		 * tipo de datos
		*/
		
		Scanner leerTeclado = new Scanner(System.in);
		System.out.println("*****mes en curso***");
		System.out.println("introduce el mes en curso (1-12)");
		if(leerTeclado.hasNextInt()) {
			
			int mesEnCurso =leerTeclado.nextInt();
			String mensaje="";
			switch(mesEnCurso) {
			case 1:
				mensaje = "enero";
				break;
			case 2: 
				mensaje="febrero";
				break;
			case 3: 
				mensaje="marzo";
				break;
			case 12: 
				mensaje="diciembre";
				break;
			default: 
				mensaje="mes no existe";
			}
			System.out.println("estas en el mes de " +  mensaje);
			
			String estacion="";
			
			switch(mensaje.toLowerCase()) {
			case "enero":
				estacion = "invierno";
				break;
			case "febrero":
				estacion = "invierno";
				break;
			case "marzo": 
				estacion="primavera";
				break;
			}
			
			System.out.println(" te encuentras en la estacion" +  estacion);
			
			
			
			}else {
				System.out.println("error en el mes introducido");
				leerTeclado.nextLine();
				leerTeclado.close();
			
		}
		}
		
	
		
		 
	}


