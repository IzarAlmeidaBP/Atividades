import java.util.Locale;
import java.util.Scanner;

public class Uri1005 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double A, B, Media ;
		
		A = sc.nextDouble();
		B = sc.nextDouble();
		Media = ((A*3.5) + (B*7.5)) / 11 ;
		
		System.out.printf("Media=%.5f%n", Media);
		
		sc.close();

	}

}
