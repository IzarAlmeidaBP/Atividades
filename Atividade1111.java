import java.util.Scanner;

public class Atividade1111 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valor = sc.nextInt();
		int in = 0 ;
		int out = 0;
		
		for (int i = 0; i < valor; i++) {
			int numero = sc.nextInt();
				if (numero >= 10 && numero <= 20) {
					in++;
					
				}else out++;
		}
		System.out.printf("%d in\n%d out",in, out);
		

	}

}
