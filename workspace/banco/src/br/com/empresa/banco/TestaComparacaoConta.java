package br.com.empresa.banco;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaComparacaoConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Conta c1 = new ContaCorrente(1000);
		Conta c2 = new ContaCorrente(1000);
		
		c1.setNumero(15);
		c2.setNumero(15);
		
		if (c1.equals(c2)){
			System.out.println("Contas iguais!");
		} else {
			System.out.println("Contas diferentes!");
		}
	}
}
