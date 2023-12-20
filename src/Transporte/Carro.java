package Transporte;

public class Carro extends motorizado{

	public Carro(String nome, int qtdpassageiro) {
		super(nome, qtdpassageiro);
		// TODO Auto-generated constructor stub
	}
	public int qtdPortas;
	public String drift() {
		return "fazendo Drift";
	}
}
