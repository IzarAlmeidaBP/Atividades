import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double valorA = sc.nextDouble();
		double valorB = sc.nextDouble();
		double valorC = sc.nextDouble();

		if (valorA >= valorB + valorC) {
			System.out.println("NAO FORMA TRIANGULO");
		}
		if (Math.pow(valorA, 2) == Math.pow(valorB, 2) + Math.pow(valorC, 2)) {
			System.out.println("TRIANGULO RETANGULO");

		}
		if (Math.pow(valorA, 2) > Math.pow(valorB, 2) + Math.pow(valorC, 2)) {
			System.out.println("TRIANGULO OBTUSANGULO");
		}
		if (Math.pow(valorA, 2) < Math.pow(valorB, 2) + Math.pow(valorC, 2)) {
			System.out.println("TRIANGULO ACUTANGULO");
		}
		if (valorA == valorB && valorA == valorC) {
			System.out.println("TRIANGULO EQUILATERO");
		}
		if (valorA != valorB && valorA != valorC && valorB != valorC) {
			System.out.println("TRIANGULO ISOSCELES");
		}
		sc.close();
	}
}
