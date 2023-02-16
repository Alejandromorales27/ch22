package com.generation;

import java.util.Scanner;

//es un juego de piedra papel y tijeras
public class Codigo4 {
//se agrego un main
	public static void main(String[] args) {

		System.out.print("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
		// se agrego el system.in
		Scanner s = new Scanner(System.in);
		// se instancio el la variable s
		String j1 = s.nextLine();

		System.out.print("Turno del jugador 2 (introduzca piedra, papel o tijeras): ");
		String j2 = s.nextLine();
		// se corrigio la s con s2

		int ganador = 0;
		// se cambio la g a ganador
		// se cambio el igual por equals
		if (j1.equals(j2)) {
			System.out.println("Empate");

		} else {

			switch (j1) {

			case "piedra":
				if (j2.equals("tijeras")) {
					ganador = 1;
				}
				break;
			// se agrego una llave faltante
			// se modifico todos a equals
			case "papel":
				if (j2.equals("piedra")) {
					ganador = 1;
				}
				break;
			// se agrego breaks faltantes
			case "tijeras":
				if (j2.equals("papel")) {
					ganador = 1;
				}
				break;
			default:

			}
			switch (j2) {

			case "piedra":
				if (j1.equals("tijeras")) {
					ganador = 2;
				}
				break;
			// se agrego una llave faltante
			// se modifico todos a equals
			case "papel":
				if (j1.equals("piedra")) {
					ganador = 2;
				}
				break;
			// se agrego breaks faltantes
			case "tijeras":
				if (j1.equals("papel")) {
					ganador = 2;
				}
				break;
			default:

			}
			//se agrego tambien otro case

			System.out.println("Gana el jugador " + ganador);
		}

	}

}
