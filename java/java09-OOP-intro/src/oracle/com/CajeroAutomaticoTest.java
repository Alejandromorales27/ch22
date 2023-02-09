package oracle.com;

public class CajeroAutomaticoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//utilizamos el atributo de clase
		System.out.println("nombre de banco: " + CajeroAutomatico.nombreBanco);
		
		//Instanciamos la clase para crear objetos
		
		CajeroAutomatico suc10 = new CajeroAutomatico();
		CajeroAutomatico suc12 = new CajeroAutomatico();
		
		suc10.numSerie=7854;
		suc10.ubicacion="Costco satelite";
		suc10.cantidadDisponible=98_500.00;
		suc10.numMovimientos=0;
		
		suc12.numSerie=7812;
		suc12.ubicacion="Plaza las Americas";
		suc12.cantidadDisponible=350_000.00;
		suc12.numMovimientos=0;
		
		System.out.println("Cajero suc12, es del banco " + suc12.nombreBanco);
		//lo recomendado es cambiar los atributos de clase
		//utilizando la clase
		//cajeroAutomatico.nombreBanco="paxtander"
		suc12.nombreBanco="Paxtander";
		System.out.println("cajero suc10, es del banco " + suc10.nombreBanco);
	}

}
