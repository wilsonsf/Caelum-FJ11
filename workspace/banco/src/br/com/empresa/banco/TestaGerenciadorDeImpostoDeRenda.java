package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.SeguroDeVida;
import br.com.empresa.banco.sistema.GerenciadorDeImpostoDeRenda;

public class TestaGerenciadorDeImpostoDeRenda {

	public static void main(String[] args) {
		GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

		SeguroDeVida sv = new SeguroDeVida();
		gerenciador.adiciona(sv);

		ContaCorrente cc = new ContaCorrente();
		cc.deposita(1000);
		gerenciador.adiciona(cc);

		System.out.printf("O saldo é: %.2f", gerenciador.getTotal());
		// System.out.println("Total de impostos: " + gerenciador.getTotal());
	}
}
