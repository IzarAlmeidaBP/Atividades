import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Uri1043 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double array[] = new double[3];

		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextDouble();
		}

		if (array[0] < array[1] + array[2] && array[1] < array[0] + array[2] && array[2] < array[1] + array[0]) {
			// A < B + C e B < A + C e C < A + B).
			double perimetro = array[1] + array[2] + array[0];
			System.out.printf("Perimetro = %.1f", perimetro);

		} else {
			double area = (array[0] + array[1]) * array[2] / 2;
			System.out.printf("Area = %.1f", area);

		}

	}

}
