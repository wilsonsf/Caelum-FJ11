package br.com.empresa.banco.sistema;

import br.com.empresa.banco.conta.Conta;

public class AtualizadorDeContas {
	private double saldoTotal = 0;
	private double selic;

	public AtualizadorDeContas(double selic) {
		this.selic = selic;
	}

	public double getSaldoTotal() {
		return saldoTotal;
	}

	public double getSelic() {
		return selic;
	}

	public void roda(Conta conta) {
		System.out.println("Saldo anterior: " + conta.getSaldo());
		conta.atualiza(selic);
		System.out.println("Saldo final: " + conta.getSaldo());
		this.saldoTotal += conta.getSaldo();
	}

}
