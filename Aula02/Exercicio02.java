package Aula02;
import java.util.Scanner;
public class Exercicio02 {
	public static void main (String[] args) {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Digite um número");
		double resp = entrada.nextDouble();
		
		System.out.println(resp == 0 ? "Valor Nulo":resp > 0 ? "Positivo":"Negativo");
		
		
	}
}
