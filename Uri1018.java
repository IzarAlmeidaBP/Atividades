import java.util.Scanner;

public class Uri1018 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		int notas[]= {100,50,20,10,5,2,1};
		
		int valor = sc.nextInt();
		
		for(int i = 0;i < notas.length; i++) { 
			int conta = valor/notas[i];
			System.out.printf("\n%d nota(s) de R$ %d", conta, notas[i]);
			valor = valor %notas[i];
			
		}
		
	
		
		
		
		
		
		
	}

}
