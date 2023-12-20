package Encapsulamento;

public class RH {
	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.Nome ="Maria";
		f1.ajustarcpf("1234567853");
		System.out.println(f1.mostrarCPF());
		
	}
	

}
