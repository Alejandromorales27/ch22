package oracle.com;

public class CajeroAutomatico {
	//atributos de instancia
	int numSerie;
	String ubicacion;
	double cantidadDisponible;
	//BandejaDinero cajaBlindaje;
	int numMovimientos;
	
	//atributo de clase
	
	static String nombreBanco;
	static int contadorCajeros;
	
	//inicializacion de atributos de instancia
	
	{
		numSerie=0;
		ubicacion="desconocida";
		cantidadDisponible=0.0;
		numMovimientos=0;
	}
	
	//inicializacion de atributos de clase
	
	static{
		nombreBanco="PaxnaMex";
		contadorCajeros=0;
	}
	
	//Metodos constructores
	//El metodo constructor no contienen el tipo de retorno
	// debe tener el mismo nombre de la clase 
	//un constructor vacio se le llama, metodo constructor por default
	//si usamos un constructor con parametros, el constructor por defaul
	//ya no lo genera el compilador
	//un metodo estatico no puede tener acceso a los atributos y metodo de instancia
	// ya que en el diseño de la clase, no existe objetos aun
	//y los obejotos existen al implementarlos.
	
	public CajeroAutomatico( String ubicacion) {
		//System.out.println("se crea un nuevo cajero");
		this.numSerie=contadorCajeros++;
		this.ubicacion= ubicacion;
		
	}
	
	CajeroAutomatico(){
		
	}
	
	
	//metodos de instancia
	//metodo de clase y para que sea un metodo de clase se le agrega static
	static double valorDolar() {
		//ToDo obtener el valor del dolar
		return 19.12;
	}
	//metodo de instancia
	String imprimirDatosPlaca() {
		return this.numSerie + "\t"+ this.ubicacion + "\t" + this.cantidadDisponible;
	}
	
	
}


/*
public class CajeroAutomatico {
	//Fields, Non-static Fields (atributos de instancia)
	
	//Static fields (atributos de clase)
	
	//Bloque de inicialización de atributos de instancia
	
	//Bloque de inicialización de atributos de clase
	
	//Métodos constructores
	
	//Métodos de instancia
	
	//Métodos de clase (statics)

}*/

