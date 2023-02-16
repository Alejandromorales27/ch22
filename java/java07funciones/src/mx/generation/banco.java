package mx.generation;

import java.util.Scanner;

public class banco {

	public static void main(String[] args) {

		Scanner leer = new Scanner(System.in);
		System.out.println("Bienvenido a los cajeros del banco pepito grillo, porfavor\n"
				+ "selecciona lo que quieres hacer el dia de hoy\n" + "1. Retirar\n2. depositos");

		int seleccion = leer.nextInt();
		int cantidadTotal = 10000;
		int retiro = 0;
		int deposito = 0;

		for (int i = 0; i < 3; i++) {
			if (seleccion == 1) {
				System.out.println("ingresa cantidad a retirar , " + "tu cantidad en este momento es " + cantidadTotal);
				retiro = leer.nextInt();
				if (retiro <= 6000 && retiro % 50 == 0) {
					System.out.println("gracias por su retiro");
					cantidadTotal = cantidadTotal - retiro;
					break;
				} else {
					System.out.println("porfavor ingresa cantidad validad, recuerda multipos de 50s");
				}
			}

		}

		for (int i = 0; i < 3; i++) {
			if (seleccion == 2) {
				System.out.println("hacer depositos\n" + "1. cuenta de chequesn\n" + "2. tarjeta de credito\n"
						+ "3. cuenta de terceros");
				int opcion = leer.nextInt();
				if (opcion == 1) {
					System.out.println("de cuanto sera el deposito");
					deposito = leer.nextInt();
					break;
				} else if (opcion == 2) {
					System.out.println("tarjeta de crediro");
					break;
				} else if (opcion == 3) {

				} else {
					System.out.println("porfavor pon un numero valido");
				}
			}

		}

	}

	static double sumaD(double a, double b) {
		return (((a * 100) + (b * 100)) / 100);
	}
}
