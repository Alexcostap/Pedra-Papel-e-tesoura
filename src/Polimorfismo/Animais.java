package Polimorfismo;

public class Animais {
	public String nome;
	public String reproduzir() {
		return "Reproduziu-se";
	}
	
	public String respirar() {
		return "Respirando";
	}
	public Animais(String nome) {
		this.nome = nome;
	}

}
