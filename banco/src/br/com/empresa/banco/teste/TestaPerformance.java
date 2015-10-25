package br.com.empresa.banco.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {

	public static void main(String[] args) {
		System.out.println("iniciando...");
		
		System.out.println("Teste de inserção e consulta de 30mil objetos.");
		 
		 /**
		  * Teste de inserção e consulta de 30mil.
		  * ArrayList: 888 - 932ms | Média: 903.2 ms
		  * HashSet: 	 2 -  28ms | Média: 9.0 ms
		  */
		
		int numeroDeTestes = 5;
		
		Collection<Integer> testeList = new ArrayList<>();
		Collection<Integer> testeSet = new HashSet<>();
			
		
		System.out.print("Teste List: ");
		System.out.println(" | Média: " + rodaNumeroDeTestes(numeroDeTestes, testeList)
							+ " ms");

		System.out.print("Teste Set:  ");
		System.out.println(" | Média: " + rodaNumeroDeTestes(numeroDeTestes, testeSet)
							+ " ms");
		
	}
	
	private static double rodaNumeroDeTestes(int numero, Collection<Integer> colecao) {
		
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
	
		double media = 0;
		for (int cont = 0; cont < numero; cont++) {
			long atual = testaEficienciaDaColecao(colecao);
			if (atual > max) max = atual;
			if (atual < min) min = atual;
			media += atual;
		}
		System.out.printf("%3d ms - %3d ms", min, max);
		return media/numero;
	}

	private static long testaEficienciaDaColecao(Collection<Integer> teste) {
		
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(i);
		}
		
		for (int i = 0; i < total; i++) {
			teste.contains(i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		return tempo;
	}
}



