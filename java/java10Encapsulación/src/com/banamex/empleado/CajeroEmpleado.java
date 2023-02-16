package com.banamex.empleado;
//como aplicar la herencia en la firma de la clase
//Se agrega la palabra extend y se indica la clase padre o superior
public class CajeroEmpleado extends Empleado {
	
	private int cajaAsignada;
	
	public CajeroEmpleado(String nombre) {
		super(nombre);
	}
	
	public CajeroEmpleado(String nombre,int cajaAsignada) {
		this(nombre);
		this.cajaAsignada=cajaAsignada;
	}

	public CajeroEmpleado(int id,String nombre,String numSeguroSocial, String rfc) {
		super(nombre,numSeguroSocial,rfc);//super apunta a la clase superior
		
	}
	
	
	//sobre escritura de metodo(overriding);
	//la clase hija sobreescribe un metodo de la clase padre
	//para que exista la sobreescritura del metodod deben tener el mismo
	//nombre los mismos parametros y el retorno debe ser un tipo compatible
	
	
	@Override
	public String toString(){
	
		return 	super.toString() + "\n caja asiginada " + this.cajaAsignada;
	}
	
	public String saludo(String titulo){
		return "mi titulo es " + titulo + " "+ super.getNombre() + " mi caja asignada es " + cajaAsignada;
	}

	
}
