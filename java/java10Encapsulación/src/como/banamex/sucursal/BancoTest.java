package como.banamex.sucursal;

import java.util.ArrayList;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import como.banamex.Banco.Banco;
import como.banamex.cajero.CajeroEncapsulado;

public class BancoTest {
	
	public static void main(String[] args) {
		Banco sucNorte=new Banco(10,"calle norte");
		System.out.println(sucNorte);
		
		ArrayList<CajeroEncapsulado>atms =new ArrayList<CajeroEncapsulado>();
		
		
		atms.add(new CajeroEncapsulado(1,sucNorte.getDireccion(),500_00));
		atms.add(new CajeroEncapsulado(2,sucNorte.getDireccion(),500_00));
		atms.add(new CajeroEncapsulado(3,sucNorte.getDireccion(),500_00));
		
		sucNorte.setCajero(atms);
		
		System.out.println(sucNorte);
		
		//agregamos nuevo monto al cajero
		
		CajeroEncapsulado cajeroModificado;
		
		//objetamos el cajero1 del banco
		cajeroModificado=sucNorte.getCajero()//obtenemos la coleccion de cajeros
				.get(0);//de la coleccion, obtengo el indice 0(cajero 1)
		
		cajeroModificado.setMontoDisponible(123_000);
		System.out.println(sucNorte);
		
		cajeroModificado=null;//para que esta variable no apunte a nada
		
		sucNorte.getCajero().get(1).setMontoDisponible(-100);
		System.out.println(sucNorte);
		
		
	}


}
