package br.com.caelum.contas.modelo;

public class ContaCorrente extends Conta implements Tributavel {
	@Override
	public void saca(double valor) {
		if (valor < 0) {
			throw new IllegalArgumentException(
					"Voçê tentou sacar um valor negativo");
		} else if (valor <= this.getSaldo()) {

			System.out.println("---Operação de Saque---");
			System.out.println("Saldo antes da operação: " + this.getSaldo());
			this.setSaldo(this.getSaldo() - valor - 0.10);
			System.out.println("Sacado: " + valor);
			System.out.println("Saldo atual: " + this.getSaldo());
			System.out.println("----------");
		} else {
			System.err
					.println("Não foi possivel realisar sua operação!!! Saldo insuficiente!!!\n"
							+ "Saldo: "
							+ this.getSaldo()
							+ " Valor digitado: "
							+ valor);
			throw new SaldoInsuficienteException(
					"Saldo insuficiente para sacar o valor de: " + valor);
		}
	}

	public double getValorImposto() {
		return this.getSaldo() * 0.01;
	}

	public String getTipo() {
		return "Conta Corrente";
	}
}
