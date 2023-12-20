package Encapsulamento;

public class Funcionario {
	String Nome,endereco;
	private String CPF,RG,Telefone,Email;
	private double Salario;
	private int qtdFilhos;
	
	public void ajustarcpf(String cpf) {
		this.CPF = cpf;
	}
	public String mostrarCPF() {
		return this.CPF;
	}
	
	public void ajustarRG(String RG) {
		this.RG = RG;
	}
	public String mostrarRG() {
		return this.RG;
	}
	
	public void ajustarTelefone(String Telefone) {
		this.RG = RG;
	}
	public String mostrarTelefone() {
		return this.RG;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getRG() {
		return RG;
	}
	public void setRG(String rG) {
		RG = rG;
	}
	public String getTelefone() {
		return Telefone;
	}
	public void setTelefone(String telefone) {
		Telefone = telefone;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public double getSalario() {
		return Salario;
	}
	public void setSalario(double salario) {
		Salario = salario;
	}
	public int getQtdFilhos() {
		return qtdFilhos;
	}
	public void setQtdFilhos(int qtdFilhos) {
		this.qtdFilhos = qtdFilhos;
	}
	
}
