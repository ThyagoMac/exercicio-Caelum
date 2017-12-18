package br.com.caelum.contas;

import br.com.caelum.contas.modelo.Conta;
import br.com.caelum.javafx.api.util.Evento;

public class ManipuladorDeContas {

	private Conta conta;

	public void criaConta(Evento evento) {
		this.conta = new Conta();
		this.conta.setAgencia("123");
		this.conta.setNumero(56789);
		this.conta.setTitular("Batimá");
		this.conta.setSaldo(800.00);
		//this.conta.bloqueio();
	}

	public void deposita(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.deposita(valorDigitado);
	}
	public void saca(Evento evento) {
		double valorDigitado = evento.getDouble("valor");
		this.conta.saca(valorDigitado);
	}
}
