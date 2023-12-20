package Aula03;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		
		// Array's;
		int a [] = new int [3];
		int b [] = new int [3];
		int c [] = new int [3];
		int d [] = new int [3];
		
		for (int z = 0;z < a.length;z++) {
			
			System.out.println("Array A - Insira o valor no indice "+z+": ");
			a[z] = entrada.nextInt() ;
		}
		for (int z = 0;z < a.length;z++) {
			
			System.out.println("Array B - Insira o valor no indice "+z+": ");
			b[z] = entrada.nextInt() ;
		}
		for (int z = 0;z < a.length;z++) {
			
			System.out.println("Array C - Insira o valor no indice "+z+": ");
			c[z] = entrada.nextInt() ;
		}
		for (int z = 0;z < a.length;z++) {
			
			System.out.println("Array D - Insira o valor no indice "+z+": ");
			d[z] = entrada.nextInt() ;
		}
		
		
		System.out.println("Array A");
		for (int z = 0;z < a.length;z++) {
			System.out.print((a[z])+"-");
		}
		
		System.out.println();
		System.out.println("Array B");
		for (int z = 0;z < b.length;z++) {
			System.out.print((b[z])+"-");
		}
		System.out.println();
		System.out.println("Array C");
		for (int z = 0;z < c.length;z++) {
			System.out.print((c[z])+"-");
		}
		System.out.println();
		System.out.println("Array D");
		for (int z = 0;z < d.length;z++) {
			System.out.print(+(d[z])+"-");
		}
		
	}

}
