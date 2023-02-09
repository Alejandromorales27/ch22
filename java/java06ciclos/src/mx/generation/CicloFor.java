package mx.generation;

import java.util.Iterator;

public class CicloFor {

	public static void main(String[] args) {
		
		/**
		 * 
		 * sintaxis ciclo fot
		 * 
		 * for (expresion_inicial, comparacion, expresion_final)
		 * 	instruncion;
		 * 
		 * for(espresion_inicial, comparacion, experesion final){
		 * 
		 * }
		*/
		
		//imprimir la tabla de multiplicar de 1 al 3
		//1*1= 1
		//1*10=10
		
		for(int i=1; i<=3;i++) {
			for(int j=1; j<=10; j++) {
				
				//System.out.println(i+ "*"+ j + "= " + i*j);
				System.out.printf("%d * %d = %d %n", i,j,i*j );
				//numero entero
				//numero flotante
			}
			
			int iteracion=1;
			
			for(;iteracion <5;) {
				System.out.println("valor de interacion " + iteracion);
				iteracion++;
			}
			
			for (int index = 0; index <= 20; index++) {
				if(index%2==0)continue;
				System.out.printf("El %02d es impar%n",index);
				
			}
			
			
			
			
		}
		
	}

}
