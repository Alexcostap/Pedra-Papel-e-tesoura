package Aula03;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		int notas [] = new int[5];
		double totalNotas = 0;
		
		for (int f = 0; f < notas.length;f++) {
		System.out.println("Notas - Insira a nota no indice "+f+": ");
	    notas[f] = entrada.nextInt() ;
		}
		for (int f = 0; f < notas.length;f++) {
			totalNotas += notas[f];
		}
		System.out.println((totalNotas/notas.length));
	}

}
