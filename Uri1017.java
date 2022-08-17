import java.util.Locale;
import java.util.Scanner;

public class Uri1017 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int  Tempo, VelocidadeM;
		
		float QuantidadeL ;
		
		Tempo = sc.nextInt();
		
		VelocidadeM = sc.nextInt();
		
		QuantidadeL = (Tempo* VelocidadeM)/12;
		
		System.out.printf("%.3f", QuantidadeL);
		sc.close();
		
		
		
		
		
		
		
		

	}

}
