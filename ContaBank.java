class ContaBank{
	public static void main(String[] args){
		Conta c1 = new Conta();
		Data d1 = new Data();
		new Conta();
		Conta c2 = new Conta();
		
		d1.dia = 14;
		d1.mes = 12;
		d1.ano = 2017;		

		//c1.titular = "Pickles";
		c1.setTitular("Pickles");
		//c1.numero = 123;
		c1.setNumero(123);
		//c1.agencia = "45666-6";
		c1.setAgencia("45666-6");
		//c1.saldo = 50.0;
		c1.setSaldo(50.0);
		////c1.data = "22/30/2017";
		//c1.data = d1;
		c1.setData(d1);
		
		
		System.out.println("Titular inicial: " + c1.getTitular());
		System.out.println("Numero inicial: " + c1.getNumero());
		System.out.println("Agencia inicial: " + c1.getAgencia());
		System.out.println("Saldo inicial: " + c1.getSaldo());
		//System.out.println("Data inicial: " + c1.data.dataCompleta());
		System.out.println("Data inicial: " + c1.getData().dataCompleta());
		
		
		c1.deposita(100.0);
		c1.saca(20);
		c1.saca(9999);
		System.out.println("\nRendimento mensal: " + c1.calculaRendimento() + "\n");
		System.out.println(c1.recuperaDadosParaImpressao());
	}
}
