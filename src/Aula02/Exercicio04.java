package Aula02;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero1 = n1.nextDouble();
		
		if (numero1 == 1) {
			System.out.println("Domingo");
		}else if (numero1 == 2) {
			System.out.println("Segunda");
		}else if (numero1 == 3) {
			System.out.println("Terça");
		}else if (numero1 == 4) {
			System.out.println("Quarta");
		}else if (numero1 == 5) {
			System.out.println("Quinta");
		}else if (numero1 == 6) {
			System.out.println("Sexta");
		}else if (numero1 == 7) {
			System.out.println("Sábado");
		}else {
			System.out.println("Valor invalido");
		}
	}

}
