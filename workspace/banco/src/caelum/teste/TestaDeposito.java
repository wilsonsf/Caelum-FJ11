package caelum.teste;

import caelum.classes.Conta;
import caelum.classes.ContaPoupanca;
import caelum.classes.ValorInvalidoException;

public class TestaDeposito {

	public static void main(String[] args) {
		Conta cp = new ContaPoupanca();
		try {
			cp.deposita(-100);
		} catch (ValorInvalidoException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
