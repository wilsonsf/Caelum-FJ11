package br.com.empresa.banco;

public class TestaInteger {
	public static void main(String[] args) {
		Integer x1 = new Integer(10);
		Integer x2 = new Integer(10);
		
		// Endereço de memória diferente
		if (x1 == x2) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		if (x1.equals(x2)) {
			System.out.println("igual");
		} else {
			System.out.println("diferente");
		}
		
		System.out.println(x1.toString());
		System.out.println(Integer.parseInt("99"));
		try {
			System.out.println(Integer.parseInt("A"));
		} catch (Exception e) {
			System.err.println(e);
		} finally {
			System.out.println("Parabéns");
		}
	}
}
