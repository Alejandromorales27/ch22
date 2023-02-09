package mx.generation;

import java.util.Scanner;

public class CicloWhile {

	public static void main(String[] args) {
		
		/**
		 * ciclo while
		 * 
		 * 
		 * sintaxis: 
		 * mientras la condicion sea verdadera, se realiza
		 * el ciclo
		 * while(condicion)instruccion;
		 * 
		 * 
		 * while(condicion){
		 * instrucciones}
		 * 
		 */
		
		boolean activo=true;
		boolean adeudos=true;
		Scanner sc=new Scanner(System.in);
		/**
		while(activo && !adeudos) {
			System.out.println("\nBienvenido Sr.potter");
			System.out.print("quiere seguir activo (s/n)");
			char respuesta = sc.nextLine().toLowerCase().charAt(0);
			if(respuesta != 's' ) activo=false;
		}*/
		
		
			do {
			System.out.println("\nBienvenido Sr.potter");
			System.out.print("quiere seguir activo (s/n)");
			char respuesta = sc.nextLine().toLowerCase().charAt(0);
			if(respuesta != 's' ) activo=false;
		}while(activo && !adeudos);
		if(adeudos)System.out.println("por favor pase a pagar, perro");
		
		System.out.println("hasta pronto");

	}

}
