package Aula02_LOOP;
import java.util.Scanner;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);
		System.out.println("Insira a quantidade de alunos:  ");
		double quantidadeAlunos = entrada.nextDouble();
		
		int x = 1;
		while (x <= quantidadeAlunos){
			System.out.println("Insira a nota do aluno:  ");
			double nota = entrada.nextDouble();
			
			System.out.println(nota);
			x = x + 1;
		}
			
	}

}
