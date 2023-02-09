package mx.generation;

public class variables {

	public static void main(String[] args) {
		
		byte variableTipoByte = 10;
		System.out.println("byte: " + variableTipoByte);
		System.out.println("max byte value: " +Byte.MAX_VALUE);
		System.out.println("max byte value: " +Byte.MIN_VALUE);
		
		//definimos una variable de tipo short
		short variableTipoShort=125;
		System.out.println("short: " + variableTipoShort);
		System.out.println("short: " + Short.MAX_VALUE);
		System.out.println("short: " + Short.MIN_VALUE);
		
		//ESTE SERA DEL TIPO INT
		
		int variableTipoInt = 1256;
		
		System.out.println("int: " + variableTipoInt);
		System.out.println("int: " + Integer.MAX_VALUE);
		System.out.println("int: " + Integer.MIN_VALUE);
		
		//DEFINIMOS UNA VARIABLE DEL TIPO LONG
		
		long variableTipoLong = 1259;
		System.out.println("long" + variableTipoLong);
		System.out.println("MAX long" + Long.MAX_VALUE);
		System.out.println("MIN long" + Long.MIN_VALUE);
		
		//NOTA: LAS LITERALES NUMERICAS SON DE TIPO INT.
		//EJE: 85452, 0, 0 -26845616
		//indicando la letra l de prefrencia mayusculas hacemos las literales
		//numericas de 64bits
		long maxvalueLong=2147483648L;
		
		//definimos una variable del tipo float
		//nota: las literales float son de tipo double
		
		float variableTipoFloat=25.23F;
		System.out.println("float: " + variableTipoFloat);
		System.out.println(" max float: " + Float.MAX_VALUE);
		System.out.println(" min float: " + Float.MIN_VALUE);
		
		//DEFINIMOS VARIABLE TIPO DOUBLE
		
		double variableTipoDouble = 625.3256;
		
		System.out.println("double: " + variableTipoDouble);
		System.out.println("double: " + Double.MAX_VALUE);
		System.out.println("double: " + Double.MIN_VALUE);
		System.out.println("suma: " + ((3.1*10+2.2*10)/10));
		
		//DEFINIMOS UNA VARIABLE DE TIPO BOOLEAN
		
		boolean variableTipoBoolean = true;
		System.out.println("boolean: " + variableTipoBoolean);
		variableTipoBoolean = false;
		System.out.println("boolean: " + variableTipoBoolean);
		
		//definimos una variable tipo char
		// solo almacena un caracter de la tabla unicode(16 bits)
		//puede almacenar del 0 al 65535
		
		char variableTipoChar ='K';
		System.out.println("CHAR :" + variableTipoChar);
		variableTipoChar = '\u004C';
		System.out.println("char: " + variableTipoChar);
		//asigner la letra ñ en numerico
		variableTipoChar = '\u00F1';
		System.out.println("char: " + variableTipoChar);
		
		//reglas para el nombre de variables
		//podemos usar cualquier caracter pero
		//no se puede comenzar el nombre con un numero
		//no se puede poner ejemplo 5mentarios(de nuevo no se puede)
		// tampoco se puede utilizar caracteres especiales
		//solo se puede usar el signo de pesos $ y guión bajo
		// a pesar de ello no se recomienda.
		// no se puede solo al inicio si no en todo la variable.
		// Representacion numerica se puede utilizar
		//se le pone 0x y luego el valor hexadecimal
		int varHexadecimal=0x3C;
		//y esto de abajo es para representar el numero binario
		int varBinario =0b0011_1100;
		
		//Conversion de tipo de datos
		
		byte coquita600ml = 60;
		//UPCASTING
		short coquita2L = coquita600ml;
		System.out.println("coquita 2L:" + coquita2L);
		
		short pozoleGrande = 64; // 200ml
		byte pozoleBurbuja = (byte) pozoleGrande;
		System.out.println(pozoleBurbuja);
		
		//los datos de tipo string son considerados objetos.
		
		String varTipoString = "hola crayoli";
		System.out.println("String: " + varTipoString);
		//convirtiendo string a numeros
		byte edadMascota =Byte.parseByte("10");
		double edadPlaneta = Double.parseDouble("1232134");
		//convirtiendo datos numericos a string
		String edadMascotaString = String.valueOf(edadMascota);
		System.out.println("edad solovino: " + edadMascota);
		char primerCaracter = edadMascotaString.charAt(1);
		System.out.println("primer caracter: " + primerCaracter);
		int operadorA = 10;
		int operadorB = 20;
		int suma = operadorA + operadorB;
		
		int resta = operadorA - operadorB;
		int multiplica = operadorA * operadorB;
		double division = (double)operadorA /(double)operadorB;
		int residuo= operadorA% operadorB;
		
		System.out.println("suma: " + suma);
		System.out.println("resta: " + resta);
		System.out.println("multiplicacion: " + multiplica);
		System.out.println("division: " + division);
		System.out.println("residuo: " + residuo);
		System.out.println("preincremento: " + ++operadorA);
		System.out.println("posincremento" + operadorA++);
		System.out.println("posincremento" + operadorA);
		System.out.println("predecremento: " + --operadorB);
		System.out.println("posdecremento" + operadorB--);
		System.out.println("podencremento" + operadorB);
		System.out.println("Resultado: "+ (10*2 +4 -20/2));
		
		//operadores comparativos
		int numEmpleados = 1000;
		System.out.println("empleados>1000 " + (numEmpleados > 1000));
		System.out.println("empleados>1000 " + (numEmpleados >= 1000));
		System.out.println("empleados=1000 " + (numEmpleados == 1000));
		System.out.println("empleados=1000 " + (numEmpleados != 1000));
		System.out.println("resultado: " + (numEmpleados> 1000 || numEmpleados==100));
		
		//operadores logicos
		// && (and) se retorna true si ambos son true
		// ||(0r)se retorna true si cualquiera de los operandos es true
		// !(not) revierte el resultado
		//no sse puede realizar
		//System.out.println("operacion 15 && 'hola' " + (15 && hola));
		System.out.println("empleados < 1000 || empleados > 1000 " + 
		(numEmpleados<1000 || numEmpleados>1000));
		
		boolean a = true;
		boolean b = false;
		boolean c = true;
		
		System.out.println((a && b)||(a && c));
		//el operador not tiene prioridad respecto al oporador AND Y OR
		System.out.println(!(a||b)&&(!a||c));
		//el operador && tiene prioridad respecto al OR
		System.out.println(a||b && c|| a && b);
		//en java ocurre una excepcion al realizaar un division entre 0
		//System.out.println(5/0);
		//con string no se usa el de igualdad en switch
		
		
	}

}
