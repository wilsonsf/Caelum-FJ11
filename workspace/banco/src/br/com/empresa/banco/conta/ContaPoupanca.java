package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta implements Comparable<ContaPoupanca> {
	public ContaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}

	@Override
	public int compareTo(ContaPoupanca o) {
		return this.getNumero() - o.getNumero();
	}
}
