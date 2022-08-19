import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaRepeticao005 {

	public static void main(String[] args) {
		int soma = 0;
		Scanner sc = new Scanner(System.in);
		List<Integer> izaruDuro = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {
			int numero = sc.nextInt();
			soma += numero;
		}
		System.out.println(soma);

		sc.close();
	}

}
