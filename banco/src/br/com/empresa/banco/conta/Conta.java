package br.com.empresa.banco.conta;

public abstract class Conta implements Comparable<Conta>{
	protected String cliente;
	protected int numero;
	protected int agencia;
	protected double saldo;

	public Conta(double saldo) {
		this.saldo = saldo;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
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
		return	"Agência: " + this.agencia 	+ "\n" +
				"Número:  " + this.numero 	+ "\n" + 
				"Saldo:   " + this.saldo 	+ "\n" + 
				"Cliente: " + this.cliente 	+ "\n";
	}

	@Override
	public boolean equals(Object obj) {
		// if ((obj instanceof Conta)) {
		// return false;
		// }
		Conta conta = (Conta) obj;
		if (conta.getNumero() == this.numero && 
				conta.getCliente().equals(this.cliente)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Conta o) {
		return this.getNumero() - o.getNumero();
	}
}
