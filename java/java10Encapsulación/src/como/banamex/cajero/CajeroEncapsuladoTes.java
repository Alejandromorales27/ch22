package como.banamex.cajero;

public class CajeroEncapsuladoTes {
	
	public static void main(String[] args) {
		CajeroEncapsulado cajero001=new CajeroEncapsulado(1,"av. siempre Viva",325_000);
		CajeroEncapsulado cajero002=new CajeroEncapsulado(1,"av. siempre Viva",325_000);
		
		System.out.println(cajero001.informacion());
		System.out.println(cajero002.informacion());

		//cajero001.numSerie=800; no se puede tener acceso porque esta encapsulado
		
		
		//Cajero001 cambio de ubicacion , hay que ponerle otra ubicacion.
		//cajero001.ubicacion = "Av. Saltilondon" esta encapsulado, no se puede modificar.
		
		cajero001.setUbicacion("Av. Saltilondon");
		System.out.println(cajero001.informacion());
		
		System.out.println("valor contador: " + CajeroEncapsulado.getContadorCajero());
		
	}

	
	
	
}
