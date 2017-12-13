class Conta{
	String titular;
	int numero;
	String agencia;
	double saldo;
	Data data;

	void saca(double valor){
		if (valor <= this.saldo){

			System.out.println("\n---Operação de Saque---"); 
			System.out.println("Valor antes da operação: " + this.saldo);
			this.saldo -= valor;
			System.out.println("Sacado: " + valor);
			System.out.println("Saldo atual: " + this.saldo);
			System.out.println("----------\n");
		} else {
			System.out.println("Não foi possivel realisar sua operação!!! Saldo insuficiente!!!\n" +
					"Saldo: "+ this.saldo + " Valor digitado: " + valor);
		}
	}
	void deposita(double valor){
		
		System.out.println("\n---Operação de Deposito---");
		System.out.println("Valor antes da operação: " + this.saldo);
		this.saldo += valor;
		System.out.println("Depositado: " + valor);
		System.out.println("Saldo atual: " + this.saldo);
		System.out.println("----------\n");
		
	}

	double calculaRendimento(){
		double rendimento = this.saldo * 0.01;
		return rendimento;
	}

	String recuperaDadosParaImpressao(){
		String dados = "\n---Dados da conta---\n" +
				"Titular: " + this.titular +
				"\n Numero: " + this.numero +
				"\n Agencia: " + this.agencia +
				"\n Saldo: " + this.saldo +
				"\n Data de Abertura: " + this.data.dataCompleta() +
				"\n Rendimento Mensal: " + this.calculaRendimento() +
				"\n-----------------------\n";
		return dados;
	}
	
}
