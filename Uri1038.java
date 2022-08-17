import java.util.Locale;
import java.util.Scanner;

public class Uri1038 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int pedido = sc.nextInt();
		int quantidadePe = sc.nextInt();
		
		if (pedido == 1) { System.out.printf("Total : R$ %.2f ",quantidadePe * 4);
		}
		else if (pedido == 2) {System.out.printf("Total : R$ %.2f ",quantidadePe * 4.50);
		}
		else if (pedido == 3) {System.out.printf("Total : R$ %.2f " ,quantidadePe * 5.00);
		}
		else if (pedido == 4) {System.out.printf("Total : R$ %.2f " ,quantidadePe * 2.00);
		}
		else if (pedido == 5) {System.out.printf("Total : R$ %.2f " ,quantidadePe * 1.50);
		}	
		sc.close();
	
		

	}

}
