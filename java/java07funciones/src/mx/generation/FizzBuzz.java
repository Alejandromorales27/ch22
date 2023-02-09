package mx.generation;

import java.util.Scanner;

public class FizzBuzz {
	
	public static void main(String[] args) {
		
		Scanner Leer=new Scanner(System.in);
		System.out.println("escribe numero del 1 al 20");
		int multiplo=Leer.nextInt();
				
				if(multiplo%5==0) {
					System.out.println("fizz");		
				}else if(multiplo%3==0) {
					System.out.println("buzz");
				}else if(multiplo%3==0 && multiplo%5==0) {
					System.out.println("fizzbuzz");
				}else System.out.println("no es multiplo de nada");
				
	}

}
