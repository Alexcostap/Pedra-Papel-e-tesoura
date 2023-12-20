package Aula02_LOOP;

public class Exercicio06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int x = 0; x< 100;x++) {
			if(x > 50 && x < 60) {
				continue;
			}
			System.out.println(x);
		}
	}

}
