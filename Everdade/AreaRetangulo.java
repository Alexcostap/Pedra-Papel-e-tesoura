package Everdade;

public class AreaRetangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Retangulo area = new Retangulo();
		area.setAltura(5);
		area.setBase(3);
		area.setArea();
		double a1 = area.getArea();
		System.out.print(a1);	
	}
}