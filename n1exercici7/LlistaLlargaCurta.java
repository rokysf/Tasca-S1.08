package n1exercici7;

import java.util.Arrays;
import java.util.List;

public class LlistaLlargaCurta {

	public static void main(String[] args) {
		
		List<Object> llista = Arrays.asList("hola", 5, 66, "gat", "mecanic", "rentadora", 94, 5, "Groenlandia");
	
		List<String> llista2 = llista.stream()
	    .filter(obj -> obj instanceof String)
	    .map(obj -> (String) obj)
	    .sorted((s1, s2) -> Integer.compare(s2.length(), s1.length()))
	    .toList();
	    
		llista2.forEach(System.out::println);
	}

}
