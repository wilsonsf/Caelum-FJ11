package br.com.empresa.banco.conta;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(double saldo) {
		super(saldo);
	}

	public ContaCorrente(int numero, String cliente) {
		super(numero, cliente);
	}

	@Override
	public void deposita(double valor) {
		super.deposita(valor - 0.1);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 2;
	}

	@Override
	public double calculaTributos() {
		return this.getSaldo() * 0.01;
	}
}
