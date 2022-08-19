import java.util.Scanner;

public class ListaRepeticao007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double media = 0 ;
		
		for(int i = 0; i < 20; i++) {
			int idade = sc.nextInt();
			 media += idade;
			
		}
		double mediaTotal = media/20;
		System.out.println(mediaTotal);
	}

}
