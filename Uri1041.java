import java.util.Locale;
import java.util.Scanner;

public class Uri1041 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double valorX = sc.nextDouble();
		double valorY = sc.nextDouble();
		
		if(valorY > 0 && valorX <0) {
			System.out.println("Q2");}
		else if(valorY > 0 && valorX > 0) {
			System.out.println("Q1");}
		else if(valorY < 0 && valorX > 0) {
			System.out.println("Q4");}
		else if(valorY < 0 && valorX < 0) {
			System.out.println("Q3");}
		else if(valorY == 0 && valorX == 0) {
			System.out.println("Origem");}
	}

}
