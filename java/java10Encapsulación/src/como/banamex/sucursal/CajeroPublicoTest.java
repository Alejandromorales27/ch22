package como.banamex.sucursal;

import como.banamex.cajero.CajeroEncapsulado;

public class CajeroPublicoTest {
	
	public static void main(String[] args) {
		CajeroEncapsulado cajero001;
		cajero001=new CajeroEncapsulado(1,"Plaza Antea",500_000);
		System.out.println(cajero001.informacion());
		
		cajero001.setUbicacion("Angelopolis");
		System.out.println(cajero001.informacion());
		
		
	}

}
