package Polimorfismo;

public class Aves extends Animais{

	public Aves(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	public int qtdDeOvos;
	public String porOvo() {
		return "esta colocando ovo";
	}
}
