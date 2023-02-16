package EmpleadoTest;


import java.util.ArrayList;
import java.util.List;

import com.banamex.empleado.CajeroEmpleado;
import com.banamex.empleado.CajeroPriorityEmpleado;
import com.banamex.empleado.Empleado;

public class EmpleadoTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empleado pax= new Empleado("paximo Decimo meridio","123144","MEDP31");
		System.out.println(pax);
		
		Empleado paxisSoto = new Empleado("paxis Soto");
		System.out.println(paxisSoto);
		
		CajeroEmpleado ruben= new CajeroEmpleado("Ruben");
		
		System.out.println(ruben);
		CajeroEmpleado brayan = new CajeroEmpleado("Brayan correa",1);
	
		System.out.println(brayan);
		
		ruben.saludo("profeso");
		ruben.saludo("maestro");
		
		
		Empleado jessica = new CajeroPriorityEmpleado("jesiica garcia");
		
		jessica.setNumSeguroSocial("983423");
		jessica.setRfc("gre34234325");
		System.out.println(jessica);
		brayan = new CajeroPriorityEmpleado("brayan correa");
		
		jessica =new CajeroEmpleado("jessica garcia", 5);
		System.out.println(jessica);
		System.out.println(jessica.saludo("licenciada"));
		
		List<Empleado> listaEmpleados = new ArrayList<>();
		listaEmpleados.add(jessica);
		listaEmpleados.add(ruben);
		listaEmpleados.add(brayan);
		listaEmpleados.add(paxisSoto);
	

	}
}
