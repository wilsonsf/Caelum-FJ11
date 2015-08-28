package br.com.empresa.banco;

import br.com.empresa.banco.conta.ContaCorrente;
import br.com.empresa.banco.conta.ContaPoupanca;
import br.com.empresa.banco.conta.GuardadorDeObjetos;

public class TestaGuardadorDeObjetos {

	public static void main(String[] args) {
		GuardadorDeObjetos guardador = new GuardadorDeObjetos();
		ContaCorrente cc = new ContaCorrente(0);
		guardador.adicionaObjeto(cc);
		
		ContaPoupanca cp = (ContaPoupanca) guardador.pegaObjeto(0);

	}

}
