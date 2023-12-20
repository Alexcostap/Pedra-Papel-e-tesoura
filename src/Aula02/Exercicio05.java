package Aula02;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero1 = n1.nextDouble();
		Scanner n2 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero2= n2.nextDouble();
		
		double resultado = ((numero1+numero2)/2);
		
		if (resultado >= 7) {
			System.out.println("Aprovado com nota: "+resultado);
		}else if (resultado < 7) {
			if (resultado >= 4)
				System.out.println("Recuperação com nota: "+resultado);
			}else {
				System.out.println("Reprovado com nota: "+resultado);
			}
		
		System.out.println(resultado);
	}

}
