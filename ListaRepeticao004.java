import java.util.Scanner;

public class ListaRepeticao004 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nomeUsuario = sc.next();
		int repeticao = sc.nextInt();

		for (int i = 0; i < repeticao; i++) {
			System.out.println(nomeUsuario);
		}
		sc.close();
	}

}
