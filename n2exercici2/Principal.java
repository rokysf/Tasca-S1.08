package n2exercici2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Principal {

	public static void main(String[] args) {
	
		List<Integer> llista = new ArrayList<Integer>();
		llista.add(3);
		llista.add(55);
		llista.add(44);
		
		System.out.println(convertirLlista(llista));
		

	}


	public static String convertirLlista(List<Integer> llista) {
		
		return llista.stream().map(num -> (num % 2 == 0 ? "e" : "o") + num).collect(Collectors.joining(","));
	
	}
}
