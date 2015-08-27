public class ContaCorrente extends Conta {
	@Override
	public void atualiza(double taxa) {
		super.atualiza(taxa * 2);
	}
}
