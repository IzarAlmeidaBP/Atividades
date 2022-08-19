import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Uri1045 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double array[] = new double[3];
		double array1[] = new double[3];
		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
			array1[i] = array[i];
			
		

		} 
		Arrays.sort(array1);
		//if (array[2] < array[1] + array[0]
		if (array1[2] < array1[1] + array1[0]) {
			
			if (Math.pow(array[2], 2) == Math.pow(array[1], 2) + Math.pow(array[0], 2)) {
				System.out.println("TRIANGULO RETANGULO");
			} else if (Math.pow(array[2], 2) > Math.pow(array[1], 2) + Math.pow(array[0], 2)) {
				System.out.println("TRIANGULO OBTUSANGULO");
			} else if (Math.pow(array[2], 2) < Math.pow(array[1], 2) + Math.pow(array[0], 2)) {
				System.out.println("TRIANGULO ACUTANGULO");
			}
			if (array[2] == array[1] && array[2] == array[0]) {
				System.out.println("TRIANGULO EQUILATERO");
			} else if (array[2] == array[1] || array[2] == array[0] || array[1] == array[0]) {
				System.out.println("TRIANGULO ISOSCELES");
			}

		} else {
			System.out.println("NAO FORMA TRIANGULO");
		}sc.close();
	} 
}
