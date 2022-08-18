import java.util.Scanner;

public class AaaIFeELSE {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double horario = sc.nextDouble();

		if (horario >= 6 && horario < 12) {
			System.out.println("Está de manhã!");
		} else if (horario >= 12 && horario < 18) {
			System.out.println("Está de Tarde!");
		} else if (horario >= 18 && horario < 24) {
			System.out.println("Está de Noite!");
		} else if (horario >= 24 && horario < 6) {
			System.out.println("Já é Madrugada!");
		}
		sc.close();
	}

}
