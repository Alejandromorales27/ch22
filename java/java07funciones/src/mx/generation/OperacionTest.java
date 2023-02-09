package mx.generation;

public class OperacionTest {

	public static void main(String[] args) {
		// las funciones de clase(static)podemos utilizarlas,
		//directamente desde la clase
		
		double sumaDouble = OperacionMath.sumaDouble(2.1, 5);
		System.out.println(sumaDouble);
		
		//para utilizar los metodos de instancia es necesario 
		//ser una una instancia de la clase
		OperacionMath operaciones= new OperacionMath();
	
		int sumaInt = operaciones.sumaEnteros(5, 6);
		//esto de abajo no se recomienda
		//double sumaDoubleInstancia = operaciones.sumaDouble(2.1, 3.1);
		System.out.println(sumaInt);
		//investigar bien todo esto
		
		System.out.println("pi * 5 " + OperacionMath.piPorNumero(5));
		
		System.out.println("numero aleatorio " +  OperacionMath.numeroAleatorio());
		System.out.printf("numero aleatorio %3.2f" , OperacionMath.numeroAleatorio());
		// 3 numero de digitos y dos son los decimales
		System.out.println(OperacionMath.numeroAleatorio0a10());
	}  

}
