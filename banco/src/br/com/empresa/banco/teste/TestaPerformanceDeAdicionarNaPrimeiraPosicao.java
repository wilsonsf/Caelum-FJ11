package br.com.empresa.banco.teste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestaPerformanceDeAdicionarNaPrimeiraPosicao {

	public static void main(String[] args) {
		
		System.out.println("Teste de inserção na primeira posição de 30mil objetos.");
		int numeroDeTestes = 10;
		
		List<Integer> arrayList = new ArrayList<Integer>();
		System.out.print("Teste Array:  ");
		System.out.println(" | Média: " + rodaNumeroDeTestes(numeroDeTestes, arrayList) + " ms");
		
		List<Integer> linkedList = new LinkedList<Integer>();
		System.out.print("Teste Linked: ");
		System.out.println(" | Média: " + rodaNumeroDeTestes(numeroDeTestes, linkedList) + " ms");
		
	}
	
	private static double rodaNumeroDeTestes(int numero, List<Integer> colecao) {
		
		long min = Long.MAX_VALUE;
		long max = Long.MIN_VALUE;
	
		double media = 0;
		for (int cont = 0; cont < numero; cont++) {
			long atual = testaEficienciaDaColecao(colecao);
			if (atual > max) max = atual;
			if (atual < min) min = atual;
			media += atual;
		}
		System.out.printf("%5d ms - %5d ms", min, max);
		return media/numero;
	}
	
	private static long testaEficienciaDaColecao(List<Integer> teste) {
		
		long inicio = System.currentTimeMillis();
		int total = 30000;
		
		for (int i = 0; i < total; i++) {
			teste.add(0,i);
		}
		
		long fim = System.currentTimeMillis();
		long tempo = fim - inicio;
		
		return tempo;
	}
}
