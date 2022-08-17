import java.util.Locale;
import java.util.Scanner;

public class Uri1011 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
	
		double Pi = 3.14159, Volume, Raio  ;
		 
		
		Raio = sc.nextInt();
		/* * Raio3 = Math.pow(Raio, 3); //Elevado ao Quadrado
*/	//	Nn = Math.sqrt(Raio3); Raiz Quadrada
//		Nn = Math.PI; Pi 
		 
		
		Volume = (4/3.0) * Pi * Math.pow(Raio, 3) ;
		
		System.out.printf("Volume = %.3f%n", Volume);
		
		sc.close();
		
		
		
		
		

	}

}
