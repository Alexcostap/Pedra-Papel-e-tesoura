package Aula03;
import java.util.Scanner;
public class Exercicio07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		
		double a [] = new double [5];
		
		for (int z = 0;z < a.length;z++) {
			
			System.out.println("Array A - Insira o valor no indice "+z+": ");
			a[z] = entrada.nextInt() ;
		}
		// Multiplicado 2x
		double b []= new double [5];
		for (int z = 0;z < b.length;z++) {
			b [z] = (a[z] * 2);
		}
		
		double c [] = new double [5];
		for (int p = 0;p < c.length; p++) {
			c[p] = (b[p] + a[p]);
		}
		System.out.println(c[1]);
	}

}
