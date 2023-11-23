package Aula02;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner (System.in);
		System.out.println("Digite um número: ");
		double resp = entrada.nextDouble();
		if (resp < 0) {
			System.out.println("Negativo");
		}else {
			System.out.println("Positivo");
		}
	}

}
