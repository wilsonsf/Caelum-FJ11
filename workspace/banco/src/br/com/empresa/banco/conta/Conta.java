package br.com.empresa.banco.conta;

public abstract class Conta {
	protected int numero;
	protected int agencia;
	protected double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposita(double valor) {
		if (valor <= 0) {
			throw new ValorInvalidoException(valor);
		} else {
			this.saldo += valor;
		}
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else
			return false;
	}

	public abstract void atualiza(double taxa);

	@Override
	public String toString() {
		return super.toString() + "\nAgência: " + this.agencia + "\nNúmero:  "
				+ this.numero + "\nSaldo:   " + this.saldo;
	}
}
