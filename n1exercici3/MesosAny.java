package n1exercici3;

import java.util.Arrays;
import java.util.List;

public class MesosAny {

	public static void main(String[] args) {
		
		List<String> llistaMesos = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost", "Setembre", "Octubre", "Novembre", "Desembre");
		
		llistaMesos.forEach(mes -> System.out.println(mes));
	}
}
