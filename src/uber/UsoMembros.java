package uber;

public class UsoMembros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DataNascimento dt = new
		
		DataNascimento();
		
		DataNascimento dt2 = new
		
		DataNascimento();
		dt.nome = "Paulo";
		dt.dia=12;
		dt.mes = 02;
		dt.ano = 1999;
		
		dt2.nome = "Luana";
		dt2.dia = 24;
		dt2.mes = 04;
		dt2.ano = 1996;
		System.out.printf("A data de nascimento de %s "+"é %d %d %d\n",dt.nome,dt.dia,dt.mes,dt.ano);
		
		System.out.printf("A data de nascimento de %s "+"é %d %d %d\n",dt2.nome,dt2.dia,dt2.mes,dt2.ano);
	}

}
