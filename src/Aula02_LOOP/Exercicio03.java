package Aula02_LOOP;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x = 1;
		while (x <=100) {
			if (x %2 == 0){
				System.out.print(x+"-");
			}
			x = x + 1;
		}
		System.out.println(" ");
		int y = 1;
		while (y <=100) {
			if (y %2 == 1){
				System.out.print(y+"-");
			}
			y = y + 1;
		}
	}

}
