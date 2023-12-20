package Polimorfismo;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		biu metodos = new biu();
		double soma = metodos.somar(4,8);
		System.out.println(soma);
		
		
		double multiplicar = metodos.multiplicar(3, 9);
		System.out.println(multiplicar);
		
		double subtrair = metodos.subtrair(4,1);
		System.out.println(subtrair);
		
		double dividir = metodos.dividir(4, 2);
		System.out.println(dividir);
	}

}
