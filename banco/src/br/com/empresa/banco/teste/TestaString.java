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
		manipulaInversoDaString("Socorram-me, subi no ônibus em Marrocos");
		manipulaInversoDaString("anotaram a data da maratona");
		manipulaPartesDaString("Socorram-me, subi no ônibus em Marrocos");
		manipulaPartesComBuilderDaString("Socorram-me, subi no ônibus em Marrocos");
		
	}
	
	public static void manipulaString(String manipulada) {
		for (int i = 0; i < manipulada.length(); i++) {
			System.out.println(manipulada.charAt(i));
		}
	}
	
	public static void manipulaInversoDaString(String manipulada) {
		for (int i = manipulada.length()-1; i >= 0; i--) {
			System.out.print(manipulada.charAt(i));
		}
		System.out.println();
	}
	
	public static void manipulaPartesDaString(String manipulada) {
		String[] palavras = manipulada.split(" ");
		for (int i = palavras.length-1; i >= 0; i--) {
			System.out.print(palavras[i] + 
							 (i != 0 ? " " : "\n"));
		}
	}
	
	public static void manipulaPartesComBuilderDaString(String manipulada) {
		StringBuilder builder = new StringBuilder();
		
		String[] palavras = manipulada.split(" ");
		for (String umaPalavra : palavras) {
			builder.append(umaPalavra + " ");
		}
		builder.reverse();
		System.out.println(builder.toString());
	}
}
