package mx.generation;

public class FuncionesMain {

	public static void main(String[] args) {
		// para crear funciones se hace lo siguiente
	
		double suma=sumaD(0.1,0.2);
		
		double a=0.1;
		double b=0.2;
		
		//System.out.printf("resultado %6.3f%n",suma);
		imprimir((formatoResultado(suma)));
		//sumaTxt=(formatoResultado(suma));
		//imprimir(sumaTxt)
		
		
		a=12.1;
		b = 34.213;
		suma = (((a*100) + (b*100))/100);
		
		//String resultado = String.format("resultado %6.3f%n ",suma);
		//en una funcion estatica solo podemos usar otras funciones estaticas
		//
		imprimir(formatoResultado(suma));//para invocar a la funcion imprimr
	}
	
	//tipo_retorno nombre_funcion(parametros ){
	//} luego serian los accesos no obligatorios
	
	static void imprimir(String texto){// con void le indicamos que la funcion no tiene
		//retorno es obligatorio ponerlo
		System.out.println("-> " + texto);
	}
	//investigar funciones staticas o mejor dicho tipo de funciones
	//funciones estaticas y no estaticas.
	
	static String formatoResultado(double resultado) {
		String txt= String.format("resultado %7.4f%n ",resultado);
		return txt;
	}
	
	static double sumaD(double a, double b) {
		return (((a*100) + (b*100))/100);
	}

}
