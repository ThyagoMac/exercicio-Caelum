package br.com.caelum.contas.modelo;

public class Data {
	public int dia;
	public int mes;
	public int ano;

	public String dataCompleta(){
		String dataCompleta;
		dataCompleta = this.dia +"/"+ this.mes +"/"+ this.ano;
		return dataCompleta;
	}
}
