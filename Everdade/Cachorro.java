package Everdade;

public class Cachorro {
	public static void main(String[]args) {
		AnimaisEstimacao dog = new AnimaisEstimacao("Leandro","Cachorro", 23);
		
		System.out.printf(dog.getNome()+" eh um "+ dog.getAnimal()+" com "+dog.getIdade()+" anos");
		
	}
}
