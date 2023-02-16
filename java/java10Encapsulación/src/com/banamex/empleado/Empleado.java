package com.banamex.empleado;

import javax.swing.plaf.synth.SynthOptionPaneUI;

public class Empleado {
	private int id;
	private String nombre;
	private String numSeguroSocial;
	private String rfc;
	
	private static int contadorEmpleado;
	
	{
		this.nombre="sin registrar";
		this.numSeguroSocial="sin registrar";
		this.rfc="sin registrar";
				
	}
	
	static {
		contadorEmpleado=0;
	}
	
	private Empleado(){
		this.id=++contadorEmpleado;
	}
	
	public Empleado(String nombre) {
		this();
		this.nombre=nombre.toUpperCase();
		
	}

	public Empleado(String nombre, String numSeguroSocial, String rfc) {
		this(nombre);
		//la llamada a otro constructor debe ser en la primera linea
		
		//this.nombre = nombre;
		//this.id=++contadorEmpleado;
		this.numSeguroSocial = numSeguroSocial;
		this.rfc = rfc;
	}
	
	//metodos sobrecargados(overloads)
	//son metodos que tienen el mismo nombre, pero diferente parametros en la firma.
	

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNumSeguroSocial() {
		return numSeguroSocial;
	}

	public void setNumSeguroSocial(String numSeguroSocial) {
		this.numSeguroSocial = numSeguroSocial;
	}

	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}

	public int getId() {
		return id;
	}

	public static int getContadorEmpleado() {
		return contadorEmpleado;
	}
	
	public String saludo(String titulo){
		return "hola soy " + nombre + " un saludo " + titulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Empleado [id=");
		builder.append(id);
		builder.append("\n nombre=");
		builder.append(nombre);
		builder.append("\n numSeguroSocial=");
		builder.append(numSeguroSocial);
		builder.append("\n rfc=");
		builder.append(rfc);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}

	