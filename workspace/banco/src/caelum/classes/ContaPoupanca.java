package caelum.classes;
public class ContaPoupanca extends Conta {
	@Override
	public void deposita(double valor) {
		super.deposita(valor);
	}

	@Override
	public void atualiza(double taxa) {
		this.saldo += this.saldo * taxa * 3;
	}
}
