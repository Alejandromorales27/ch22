package como.banamex.Banco;

import java.util.ArrayList;
import java.util.List;

import como.banamex.cajero.CajeroEncapsulado;

public class Banco {
	
	private int numBanco;
	private int numEmpleado;
	private String direccion;
	private ArrayList<CajeroEncapsulado>cajeros;
	static String nombreBanco;
	static int contadorBanco;
	
	//private HashMap<id , Empleado>;
	

	

	
	static {
		nombreBanco="PaxNorte";
		contadorBanco=1;
	}

	public Banco(int numEmpleado, String direccion) {
		super();
		this.numBanco=contadorBanco++;
		this.numEmpleado = numEmpleado;
		this.direccion = direccion;
		
	}

	public int getNumBanco() {
		return numBanco;
	}

	public void setNumBanco(int numBanco) {
		this.numBanco = numBanco;
	}

	public int getNumEmpleado() {
		return numEmpleado;
	}

	public void setNumEmpleado(int numEmpleado) {
		this.numEmpleado = numEmpleado;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public ArrayList<CajeroEncapsulado> getCajero() {
		return cajeros;
	}

	public void setCajero(ArrayList<CajeroEncapsulado> cajero) {
		this.cajeros = cajero;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Banco [numBanco=");
		builder.append(numBanco);
		builder.append(", numEmpleado=");
		builder.append(numEmpleado);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", cajero=");
		builder.append(cajeros);
		/**for(CajeroEncapsulado cajero: cajeros) {
			builder.append(cajero.informacion());
		}*/
		
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
