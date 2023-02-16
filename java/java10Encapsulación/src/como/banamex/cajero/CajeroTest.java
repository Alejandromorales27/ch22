package como.banamex.cajero;

public class CajeroTest {
	
	public static void main(String[] args) {
		Cajero cajero001=new Cajero(1,"av. siempre Viva",325_000);
		Cajero cajero002=new Cajero(1,"av. siempre Viva",325_000);
		
		System.out.println(cajero001.informacion());
		System.out.println(cajero002.informacion());
		
		cajero001.numSerie=800;//la clase no debe permitir esta modificacion
		System.out.println(cajero001.informacion());
		
		cajero001.contadorCajero=0;//tampoco esto
		Cajero cajero003=new Cajero(1,"av. siempre Viva",325_000);
		System.out.println(cajero003.informacion());
		
		
	}

	
	
	
}
