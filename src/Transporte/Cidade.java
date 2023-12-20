package Transporte;

public class Cidade {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carro a = new Carro("Porsche",2);
		a.tipoDeMotor = "Combustão-Gasolina";
		a.modelo = "911";
		a.qtdPortas = 3;
		
		System.out.println("Informações do Carro: "+a.nome);
		System.out.println("Quantidade de passageiros: "+a.qtdPassageiro );
		System.out.println("Modelo: "+ a.modelo);
		System.out.println("Tipo de motor: "+ a.tipoDeMotor);
		System.out.println("Quantidade de portas: "+ a.qtdPortas);
		System.out.println("A "+a.nome+" esta fazendo "+a.drift());
		
		carroca boi = new carroca("Bandido",1);
		System.out.println(boi.nome+" "+boi.animal());
	}

}
