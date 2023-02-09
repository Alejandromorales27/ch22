package mx.generation;

public class arbol {

	 /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	
        int i,j,k,n;
        n=10; //Modifica este parámetro si quieres
        
        for(i=1; i<n+(n/2); i++){
            for(j=n+(n/2); j>i; j--){
                System.out.print(" ");}
            for(k=1; k<=2*i-1; k++){
                System.out.print("*");}
            System.out.println("");
        }
        for(i=1; i<n-(n/4); i++){
            for(j=n+(n/4); j>1; j--){
                System.out.print(" ");}
            for(k=n/4; k<=(n/4)+1; k++){
                System.out.print("***");}
            System.out.println("");
        }
    }


	}


