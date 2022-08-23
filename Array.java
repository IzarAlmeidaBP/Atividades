import java.util.Locale;
import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int valorA = sc.nextInt();
		
		double[] array = new double[valorA];
		double soma = 0;
		for (int i = 0; i < valorA; i++) {
			array[i] = sc.nextDouble();
			 soma += array[i];
		}
		System.out.println("Valor da media = "+soma);
	}

}
