package oracle.com;

import java.util.ArrayList;

public class Banco {
//3 Atributos de instancia
//1 atributo de clase

//1 metodo constructor
//metodo de instancia
//metodo de clase
	
	//atributos de instancia
	String ubicacion;
	
	String gerente;
	
	int numClientes;
	
	ArrayList<CajeroAutomatico> cajeros;
	
	//ArrayList<Empleados>empleados;
	
	//atributos de clase
	static String nombreBanco;
	
	static{
		nombreBanco="SANTANDER";
		
	}
	
	//metodo constructor
	public Banco(String ubicacion, String gerente, int numClientes) {
		this.ubicacion=ubicacion;
		this.gerente=gerente;
		this.numClientes=numClientes;
	}
	
	//metodo de instancia
	String nombreCliente (String nombre) {
		return nombre;
	}
	
	//metodo de clase
	static int numClientesTotales(){
		return 15000;
	}
	
	
}
