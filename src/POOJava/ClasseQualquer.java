package POOJava;

public class ClasseQualquer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JavaMetodos pessoa = new JavaMetodos();
		int idade = pessoa.idade();
		double dinheiro =  pessoa.valor();
		String nomeCompleto = pessoa.nome();
		boolean status = pessoa.estado();
		System.out.println(idade+" "+dinheiro+" "+nomeCompleto+" "+status);
	}

}
