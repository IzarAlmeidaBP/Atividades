import java.util.Scanner;

public class Uri1007 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A, B, C, D, AB, CD, Diferenca;
		
		A = sc.nextInt();
		B = sc.nextInt();
		C = sc.nextInt();
		D = sc.nextInt();
		AB = A* B;
		CD = C* D;
		Diferenca = AB - CD;
		
		System.out.println("Diferenca = "+ Diferenca);
		sc.close();
		
	}

}
