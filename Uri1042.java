import java.util.Scanner;
import java.util.Arrays;

public class Uri1042 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[3];
		int array1[] = new int[3];

		for (int i = 0; i < 3; i++) {
			array[i] = sc.nextInt();
			array1[i] = array[i];

		}
		Arrays.sort(array);
		for (int i = 0; i < 3; i++) {
			System.out.println(array[i]);
		}
		for (int i = 0; i < 3; i++) {
			System.out.println(array1[i]);
		}
		sc.close();

	}

}
