package br.com.empresa.banco.teste;

import java.util.HashMap;
import java.util.Map;

import br.com.empresa.banco.conta.Conta;
import br.com.empresa.banco.conta.ContaCorrente;

public class TestaMapa {
	public static void main(String[] args) {
		Conta c1 = new ContaCorrente(0);
		c1.deposita(10000);
		
		Conta c2 = new ContaCorrente(0);
		c2.deposita(3000);
		

		Map<String, Conta> mapaDeContas = new HashMap<String, Conta>();
		mapaDeContas.put("diretor", c1);
		mapaDeContas.put("gerente", c2);
		
		Conta contaDoDiretor = mapaDeContas.get("diretor");
		System.out.println(contaDoDiretor.getSaldo());
		
	}

}
