import java.util.Scanner;

public class Uri1019 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int tempo = sc.nextInt();
		int segundos, minutos, horas;
		
		horas = tempo / 3600;

		
		minutos = tempo %3600/60 ;

		
		segundos = tempo % 60 ;
		
		System.out.printf("%d:%d:%d",horas, minutos ,segundos);
		
		sc.close();
		
		
		
		
		
		
		
		

	}

}
