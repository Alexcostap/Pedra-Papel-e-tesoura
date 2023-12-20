package Aula02_LOOP;

public class Exercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador = 0;
		for(int x = 1; x < 101;x++) {
			
			if (x %3 == 0) {
				System.out.println(x);
				contador +=1;
			}
			
		}
		System.out.println(contador+" foi quantidade de multiplos de 3");
	}

}
