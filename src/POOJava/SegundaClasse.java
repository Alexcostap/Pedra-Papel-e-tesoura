package POOJava;

public class SegundaClasse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassePessoa aluno01 = new ClassePessoa();
		ClassePessoa aluno02 = new ClassePessoa();
		aluno01.nome ="Wellington";
		aluno02.nome ="Felipe";

		System.out.println(aluno01.nome);
		System.out.println(aluno02.nome);

		aluno01.comer();
	}

}
