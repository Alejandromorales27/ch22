package mx.generation;

import java.util.Scanner;

public class FlujoControl {

	public static void main(String[] args) {
		
		/**
		 * sintaxis de la condicion if
		 * 
		 * if(condicion) instruccion_si_condicion_es_true;
		 * 
		 * ----------------------------------
		 * 
		 * if (condicion){
		 * 	instrucciones si la condicion es true
		 * }
		 * -----------------------------------
		 * if (condicion){
		 * 	instrucciones si la condicion es true
		 * 
		 * }else{
		 * instruccion si la condicion es false
		 * }
		 * -----------------------------------------
		 * if(condicion){
		 * instrucciones si la condicion es tru
		 * 
		 * }
		 * 
		 * else if(nueva condicion){
		 * 
		 * instruccion de la nueva condicion es true
		 * 
		 * }else{
		 * instrucciones si las condiciones son false
		 * }
		 * 
		 */
		
		boolean condicion = false;
		System.out.println("java 05");
		
		if(condicion)System.out.println("la condicion es verdadera");
		
		else System.out.println("la variable condicion fue false");
		
		int numeroEdoCuenta=125668;
		
		if(numeroEdoCuenta<1000) {
			System.out.println("el cliente es antiguo");
			
		}
		int rango = 6;
		if(rango>=1 && rango<11){
			System.out.println("la seleccion esta en rango");
			
		}else {System.out.println("la variable esta fuera de rango");}
		
		//operador ternerario expresion ? si_es_true : si_es_false
		//es una condicional simplificado
		
		String respuesta =(rango >=1 && rango <=10)? 
				"la seleccion esta en rango":
				"la seleccion esta fuera de rango";
		
		System.out.println(respuesta);
		
		//Clase Scanner  nos permite realizar una lectura de
		//la consola, para utilizarla Scanner hay que importar la clase
		//del paquete java.util
		
		
		Scanner sc = new Scanner(System.in);
		
		/**System.out.print("escribe tu nombre: ");
		
		String myName = sc.nextLine();//Leer una linea hasta que se encuentre/n
		System.out.print("dime tu edad ");
		int myAge=0;
		String buffer ="";
		
		if (sc.hasNextInt()){//lo que esta en el buffer es un dato tipo int
		myAge = sc.nextInt();
		sc.nextLine();// leer dato tipo int
		}
		else 
		buffer=	sc.nextLine();//leemos lo que este ene l buffer
		
		System.out.println("dime tu apellido");
		String myLastName =sc.nextLine();
		
		System.out.println("holi " + myName + " edad " + myAge);
		System.out.println("con apellido "+ myLastName);*/
		
		/**
		 * El objetivo del ejercicio es crear un sistema de calificaciones, como sigue:
		 * El usuario proporcionará un valor entre 0 y 10. Si está entre 9 y 10:
		 * imprimir una A Si está entre 8 y menor a 9: imprimir una B Si está entre 7 y
		 * menor a 8: imprimir una C Si está entre 6 y menor a 7: imprimir una D Si está
		 * entre 0 y menor a 6: imprimir una F Cualquier otro valor debe imprimir: Valor
		 * desconocido
		 */
		
		int calificacion;
		System.out.print("cual fue tu calificacion ");
		String mensaje="";
		
		if (sc.hasNextInt()) {
			calificacion = sc.nextInt();
			switch (calificacion){
	        case 9,10:
	            mensaje = "A";
	            break;
	        case 8:
	            mensaje = "B";
	            break;
	        case 7:
	            mensaje = "C";
	            break;
	        case 6:
	            mensaje = "D";
	            break;
	        case 0,4,3,2,1,5:
	            mensaje = "F";
	            break;
	        default:
	        	mensaje="el numero tiene que ser del 1 al 10";
	              
				}
		System.out.println("tu calificacion es " + calificacion + "." + mensaje);	
			
		}else System.out.println("valor no valido");
		
		sc.close();
		
		
		

 
		
 
		


		
		
	}

}
