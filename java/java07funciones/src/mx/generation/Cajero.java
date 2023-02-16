package mx.generation;

import java.util.Scanner;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Cajero {

	/**
	 * Fecha de entrega jueves 09 de febrero a las 22 h. Entrega: archivo .java
	 * Impresión de pantalla: menú, último movimiento antes de salir.
	 * 
	 * Comenzar con $10,000.00
	 * 
	 * Hacer un menú cajero automático Opción 1: retirar dinero (restar la cantidad)
	 * - No retirar una cantidad mayor a la disponible. - Mostrar cantidad
	 * disponible a retirar - No se puede retirar más de $6,000 - Solo retirar
	 * múltiplos de 50 al 100 Opción 2: hacer depósitos - Mostrar nuevo menú ¿Dónde
	 * deseo depositar? opción 1: cuenta de cheques (sumar la cantidad a nuestra
	 * cuenta) -Solo se puede depositar en múltiplos de 50 y 100 opcion 2: tarjeta
	 * de crédito (restar la cantidad) - hacer pago de $200.10 - No retirar una
	 * cantidad mayor a la disponible. opción 3: cuenta de terceros (restar la
	 * cantidad) - transferencia $666.22 - No retirar una cantidad mayor a la
	 * disponible. Opción 3: estado de cuenta (indicar la cantidad disponible)
	 * Opción 4: quejas (No te contestas y termina la sesión) Opción 5: último
	 * movimiento - fecha YYYY/MM/DD y hora y último movimiento realizado - ej.
	 * 2023/02/03 12:01:23 h. Retiro de $550.00 ej. 2023/02/03 12:05:01 h. Depósito
	 * de $800.00 opción 7: hablar con un asesor (enviar mensaje que no es horario
	 * de atención) Opción 9: salir del cajero Opción desconocida: indica el error y
	 * vuelve a preguntar, - Si se equivoca 3 veces seguidas, termina la sesión.
	 */

	public static void main(String[] args) {

		menu();

	}

	public static void menu() {
		
		Scanner leer = new Scanner(System.in);
		int seleccion1 = 0;
		int contadorErrores = 0;
		int retiro = 0;
		int cantidadTotal = 10_000;
		ArrayList<String> guardarOperacion = new ArrayList<String>();
		double cuentaTarjetaCredito = 100_000;
		
		
		while (seleccion1 != 9 && contadorErrores <= 3) {
			System.out.println("BANCO MUNDIAL");
			System.out.println("1. Retirar dinero");
			System.out.println("2. Hacer deposito");
			System.out.println("3. Estado de cuenta");
			System.out.println("4. Quejas");
			System.out.println("5. Ultimo movimiento");
			System.out.println("7. Hablar con un asesor");
			System.out.println("9. Salir");
			System.out.print("seleccion");
			seleccion1 = leer.nextInt();

			if (seleccion1 < 1 || seleccion1 > 9 || seleccion1==6 || seleccion1==8 ) {
				if (contadorErrores < 3) {
					System.out.println("Opcion invalida, por favor elige una opcion valida.");
					contadorErrores++;
				} else if (contadorErrores == 3) {
					System.out.println("gracias por su preferencia, hasta luego");
					break;
				}

			}

			for (int i = 0; i < 3; i++) {
				if (seleccion1 == 1) {
					System.out.println(
							"ingresa cantidad a retirar , " + "tu cantidad en este momento es " + cantidadTotal);
					retiro = leer.nextInt();
					if (retiro <= 6000 && retiro % 50 == 0) {
						System.out.println("gracias por su retiro");
						cantidadTotal = cantidadTotal - retiro;
						guardarOperacion.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
								+ " usted retiro " + retiro + " de la cuenta");
						break;
					} else {
						System.out.println("porfavor ingresa cantidad validad, recuerda multipos de 50s");
					}
				}
			}

			for (int i = 0; i < 3; i++) {
				if (seleccion1 == 2) {
					System.out.println("hacer depositos\n" + "1. cuenta de chequesn\n" + "2. tarjeta de credito\n"
							+ "3. cuenta de terceros");
					int opcion = leer.nextInt();
					if (opcion == 1) {
						System.out.println("de cuanto sera el deposito");
						int deposito = leer.nextInt();
						if (deposito % 50 == 0) {
							cantidadTotal = cantidadTotal + deposito;
							guardarOperacion.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
									+ " usted deposito " + deposito + " a la cuenta");
							System.out.println("cantidad actual despues del deposito es: " + cantidadTotal);
							break;
						}else{
							System.out.println("porfavor ingresa cantidad validad, recuerda multipos de 50s");
						}

					} else if (opcion == 2) {
						System.out.println("tarjeta de credito tu saldo a pagar es: " + cuentaTarjetaCredito);
						double depositoCredito = leer.nextDouble();
						cuentaTarjetaCredito = cuentaTarjetaCredito - depositoCredito;
						System.out.println("tu saldo actual es " + cuentaTarjetaCredito);
						guardarOperacion.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
								+ " usted pago " + depositoCredito + " a su saldo de credito ");
						break;
					} else if (opcion == 3) {
						System.out.println("Cuanto desea transferir: ");
						double transferencia = leer.nextDouble();
						if(transferencia<=cantidadTotal) {
							cantidadTotal = (int) (cantidadTotal - transferencia);
							System.out.println("tu cantidad restante es " + cantidadTotal);
							guardarOperacion.add(new SimpleDateFormat("dd/MM/yyyy HH:mm:ss").format(new Date())
									+ " usted transfirio " + transferencia + " a la cuenta de jaimito ");
							break;
						}else {
							System.out.println("No tienes fondos suficientes tu saldo actual es: " + cantidadTotal);
						}
						
					} else {
						System.out.println("porfavor pon un numero valido");
					}
				}
			}
			
			if (seleccion1 == 3) {
				System.out.println("tu cantidad en este momento es " + cantidadTotal);
				}
			
			if(seleccion1==4) {
				for (int i = 0; i < 15; i++) {
					System.out.println("esperando");
				}break;
			  }
			
			if(seleccion1==5){
				if(guardarOperacion.size()>=1) {
					System.out.println(guardarOperacion.get(guardarOperacion.size() - 1));
				}else System.out.println("no hay ultimo movimiento");
			}
			
			if(seleccion1==7){
				System.out.println("Lo sentimos, marque en el horario de atencion");
			}
			
			if(seleccion1==9){
				System.out.println("gracias por su preferencia vuelva pronto");
				break;
			}
			
			

		}
	}

}
