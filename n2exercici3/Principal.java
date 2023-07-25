package n2exercici3;

public class Principal {

	public static void main(String[] args) {
		
		Operar sum = (num1, num2) -> num1 + num2;
		Operar rest = (num1, num2) -> num1 - num2;
		Operar mult = (num1, num2) -> num1 * num2;
		Operar div = (num1, num2) -> num1 / num2;
			
		System.out.println(sum.operacio(12,6));
		System.out.println(rest.operacio(12,6));
		System.out.println(mult.operacio(12,6));
		System.out.println(div.operacio(14,6));
		
	}
}
