import java.util.Scanner;

public class AaaFOR {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int numero = sc.nextInt();
		int soma = 0;
		for (int i = 0; i < numero; i++) {
			//Primeiro:(Inicio) só executa na primeira vez
			//Segundo :(Condição) se for verdadeirro irá ficar executando, se for falso irá parar de execultar.
			//Terceiro: (Incremento) executa toda vez que for verdadeiro.
			int x = sc.nextInt();
			soma = soma + x;

		}
		System.out.println(soma);

		sc.close();

	}

}
