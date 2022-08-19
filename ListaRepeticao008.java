import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaRepeticao008 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int majority = 0;

		List<Integer> ofAge = new ArrayList<Integer>();

		for (int i = 0; i < 20; i++) {
			ofAge.add(sc.nextInt());

			if (ofAge.get(i) >= 18) {
				majority += 1;

			}
		}
		System.out.printf("%d são maiores de idades", majority);

	}

}
