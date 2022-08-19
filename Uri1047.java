import java.util.Scanner;

public class Uri1047 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int array[] = new int[4];
		for (int i = 0; i < array.length; i++) {
			array[i] = sc.nextInt();

		}
		int horaInicial = array[0];
		int minutoInicial = array[1];
		int minutoFinal = array[3];
		int horaFinal = array[2];

		if (horaFinal > horaInicial && minutoFinal > minutoInicial) {
			int totalHoras = horaFinal - horaInicial;
			int totalMinutos = minutoFinal - minutoInicial;
			
		}

	}
	System.out.printf("O JOGO DUROU %d HORA(S) E %d MINUTO(S)", totalHoras, totalMinutos);
}
