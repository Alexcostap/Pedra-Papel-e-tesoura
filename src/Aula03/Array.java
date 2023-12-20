package Aula03;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int alex [] = {1,2,3,4,5,6,7};
		for (int i = (alex.length - 1); i >= 0 ; i--) {
			System.out.print(alex[i]+" ");
		}
		System.out.println();
		for (int i = 0; i < alex.length ; i++) {
			System.out.print(alex[i]+" ");
		}
	}

}
