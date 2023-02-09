package oracle.com;

public class CajeroAutomaticoConstructorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CajeroAutomatico caj11 = new CajeroAutomatico("Plaza patio");
		CajeroAutomatico caj13 = new CajeroAutomatico("Av. Benito Juarez");
		
		System.out.println(CajeroAutomatico.nombreBanco);
		System.out.println(caj11.hashCode());
		System.out.println(caj11.imprimirDatosPlaca());
		System.out.println(caj13.imprimirDatosPlaca());
		
		System.out.println("precio dolar: caj11 " + caj11.valorDolar());
		System.out.println("precio dolar caj13: " + caj13.valorDolar());
		
		Banco Sucursal1 = new Banco("coyoacan", "pepito grillo",1000);
		
		System.out.println(Sucursal1.gerente);
		System.out.println(Sucursal1.nombreCliente("pinocho"));
		System.out.println(Banco.nombreBanco);
		System.out.println(Banco.numClientesTotales());
		System.out.println(Sucursal1.numClientesTotales());

	}

}
