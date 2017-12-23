package br.com.caelum.contas.modelo;

public class Conta implements Comparable<Conta> {
	public static int contador;
	private String titular;
	private int numero;
	private String agencia;
	protected double saldo;
	private Data data;
	private boolean estado;

	// geters
	public String getTitular() {
		return this.titular;
	}

	public int getNumero() {
		return this.numero;
	}

	public String getAgencia() {
		return this.agencia;
	}

	public double getSaldo() {
		return this.saldo;
	}

	public Data getData() {
		return this.data;
	}

	public boolean getEstado() {
		return estado;
	}

	// seters
	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void setData(Data data) {
		this.data = data;
	}

	public void setEstado(boolean estado) {
		this.estado = estado;
	}

	// constructor
	public Conta() {
		contador++;
		System.out.println("Novo obj Conta criado numero total de Contas: "
				+ contador);
		// this.titular = titular;
		this.estado = false;
	}

	public void saca(double valor) {
		if (!estado) {
			if (valor <= this.getSaldo()) {

				System.out.println("---Operação de Saque---");
				System.out.println("Saldo antes da operação: "
						+ this.getSaldo());
				this.setSaldo(this.getSaldo() - valor);
				System.out.println("Sacado: " + valor);
				System.out.println("Saldo atual: " + this.getSaldo());
				System.out.println("----------");
			} else {
				System.err
						.println("Não foi possivel realisar sua operação!!! Saldo insuficiente!!!\n"
								+ "Saldo: "
								+ this.getSaldo()
								+ " Valor digitado: " + valor);
			}
		} else {
			System.err
					.println("---------\nERROR! Impossivel efetuar o saque!! \nSua Conta está bloqueada. \nContate sua agencia ou ligue para 0800-666fromhell666\n---------");
		}
	}

	public void deposita(double valor) {
		if (!estado) {
			if (valor < 0) {
				throw new IllegalArgumentException(
						"Voçê tentou depositar um valor negativo.");
			} else {
				System.out.println("---Operação de Deposito---\n"
						+ "Saldo antes da operação: " + this.getSaldo());
				this.setSaldo(this.getSaldo() + valor);
				System.out.println("Depositado: " + valor + "\nSaldo atual: "
						+ this.getSaldo() + "\n----------");
			}
		} else {
			System.err
					.println("---------\nERROR! Impossivel efetuar o deposito!! \nSua Conta está bloqueada. \nContate sua agencia ou ligue para 0800-666fromhell666\n---------");
		}
	}

	public void bloqueio() {
		if (this.estado == true) {
			System.out
					.println("Conta de "
							+ this.titular
							+ " Liberada \n Use o comando novamente para BLOQUEAR a conta");
			this.setEstado(false);
		} else if (this.estado == false) {
			System.out
					.println("Conta de "
							+ this.titular
							+ " Bloqueada \n Use o comando novamente para DESBLOQUEAR a conta");
			this.setEstado(true);
		}
	}

	public double calculaRendimento() {
		double rendimento = this.getSaldo() * 0.01;
		return rendimento;
	}

	public String recuperaDadosParaImpressao() {
		String dados = "\n---Dados da conta---\n" + "Titular: "
				+ this.getTitular() + "\n Numero: " + this.getNumero()
				+ "\n Agencia: " + this.getAgencia() + "\n Saldo: "
				+ this.getSaldo() + "\n Data de Abertura: "
				+ this.data.dataCompleta() + "\n Rendimento Mensal: "
				+ this.calculaRendimento() + "\n Conta Está Bloqueada? "
				+ this.getEstado() + "\n-----------------------";
		return dados;
	}

	public String getTipo() {
		return "Conta";
	}

	public void transfere(double valor, Conta conta) {
		this.saca(valor);
		conta.deposita(valor);
	}

	@Override
	public String toString() {
		return "[titular=" + titular.toUpperCase() + ", numero=" + numero + ", agencia="
				+ agencia.toUpperCase() + "]";
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		Conta outraConta = (Conta) obj;

		return this.numero == outraConta.numero
				&& this.agencia.equals(outraConta.agencia);
	}

	@Override
	public int compareTo(Conta outraConta) {
		return this.titular.compareTo(outraConta.titular);
	}
}
