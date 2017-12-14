class Conta{
	public static int contador;
	private String titular;
	private int numero;
	private String agencia;
	private double saldo;
	private Data data;
	//geters
	public String getTitular(){
		return this.titular;
	}
	public int getNumero(){
		return this.numero;
	}
	public String getAgencia(){
		return this.agencia;
	}
	public double getSaldo(){
		return this.saldo;
	}
	public Data getData(){
		return this.data;
	}
	//seters
	public void setTitular(String titular){
		this.titular = titular;
	}
	public void setNumero(int numero){
		this.numero = numero;
	}
	public void setAgencia(String agencia){
		this.agencia = agencia;
	}
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	public void setData(Data data){
		this.data = data;
	}

	//constructor
	public Conta() {
		contador++;
System.out.println("Novo obj Conta criado numero total de Contas: " + contador);
	}

	void saca(double valor){
		if (valor <= this.getSaldo()){

			System.out.println("\n---Operação de Saque---"); 
			System.out.println("Valor antes da operação: " + this.getSaldo());
			this.setSaldo(this.getSaldo() + valor);
			System.out.println("Sacado: " + valor);
			System.out.println("Saldo atual: " + this.getSaldo());
			System.out.println("----------\n");
		} else {
			System.out.println("Não foi possivel realisar sua operação!!! Saldo insuficiente!!!\n" +
					"Saldo: "+ this.getSaldo() + " Valor digitado: " + valor);
		}
	}
	void deposita(double valor){
		
		System.out.println("\n---Operação de Deposito---");
		System.out.println("Valor antes da operação: " + this.getSaldo());
		this.setSaldo(this.getSaldo() + valor);
		System.out.println("Depositado: " + valor);
		System.out.println("Saldo atual: " + this.getSaldo());
		System.out.println("----------\n");
		
	}

	double calculaRendimento(){
		double rendimento = this.getSaldo() * 0.01;
		return rendimento;
	}

	String recuperaDadosParaImpressao(){
		String dados = "\n---Dados da conta---\n" +
				"Titular: " + this.getTitular() +
				"\n Numero: " + this.getNumero() +
				"\n Agencia: " + this.getAgencia() +
				"\n Saldo: " + this.getSaldo() +
				"\n Data de Abertura: " + this.data.dataCompleta() +
				"\n Rendimento Mensal: " + this.calculaRendimento() +
				"\n-----------------------\n";
		return dados;
	}
	
}
