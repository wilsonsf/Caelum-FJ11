package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.List;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	
	void add(Conta conta) {
		contas.add(conta);
	}
	
	Conta getContaAt(int posicao) {
		return contas.get(posicao);
	}

	int getQuantidadeDeContas() {
		return contas.size();
	}
}
