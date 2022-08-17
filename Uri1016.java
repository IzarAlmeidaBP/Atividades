import java.util.Locale;
import java.util.Scanner;

public class Uri1016 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int Minutos, Distancia;
		
		Distancia = sc.nextInt();
		
		
		Minutos = Distancia * 2 ;
		
		System.out.printf("%d minutos", Minutos);
		
		sc.close();
		
		

	}

}
