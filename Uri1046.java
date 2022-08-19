import java.util.Scanner;

public class Uri1046 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int hora = 0;
		int array[] = new int[2];
		for (int i = 0; i < 2; i++) {
			array[i] = sc.nextInt();
		}
		if (array[0] < array[1]) {
			hora = array[1] - array[0];
		} else {
			hora = (24 - array[0] + array[1]);
		}
		System.out.printf("O JOGO DUROU %d HORAS(S)", hora);

		sc.close();
	}

}
