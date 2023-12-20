package Transporte;

public class Veiculos {
	public String nome;
	public int qtdPassageiro;
	public String locomover() {
		return "Locomovem-se";
	}
	
	public Veiculos(String nome, int qtdpassageiro) {
		this.nome = nome;
		this.qtdPassageiro = qtdpassageiro;
	}
}
