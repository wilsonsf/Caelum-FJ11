package br.com.empresa.banco.teste;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.GuardadorDeObjetos;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		Conta cc = new ContaCorrente(0);
		guardador.adicionaObjeto(cc);
		
		Conta cp = (ContaCorrente) guardador.pegaObjeto(new Integer(0));

		System.out.println(cp);
	}
}
