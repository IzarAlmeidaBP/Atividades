import java.util.Locale;
import java.util.Scanner;

public class Uri1006 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B , C , Media ;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		C = sc.nextDouble();
		Media = (A +B +C) /3;
		
		System.out.printf("Media=%.1d%n", Media);
		
		sc.close();

	}

}
