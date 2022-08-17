import java.util.Locale;
import java.util.Scanner;

public class Uri1036 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();

		double contaDelta = (Math.pow(valorB, 2)) - (4 * valorA * valorC);

		if (contaDelta <= 0) {
			System.out.printf("Impossivel calcular");
		} else {
			double resultado1 = (-valorB + (Math.sqrt(contaDelta))) / 2 * valorA;
			double resultado2 = (-valorB - (Math.sqrt(contaDelta))) / 2 * valorA;
			System.out.printf("R1 = %.5f \nR2 = %.5f", resultado1, resultado2);

		}
		sc.close();

	}

}
