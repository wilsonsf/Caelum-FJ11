package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.sistema.AtualizadorDeContas;

public class TestaAtualizadorDeContas {

	public static void main(String[] args) {
		Conta c = new ContaCorrente(0);
		Conta cc = new ContaCorrente(0);
		Conta cp = new ContaPoupanca(0);

		c.deposita(1000);
		cc.deposita(1000);
		cp.deposita(1000);

		AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
		adc.roda(c);
		adc.roda(cc);
		adc.roda(cp);

		System.out.println("Saldo total processado: " + adc.getSaldoTotal());
	}

}
