import java.util.Locale;
import java.util.Scanner;

public class Uri1014 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Distancia ;
		float TotalDeCombu, Kilometragem;
		
		Distancia = sc.nextInt();
		TotalDeCombu = sc.nextFloat();
		
		
		Kilometragem = Distancia / TotalDeCombu;
		
		System.out.printf("%.3f Km/l", Kilometragem);
		
		sc.close();
		

	}

}
