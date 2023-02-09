package mx.generation;

public class OperacionMath {
	
	
	//funcion de instancia 
	int sumaEnteros(int a, int b) {
		return a + b;
	}
	
	
	// funcion de clase
	static double sumaDouble(double a, double b) {
		return a + b;
	}
	
	static double piPorNumero(double number){
		return Math.PI * number;
		//pi es un atributo
	}
	
	static double numeroAleatorio() {
		return Math.random();
	}
	
	static double numeroAleatorio0a10() {
		return (Math.random())*10;
	}

}
