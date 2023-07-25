package n1exercici2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MetodeLletraO5 {

	public static void main(String[] args) {
		
		List<String> llistaStrings = Arrays.asList("hola", "gos", "casa", "cotxes", "gat", "perruquer", "motocicleta", "suc", "poma", "raqueta");
		System.out.println(llistaLletraO5(llistaStrings));
	}

	public static List<String> llistaLletraO5 (List<String> llistaStrings){
		 
		return llistaStrings.stream().filter(paraula -> paraula.contains("o") && paraula.length()>5).collect(Collectors.toList());

	}
	
}
