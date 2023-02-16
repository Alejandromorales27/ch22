package como.banamex.cajero;

import java.util.ArrayList;

public class CajeroEncapsulado {
	
	private int numSerie;
	private String ubicacion;
	private int numCajero;
	private double montoDisponible;
	
	
	private static int contadorCajero;
	
	
	 static {
		contadorCajero=1000;
	}
	
	public CajeroEncapsulado(int numCajero, String ubicacion, double montoDisponible){
		this.numSerie=contadorCajero++;
		this.numCajero=numCajero;
		this.ubicacion=ubicacion;
		this.montoDisponible=montoDisponible;
		
	}
	
	//Establecer metodos setters and getters
	
	public void setUbicacion(String nuevaUbicacion) {
		this.ubicacion=nuevaUbicacion;
	}
	
	public String getUbicacion() {
		return this.ubicacion;
	}
	
	//Establecemos solo el get de numSerie
	
	protected int getNumSerie() {
		return this.numSerie;
	}
	
	
	public static int getContadorCajero() {
		return contadorCajero;
	}
	
	
	
	
	public int getNumCajero() {
		return numCajero;
	}
	
	

	public double getMontoDisponible() {
		return montoDisponible;
	}

	public void setMontoDisponible(double montoDisponible) {
		if(montoDisponible<0)
			throw new IllegalArgumentException("El monto no puede ser menor a cero");

		this.montoDisponible = montoDisponible;
	}

	public void setNumCajero(int numCajero) {
		
		this.numCajero = numCajero;
	}

	public String informacion() {
		//return String.format("Serie: %s, ubicacion: %S", this.numSerie,this.ubicacion);
		StringBuilder strBuilder = new StringBuilder();
		strBuilder.append("Numero de serie: ");
		strBuilder.append(this.numSerie);
		strBuilder.append("\nNumero de cajero ");
		strBuilder.append(this.numCajero);
		strBuilder.append("\nubicacion");
		strBuilder.append(this.ubicacion);
		strBuilder.append("\nMonto disponible: $");
		strBuilder.append(this.montoDisponible);
		strBuilder.append(" M.N.\n");
		
		return strBuilder.toString();
		
		
		
	}

}
