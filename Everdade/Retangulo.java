package Everdade;

public class Retangulo {
	private double altura;
	private double base;
	private double area;
	private double perimetro;
	
	public Retangulo(double altura, double base) {
		this.altura=altura;
		this.base=base;
	}
	public Retangulo() {
		
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getBase() {
		return base;
	}
	public void setBase(double base) {
		this.base = base;
	}
	public double getArea() {
		return area;
	}
	public void setArea() {
		this.area = base*altura;
	}
	public double getPerimetro() {
		return perimetro;
	}
	public void setPerimetro() {
		this.perimetro = 2*(base+altura);
	}
	
	
}
