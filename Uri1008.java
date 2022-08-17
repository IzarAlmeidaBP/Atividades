import java.util.Locale;
import java.util.Scanner;

public class Uri1008 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	int Numero, QuantidadeH;
	float DinheiroH, Salario ;
	
	Numero = sc.nextInt();
	QuantidadeH = sc.nextInt();
	DinheiroH = sc.nextFloat();
	
	Salario = QuantidadeH * DinheiroH;
	
	System.out.println("NUMBER = "+ Numero);
	System.out.printf("Salario = %.1f%n", Salario);
	
	sc.next();
		

	}

}
