package codigodeotros;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Codigo7 {
	//se metio en un main todo el programa
	public static void main(String[] args) {
		
		

	    Scanner scanner = new Scanner(System.in);
	    //se cambio la palabra s a palabra scanner es más entendible
	    //se agrego el system .in
	    //se cambio el hasmap String String
	    HashMap<String, String>capitales = new HashMap<>();
	    capitales.put("Canadá","Otawwa");
	    capitales.put("Estados Unidos", "Washington DC");
	    capitales.put("México", "México DF");
	    capitales.put("Belice","Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador","El Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
	    
	   
	    String c = "";
	    
	//se agrego una r
	    do {
	      System.out.print("Escribe el nombre de un país y te diré su capital: ");
	      //se cambio el out en vez del in
	      c = scanner.nextLine();
	      
	      if (!c.equals("salir")) {
	    	  //Se agrego s faltante
	        if (capitales.containsValue(c)) {
	          System.out.print("La capital de " + c);
	          //Se agrego el out
	          System.out.println(" es " + capitales.put(c, c));
	        } else {
	          System.out.print("No conozco la respuesta ");
	          System.out.print("¿cuál es la capital de " + c + "?: ");
	          String ca = s.nextLine();
	          ca.put(c, ca);
	          System.out.println("Gracias por enseñarme nuevas capitales");
	        }
	      }
	    } while (!c.equals("salir"));
	    //se agrego letra faltante y parentesis
	  }
		
		
		
	}
	


