package br.com.empresa.banco.teste;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();

		Random random = new Random();
		for (int i = 0; i < 5; i ++ ) {
			Integer saldo = 1000 + random.nextInt(1000);
			ContaPoupanca c1 = new ContaPoupanca(saldo);
			c1.setNumero(new Random().nextInt(1000));
			contas.add(c1);
		}
		
		for (ContaPoupanca umaConta : contas) {
			System.out.println("Número: " + umaConta.getNumero());
		}	
		
		Collections.sort(contas);
		System.out.println();
		
		for (ContaPoupanca umaConta : contas) {
			System.out.println("Número: " + umaConta.getNumero());
		}
		
		Collections.reverse(contas);
		System.out.println();
		
		for (ContaPoupanca umaConta : contas) {
			System.out.println("Número: " + umaConta.getNumero());
		}
		
		Collections.shuffle(contas);
		System.out.println();
		
		for (ContaPoupanca umaConta : contas) {
			System.out.println("Número: " + umaConta.getNumero());
		}
		
		Collections.rotate(contas, 2);
		System.out.println();
		
		for (ContaPoupanca umaConta : contas) {
			System.out.println("Número: " + umaConta.getNumero());
		}
	}
}
