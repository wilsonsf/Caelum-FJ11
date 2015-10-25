package br.com.empresa.banco.teste;

import java.io.PrintStream;

import br.com.empresa.banco.conta.ContaCorrente;

public class TestaString {

	public static void main(String[] args) {
		String s = "fj11";
		String s1 = s.replaceAll("1", "2");
		System.out.println(s);
		System.out.println(s1);

		String teste = "fj";
		System.out.println((s.contains(teste)) ? "Contém" : "Não contém");

		String espacoEmBranco = "Nome Completo         ";

		System.out.println(espacoEmBranco + ".");
		System.out.println(espacoEmBranco.trim() + ".");

		System.out.println((s.isEmpty()) ? "Está vazio" : "Não está vazio");
		System.out.println("Tamanho de (" + s + ") : " + s.length());
		
		PrintStream saida = System.out;
		saida.println("Ola");
		
		System.out.println(new ContaCorrente(250.0));
		
		manipulaString("arara");
	}
	
	public static void manipulaString(String manipulada) {
		for (int i = 0; i < manipulada.length(); i++) {
			System.out.println(manipulada.charAt(i));
		}
	}
}
