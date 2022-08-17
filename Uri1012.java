import java.util.Locale;
import java.util.Scanner;

public class Uri1012 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double Base, Altura, Altura2, Comprimento, AreaTri, AreaCirculo, AreaTrap, AreaQuad, AreaRetan ;
		
		Base = sc.nextFloat();
		Altura = sc.nextFloat();
		Comprimento = sc.nextFloat();
		
			AreaTri = (Base * Comprimento) /2 ;
			Altura2 = Math.pow(Comprimento, 2);
			AreaCirculo = Altura2 * 3.14159 ;
			AreaTrap = ((Base + Altura) * Comprimento) / 2;
			AreaQuad = Math.pow(Altura, 2);
			AreaRetan = Base * Altura;
			
				System.out.printf("Triangulo : %.3f%n", AreaTri);
				System.out.printf("Circulo : %.3f%n", AreaCirculo);
				System.out.printf("Trapezio : %.3f%n", AreaTrap);
				System.out.printf("Quadrado : %.3f%n", AreaQuad);
				System.out.printf("Reatangulo : %.3f%n", AreaRetan);
				
		sc.close();
				
				
			
			
		
				
	}

}
