package uber;
import java.util.Date;
public class Escola {

	public static void main(String[] args) {
		Aluno i = new Aluno("Jose wellington","123-.123.123-34",new Date());
		System.out.println("Veja como os atributos foram preenchidos \n\nNome: "+i.nome);
		System.out.println("CPF: "+ i.cpf);
		System.out.println("Data Nascimento: "+ i.data_nascimento.toString());
	}

}
