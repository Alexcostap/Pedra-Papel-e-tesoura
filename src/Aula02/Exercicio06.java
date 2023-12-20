package Aula02;

import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner letra = new Scanner(System.in);
		System.out.println("Insira uma letra: ");
		char resposta = letra.next().charAt(0);
		
		if (resposta == 'm') {
			System.out.println("Masculino");
		}else if(resposta == 'f') {
			System.out.println("Feminino");
		}
	}

}
