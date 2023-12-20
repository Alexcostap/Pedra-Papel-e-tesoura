package Polimorfismo;

public class Mamiferos extends Animais{

	public Mamiferos(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	public int qtdMamas;
	public String mamar() {
		return "Mamando";
	}

}
