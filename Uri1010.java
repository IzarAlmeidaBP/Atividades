import java.util.Locale;
import java.util.Scanner;

public class Uri1010 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
	int CodIt ,QtdIt ,CodIt2 ,QtdIt2 ;
	double ValorIt, ValorIt2, ValorTotal ;
	
	CodIt = sc.nextInt();
	QtdIt= sc.nextInt();
	ValorIt= sc.nextDouble();
	CodIt2 = sc.nextInt();
	QtdIt2 = sc.nextInt();
	ValorIt2 = sc.nextDouble();
	
	
	ValorTotal =  (QtdIt * ValorIt) + (QtdIt2 * ValorIt2);
	
	System.out.printf("VALOR A PAGAR : %.2f%n", ValorTotal);
	
	sc.close();
	
	
	
	
	
	
	}

}
