package br.com.empresa.banco.teste;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.ValorInvalidoException;

public class TestaDeposito {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca(0);
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}

	}

}
