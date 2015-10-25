package br.com.empresa.banco.conta;

public class ContaPoupanca extends Conta {
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
}
