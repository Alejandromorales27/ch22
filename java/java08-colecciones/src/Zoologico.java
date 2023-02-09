import java.util.Arrays;
import java.util.HashSet;

public class Zoologico {

	public static void main(String[] args) {
		String[] animales= {
				"panda",
				"caballo",
				"gorila",
				"cocodrilo",
				"panda",
				"cocodrilo",
				"zopilote",
				"urraca",
				"leon"
				
		};
		
		/**
		for(String animal: animales) {
			especies.add(animal);
		}
		*/
		
		HashSet<String> especies= new HashSet<String>(Arrays.asList(animales));
		
		System.out.println("total animales: " + animales.length);
		System.out.println("total especies: " + especies.size());
		
		//listar especies y el numero que lo contiene
		
		for ()
	}
}
