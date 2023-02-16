package com.banamex.empleado;

public class CajeroPriorityEmpleado extends CajeroEmpleado {
	
	public CajeroPriorityEmpleado(String nombre) {
		super(nombre);
		
	}
	
	@Override
	public String saludo(String titulo){
		return "soy su asistente priority" + " " + super.getNombre() + titulo;
	}
}