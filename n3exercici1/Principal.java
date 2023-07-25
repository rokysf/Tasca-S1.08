package n3exercici1;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		
		List<Alumne> llista = new ArrayList<Alumne>();
		
		llista.add(new Alumne("Joan", 44, "Java", 7.9f));
		llista.add(new Alumne("Ana", 35, "PHP", 10f));
		llista.add(new Alumne("Ferran", 48, "C++", 9f));
		llista.add(new Alumne("Maite", 23, "Python", 7.1f));
		llista.add(new Alumne("Lourdes", 24, "Java", 6.2f));
		llista.add(new Alumne("Marta", 37, "Java", 5.9f));
		llista.add(new Alumne("David", 49, "PHP", 4.5f));
		llista.add(new Alumne("Arnau", 50, "Python", 7.6f));
		llista.add(new Alumne("Lluis", 33, "JavaScript", 8.9f));
		llista.add(new Alumne("Carme", 30, "Java", 7.2f));
		
		llista.forEach(element -> System.out.println(element.getNom()+" "+element.getEdat()));
		System.out.println("-------------------------------------------------------------------");
		
		List<Alumne> llistaNomA = llista.stream().filter(element -> element.getNom().charAt(0) == 'A').toList();
		llistaNomA.forEach(element -> System.out.println(element));
		System.out.println("-------------------------------------------------------------------");
		
		List<Alumne> nota5 = llista.stream().filter(element -> element.getNota() >= 5).toList();
		nota5.forEach(element -> System.out.println(element));
		System.out.println("-------------------------------------------------------------------");
		
		List<Alumne> nota5Php = llista.stream().filter(element -> element.getNota() >= 5 && !element.getCurs().equals("PHP")).toList();
		nota5Php.forEach(element -> System.out.println(element));
		System.out.println("-------------------------------------------------------------------");
		
		List<Alumne> javaMajorsEdat = llista.stream().filter(element -> element.getEdat() >= 18 && element.getCurs().equals("Java")).toList();
		javaMajorsEdat.forEach(element -> System.out.println(element));
		System.out.println("-------------------------------------------------------------------");
	}

}
