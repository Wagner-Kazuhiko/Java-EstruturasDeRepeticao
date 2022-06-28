import java.util.Scanner;
import java.util.Locale;

public class RepeticaoFor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int soma = 0;
		
		for (int i = 0; i < N; i++) {
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);
		
		sc.close();

	}

}
