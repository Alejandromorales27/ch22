
public class ArrayConcepto {

	public static void main(String[] args) {
		
		/**
		 * los arreglos se definen con corchotes[]
		 * los corchotes pueden ir antes o despues de la variable
		 * ej. int[] myArray; int myArray[];
		 * 
		 * para los arreglos se debe asignar la cantidad de elementos
		 * que contendrá una vez definido, el arreglo no puede cambiar
		 * su tamaño.
		 * 
		 * 
		 * definimos un arreglo de 3 elementos tipo int.
		 */
		int[] codigoColores = new int[3];//Es igual un arreglo de 3 datos
		String[] nombreColores = new String[3];//es un arreglo de 3 datos
		
		//para agregar elementos datos aun arreglo, indicamos dentro del corchote
		//el indice del dato. el primer elemento es el indice 0.
		nombreColores[0]= "azul";
		codigoColores[0]= 0x000_0ff;//rgb 0,0,255
		
		nombreColores[1]= "amarillo";
		codigoColores[1]= 0xff_ff00;//rgb 255,255,0
		
		nombreColores[2]= "negro";
		codigoColores[2]= 0x000000;//rgb 0,0,0
		
		//interamos los datos de un arreglo
		//con el atributo lenght obtenemos el tamaño del arreglo
		
		for (int i = 0; i < nombreColores.length; i++) {
		
			System.out.printf("el color %s tiene el codigo RGB 0x%06X%n"
					,nombreColores[i], codigoColores[i]);
		}
		
		//nombreColores[5]="verde";
		//podemos inicializar un arreglo al asignarlo a la variable
		//new String[4];
		String[] fruta = {"Naranja","uva","manzana","pitaya"};
		//para indicar una matriz(dos dimensiones)en un arreglo
		//se indica con corchotes dobles[][]
		//primer corchote son las filas y segundos columnas
		
		
		
		
		String[][] participantes = new String [3][5];
		participantes[1][3]="pax";
		
		for (int i = 0; i < participantes.length; i++) {
			for (int j = 0; j < participantes[i].length; j++) {
				System.out.println(participantes[i][j]);
			}
			
		}
	}

}
