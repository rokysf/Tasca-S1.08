package n1exercici1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodeLletraO {

	public static void main(String[] args) {
	
		List<String> llistaStrings = Arrays.asList("hola", "gos", "casa", "cotxes", "gat", "perruquer", "motocicleta", "suc", "poma", "raqueta");
		System.out.println(llistaLletraO(llistaStrings));
	
	}
	
	public static List<String> llistaLletraO (List<String> llistaStrings){
		 
		return llistaStrings.stream().filter(paraula -> paraula.contains("o")).collect(Collectors.toList());

	}
	
}
