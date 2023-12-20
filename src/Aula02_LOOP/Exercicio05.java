package Aula02_LOOP;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int y = 0;y < 100; y = y + 2) {
			if (y <= 49){
				System.out.print(y+"_");
			}else {
				System.out.print("_");
			}
		}
	}

}
