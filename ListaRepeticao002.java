import java.util.ArrayList;
import java.util.List;

public class ListaRepeticao002 {

	public static void main(String[] args) {
		List<Integer> duro = new ArrayList<Integer>();

		for (int i = 1; i < 16; i++) {
			duro.add(i);
		}

		int aI = duro.get(0);
		int aN = duro.get(14);
		int n = duro.size();
		int soma = n * (aI + aN) / 2;
		System.out.println(soma);

	}
}
