package Aula02;
import java.util.Scanner;
public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner n1 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero1 = n1.nextDouble();
		Scanner n2 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero2= n2.nextDouble();
		Scanner n3 = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		double numero3= n3.nextDouble();
		
		if (numero1 > numero2 && numero1 > numero3) {
				System.out.println("Numero maior = "+numero1);
		}else if(numero2 > numero1 && numero2 > numero3) {
				System.out.println("Numero maior = "+numero2);
		}else if(numero3 > numero1 && numero3 > numero2) {
				System.out.println("Numero maior = "+numero3);
		}
	}

}
