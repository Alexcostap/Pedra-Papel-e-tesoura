package Aula02;

import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner pgt1 = new Scanner(System.in);
		System.out.println("1- Sim | 2 - Não ");
		double pergunta1 = pgt1.nextDouble();
		
		Scanner pgt2 = new Scanner(System.in);
		System.out.println("1- Sim | 2 - Não ");
		double pergunta2= pgt2.nextDouble();
		
		Scanner pgt3 = new Scanner(System.in);
		System.out.println("1- Sim | 2 - Não ");
		double pergunta3 = pgt3.nextDouble();
		
		Scanner pgt4 = new Scanner(System.in);
		System.out.println("1- Sim | 2 - Não ");
		double pergunta4 = pgt4.nextDouble();
		
		Scanner pgt5 = new Scanner(System.in);
		System.out.println("1- Sim | 2 - Não ");
		double pergunta5= pgt5.nextDouble();
		
		int contador = 0;
		if (pergunta1 == 1) {
			contador = contador + 1;
		}
		if (pergunta2 == 1) {
			contador = contador + 1;
		}
		if (pergunta3 == 1) {
			contador = contador + 1;
		}
		if (pergunta4 == 1) {
			contador = contador + 1;
		}
		if (pergunta5 == 1) {
			contador = contador + 1;
		}
		if (contador == 5) {
			System.out.println("Assassino");
		}else if (contador == 4 || contador == 3) {
			System.out.println("Cúmplice");
		}else if (contador == 2) {
			System.out.println("Suspeito");
		}else {
			System.out.println("Inocente");
		}
		
	}

}
