package n2exercici4;

import java.util.Arrays;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		Object[] array = {"hola", 3, "empenta", "moto", 67, 222, "casa", 88, "enredar"};
		List<Object> llista = Arrays.asList(array);
		
		List<String>ordreAlfabetic = llista.stream().map(Object::toString).sorted((a,b) -> Character.compare(a.charAt(0), b.charAt(0))).toList();
		System.out.println(ordreAlfabetic);
		
		List<String>ordreLletraE = llista.stream().map(Object::toString).sorted((a,b) -> {
			if (a.contains("e") && !b.contains("e")) {
				return -1;
			} else if (!a.contains("e") && b.contains("e")) {
				return 1;
			} else {
				return 0;
			}
		}).toList();
		System.out.println(ordreLletraE);
		
		List<String>modificarAper4 = llista.stream().map(Object::toString).map(element -> element.replace("a", "4")).toList();
		System.out.println(modificarAper4);
		
		List<String>mostrarNumerics = llista.stream().map(Object::toString).filter(element -> element.matches("\\d+")).toList();
		System.out.println(mostrarNumerics);
		
	}
}
