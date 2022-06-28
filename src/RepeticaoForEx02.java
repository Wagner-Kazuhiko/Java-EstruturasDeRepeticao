import java.util.Scanner;
import java.util.Locale;
public class RepeticaoForEx02 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		for (int i = 10; i >= 0; i--) {
			System.out.println("O valor de i é: " + i);
		}
		
		sc.close();

	}

}
