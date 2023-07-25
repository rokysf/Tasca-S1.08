package n1exercici4;

import java.util.Arrays;
import java.util.List;

public class MesosAnyReference {

	public static void main(String[] args) {

		List<String> llistaMesos = Arrays.asList("Gener", "Febrer", "Març", "Abril", "Maig", "Juny", "Juliol", "Agost",	"Setembre", "Octubre", "Novembre", "Desembre");

		llistaMesos.forEach(System.out::println);
	}
}
