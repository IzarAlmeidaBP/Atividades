import java.util.Locale;
import java.util.Scanner;

public class Uri1040 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double nota1 = sc.nextDouble();
		double nota2 = sc.nextDouble();
		double nota3 = sc.nextDouble();
		double nota4 = sc.nextDouble();

		double mediaTotal = ((nota1 * 2) + (nota2 * 3) + (nota3 * 4) + (nota4)) / 10;

		if (mediaTotal >= 7.00) {
			System.out.printf("Media:%.1f \nAluno Aprovado.", mediaTotal);
		} else if (mediaTotal < 5.0) {
			System.out.printf("Media: %.1f \nAluno Reprovado.", mediaTotal);
		} else if (mediaTotal >= 5.0 &&  mediaTotal < 7.0) {
			System.out.printf("%.1f \nAluno em exame.", mediaTotal);
			double notaExame = sc.nextDouble();

			System.out.printf("%.1f \nNota do exame:", notaExame);

			double mediaFinal = (notaExame + mediaTotal) / 2;
			if (mediaFinal >= 5.0) {
				System.out.printf("Aluno aprovado. \nMedia Final : %.1f", mediaFinal);
			} else {
				System.out.printf("Aluno Reprovado. \nMedia Final : %.1f", mediaFinal);
			}
		}

	}

}
