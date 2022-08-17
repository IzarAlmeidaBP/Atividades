import java.util.Scanner;

public class Uri1035 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int valorA = sc.nextInt();
		int valorB = sc.nextInt();
		int valorC = sc.nextInt();
		int valorD = sc.nextInt();
		
		int somaAB = valorA + valorB;
		int somaCD = valorC + valorD;
		
		if (valorB > valorC && valorD > valorA && somaCD > somaAB && valorC > 0 && valorD > 0) {
			System.out.printf("Valores aceitos");
		}
			else {System.out.printf("Valores nao aceitos");}
		sc.close();
		
			

	}

}
