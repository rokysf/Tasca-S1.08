package n1exercici8;

public class Principal {

	public static void main(String[] args) {
		
		StringReverse stringReverse = str -> {
		return new StringBuilder(str).reverse().toString();
		};
			
		System.out.println(stringReverse.reves("Hola mundo"));
	}
}
