import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaRepeticao006 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> pPneto = new ArrayList<Integer>();

		int soma = 0;

		for (int i = 0; i < 20; i++) {
			int idade = sc.nextInt();
			soma += idade;
		}

		System.out.println(soma);
	}

}
