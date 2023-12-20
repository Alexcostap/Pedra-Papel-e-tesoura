package Aula04;
import java.util.StringTokenizer;
public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Hello";
		String resultado = str.replace("l", "w");
		
		System.out.println(resultado);
		String str2 = "Hello World";
		String resultado2 = str2.substring(3,8);
		
		System.out.println(resultado2);
		
		String str3 = "Hello World";
		String resultado3 = str3.toUpperCase();
		
		System.out.println(resultado3);
		
		String str4 = "Hello World";
		String resultado4 = str4.toLowerCase();
		char c = str4.charAt(2);
		System.out.println(resultado4);
		System.out.println(resultado = str4.trim());
		System.out.println(c);
		
		String palavra1 = "Hello";
		String palavra2 = "hellO";
		
		Boolean b1 = palavra1.equals(palavra2);
		Boolean b2 = palavra1.equalsIgnoreCase(palavra2);
		
		System.out.println(b1);
		System.out.println(b2);
		
		String oi = "Hello world world2";
		int pos = str.lastIndexOf("l");
		System.out.println(pos);
		
		String valor = "CDD4.0 - Java";
		System.out.println(valor.compareTo("CDD4.0 - Java")== 0 ? true : false);
		System.out.println(valor.compareTo("CDD4.0 - JAVA")== 0 ? true : false);
		System.out.println(valor.compareToIgnoreCase("CDD4.0 - JAVA")== 0 ? true : false);
		
		System.out.println(valor.endsWith("Java"));
		System.out.println(valor.startsWith("c"));
		System.out.println(valor.startsWith("DD",1));
		
		StringTokenizer exemplo = new StringTokenizer("O mundo não é mias o mesmo mas não inremos desistir nunca") ;
		System.out.println(exemplo.countTokens());



	}

}
