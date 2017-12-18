package br.com.caelum.contas.main;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.contas.modelo.Data;

public class ContaBank {
	public static void main(String[] args) {
		Conta c1 = new Conta();
		Data d1 = new Data();
		Data d2 = new Data();
		new Conta();
		Conta c2 = new Conta();

		d1.dia = 14;
		d1.mes = 12;
		d1.ano = 2017;
		d2.dia = 17;
		d2.mes = 12;
		d2.ano = 2017;

		c1.setTitular("Pickles");
		c1.setNumero(123);
		c1.setAgencia("45666-6");
		c1.setSaldo(50.0);
		c1.setData(d1);

		System.out.println("Titular inicial: " + c1.getTitular());
		System.out.println("Numero inicial: " + c1.getNumero());
		System.out.println("Agencia inicial: " + c1.getAgencia());
		System.out.println("Saldo inicial: " + c1.getSaldo());
		System.out.println("Data inicial: " + c1.getData().dataCompleta());

		c1.bloqueio();

		c1.deposita(100.0);
		c1.saca(20);
		c1.saca(9999);
		System.out.println("\nRendimento mensal: " + c1.calculaRendimento()
				+ "\n");
		
		c1.bloqueio();
		
		c1.deposita(101.0);
		c1.saca(21);
		c1.saca(9299);

		c2.setTitular("OMG");
		c2.setNumero(1244);
		c2.setAgencia("334-1a-33");
		c2.setData(d2);
		c2.deposita(43450.52);
		c2.saca(101.50);
		c2.saca(98357348.01);
		System.out.println("\nRendimento mensal: " + c2.calculaRendimento()
				+ "\n");

		System.out.println(c1.recuperaDadosParaImpressao());
		System.out.println(c2.recuperaDadosParaImpressao());
	}
}
