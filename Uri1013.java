import java.util.Locale;
import java.util.Scanner;

public class Uri1013 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Locale.setDefault(Locale.US);

		int ValorA, ValorB, ValorC;

		ValorA = sc.nextInt();
		ValorB = sc.nextInt();
		ValorC = sc.nextInt();

		if (ValorA > ValorB && ValorA > ValorC) {
			System.out.printf("O maior numero %d" , ValorA);

		} else if (ValorB > ValorC) {
			System.out.printf("O maior numero %d" , ValorB);
		} else {
			System.out.printf("O maior numero %d", ValorC);

		}
		sc.close();

	}
}
