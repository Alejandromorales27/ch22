package oracle.com;

import java.util.ArrayList;

public class Banco {
//3 Atributos de instancia
//1 atributo de clase

//1 metodo constructor
//metodo de instancia
//metodo de clase
	
	//atributos de instancia
	private String ubicacion;
	
	private String gerente;
	
	private int numClientes;
	
	//ArrayList<CajeroAutomatico> cajeros;
	
	
	
	
	//ArrayList<Empleados>empleados;
	
	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public String getGerente() {
		return gerente;
	}

	public void setGerente(String gerente) {
		this.gerente = gerente;
	}

	public int getNumClientes() {
		return numClientes;
	}

	public void setNumClientes(int numClientes) {
		this.numClientes = numClientes;
	}

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
	public String nombreCliente (String nombre) {
		return nombre;
	}
	
	//metodo de clase
	public static int numClientesTotales(){
		return 15000;
	}
	
	public String imprimirDatosPlaca() {
		return this.ubicacion + "\t"+ this.gerente + "\t" + this.numClientes;
	}
	
	
}
