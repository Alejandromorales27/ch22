package como.banamex.cajero;

public class Cajero {
	
	int numSerie;
	String ubicacion;
	int numCajero;
	double montoDisponible;
	
	
	static int contadorCajero;
	
	
	static {
		contadorCajero=1000;
	}
	
	Cajero(int numCajero, String ubicacion, double montoDisponible){
		this.numSerie=contadorCajero++;
		this.numCajero=numCajero;
		this.ubicacion=ubicacion;
		this.montoDisponible=montoDisponible;
		
	}
	
	String informacion() {
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
