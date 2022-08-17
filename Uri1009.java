import java.util.Locale;
import java.util.Scanner;

public class Uri1009 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		String Nome;
		double Salario, Montante, Comissao;
		
		Nome = sc.next();
		
		Salario = sc.nextDouble();
		Montante = sc.nextDouble();
		
		Comissao = Salario + (Montante * 0.15);
		
		
		
		System.out.printf("Total = R$ %.2f%n", Comissao);
		
		sc.next();
		
		
		
		

	}

}
