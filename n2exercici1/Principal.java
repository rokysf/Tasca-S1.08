package n2exercici1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<String> llista = new ArrayList<String>();
		
		llista.add("Maria");
		llista.add("Ana");
		llista.add("Amparo");
		llista.add("Josep");
		llista.add("Federico");
		llista.add("LLuisa");
		
		System.out.println(filtreLlista(llista));
	}

	public static List<String> filtreLlista(List<String> llista){
		
		return llista.stream().filter(cadena -> cadena.charAt(0)=='A' && cadena.length()==3).toList();		
			
	}
}
