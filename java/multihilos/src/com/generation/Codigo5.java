package com.generation;

import java.util.Scanner;

public class Codigo5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		//Se agrego el system.in
		System.out.print("Introduzca un número:");
		//se cambio comilla simple por comillas 
				int numeroIngresado = s.nextInt();
				//Se cambio variabl string por int y ademas se puso nexint
				//se puso de la siguiente manera numero ingresado para que se entendiera mejor
		int c = numeroIngresado;

		int afortunado = 0;
		int noAfortunado = 0;
		//pienso que se entiendo mejor de esta manera
		while (numeroIngresado > 0) {
			int digito = (int)(numeroIngresado % 10);
			if (digito == (int)Math.round(Math.random()*10)) {
				//se agrego para que fuera un poco más dinamico
				afortunado++;
			} else {
				noAfortunado++;
				//en realidad no super bien para que era operacion aritmetica que estaba aqui
			
			}

			if (afortunado > noAfortunado) {
				System.out.println("El " + c + " es un número afortunado.");
				break;
				//se agrego un break para evitar el ciclo infinito
				//se agrego la letra faltante
			} else {
				System.out.println("El " + c + " no es un número afortunado.");
				break;
			}

		}
		
	}
	}
	 