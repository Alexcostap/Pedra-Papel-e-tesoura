package Aula02_LOOP;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira um número");
		double pergunta = entrada.nextDouble();
		
		if (pergunta %2==0) {
			pergunta= pergunta/2;
			
		}else {
			pergunta = 3 * pergunta + 1;
		}
		System.out.println(pergunta);
	}

}
