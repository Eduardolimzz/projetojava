package BasicoJava;

import java.util.Locale;
import java.util.Scanner;

public class EntradaDeDados3 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double x;
	
	
		x = sc.nextDouble();
	
		System.out.printf("Voce digitou : ", x);
		sc.close();
	}

}
