import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListaRepeticao009 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String newestName = "" ;
		int lastAge = 1000;
		
		for (int i = 0; i < 2; i++) {
			String name = sc.nextLine();
			int age = Integer.parseInt(sc.nextLine()) ;
			if (lastAge > age) {
				lastAge = age;
				newestName = name;
			}}
			System.out.println("o mais novo é "+newestName+" , ele possui "+  lastAge);
			
			
			
			
		
	}

}
