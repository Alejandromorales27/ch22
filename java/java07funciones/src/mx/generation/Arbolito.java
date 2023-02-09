package mx.generation;

import java.util.Scanner;

public class Arbolito {

  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese el tamanio del pino: ");
    int tamanio = leer.nextInt();
    int tamanioTronco = tamanio / 2;
    int grosorTronco = tamanio / 3;

    for (int i = 0; i < tamanio; i++) {
      for (int j = 0; j < tamanio - i - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < (2 * i) + 1; j++) {
        System.out.print("*");
      }
      System.out.println();
    }

    for (int i = 0; i < tamanioTronco; i++) {
      for (int j = 0; j < tamanio - tamanioTronco / 2 - 1; j++) {
        System.out.print(" ");
      }
      for (int j = 0; j < grosorTronco; j++) {
        System.out.print("*");
      }
      System.out.println();
    }
  }

}
