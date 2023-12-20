package Aula02_LOOP;

public class Exercicio12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int valorMulti3 = 0;
		int valorMulti5 = 0;
		for (int x = 0;x <=20;x++ ) {
			if (x%3==0) {
				valorMulti3 = valorMulti3 + x;
			}
			if (x%5==0) {
				valorMulti5 = valorMulti5 + x;
			}
		}
		int valorTotal = valorMulti3+valorMulti5 ;
		System.out.println("A soma dos multiplos de 3 é: "+valorMulti3);
		System.out.println("A soma dos multiplos de 5 é: "+valorMulti5);
		System.out.println("A soma dos multiplos de 3 e 5 é: "+valorTotal);
	}

}
