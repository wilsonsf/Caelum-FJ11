package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaContas {
	public static void main(String[] args) {
		Conta conta = new ContaCorrente(0);
		conta.deposita(1000.5);
		if (conta.saca(50.5)) {
			System.out.println("Contando cédulas");
		} else {
			System.out.println("Saldo insuficiente");
		}
		conta.atualiza(0.01);

		new ContaCorrente(0);

		new ContaPoupanca(0);
	}
}
