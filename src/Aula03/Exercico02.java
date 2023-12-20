package Aula03;

public class Exercico02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrayUm [] =  {12,3,4,1,9,3,10,4,32,7};
		int arrayDois [] = {2,6,3,7,3,4,5,3};
		
		if(arrayDois.length > 8) {
			System.out.println("Tamanho do ArrayDois - Maior que 8!");
		}else {
			System.out.println("Tamanho do ArrayDois menor que 8!");
		}
		System.out.println("Tamanho do ArrayUm = "+arrayUm.length);
	}

}
