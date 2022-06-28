import java.util.Locale;
import java.util.Scanner;


public class RepeticaoForEx04 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x = 0;
		for (int i = 1; i < 1000; i = i + 2) {
			System.out.println(i);
		}
		
		sc.close();

	}

}
