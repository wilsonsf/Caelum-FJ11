public class TestaContas {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(1000.5);
		if (conta.saca(50.5)) {
			System.out.println("Contando cédulas");
		} else {
			System.out.println("Saldo insuficiente");
		}
	}
}
