package POOJava;

public class Carro {
	 String cor;
	double preco;
	String modelo;
	
	public Carro() {
		
	}
	public Carro (String modelo, double preco) {
		//Se for escolhido o construtor sem a Cor do veiculo
		//definimos a cor padrçao como sendo preta
		this.cor = "Preta";
		this.modelo = modelo;
		this.preco = preco;
	}
	//contrutor com 3 parâmetros
	public Carro (String cor,String modelo, double preco) {
		
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
	
}
