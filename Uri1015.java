import java.util.Locale;
import java.util.Scanner;

public class Uri1015 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	double X1, Y1, X2, Y2, Resultado ;
	
	X1 = sc.nextDouble();
	Y1 = sc.nextDouble();
	X2 = sc.nextDouble();
	Y2 = sc.nextDouble();
	
	Resultado = Math.sqrt( Math.pow((X2 - X1),2) + Math.pow((Y2-Y1),2)); 
	
	
		

		System.out.printf("%.4f",Resultado);
		
		sc.close();
		
	}

}
