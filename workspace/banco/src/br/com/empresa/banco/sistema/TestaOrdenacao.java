package br.com.empresa.banco.sistema;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

import br.com.empresa.banco.conta.ContaPoupanca;

public class TestaOrdenacao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<ContaPoupanca> contas = new LinkedList<ContaPoupanca>();

		ContaPoupanca c1 = new ContaPoupanca(0);
		c1.setNumero(1973);
		contas.add(c1);

		ContaPoupanca c2 = new ContaPoupanca(0);
		c2.setNumero(1462);
		contas.add(c2);

		ContaPoupanca c3 = new ContaPoupanca(0);
		c3.setNumero(1854);
		contas.add(c3);
		System.out.println();
		
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
