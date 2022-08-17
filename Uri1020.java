import java.util.Scanner;

public class Uri1020 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int totalDias, ano, mes, dia;
		
		totalDias = sc.nextInt();
		
		ano = totalDias/365;
		
		mes =  (totalDias % 365)/30;
		
		dia = (totalDias % 365)%30; 
		
		System.out.printf("%dano(s)\n%dmes(es)\n%ddia(s)",ano,mes,dia);

		sc.close();
	}

}
