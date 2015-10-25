package br.com.empresa.banco;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;

public class Banco {
	List<Conta> contas = new ArrayList<Conta>();
	Map<String,Conta> indexadoPorNome = new HashMap<String, Conta>();
	
	void add(Conta conta) {
		contas.add(conta);
		indexadoPorNome.put(conta.getCliente(), conta);
	}
	
	Conta getContaAt(int posicao) {
		return contas.get(posicao);
	}

	int getQuantidadeDeContas() {
		return contas.size();
	}
	
	Conta buscaPorNome(String nome) {
		return indexadoPorNome.get(nome);
	}
}
