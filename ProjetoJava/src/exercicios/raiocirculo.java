package exercicios;

import java.util.Locale;
import java.util.Scanner;

public class raiocirculo {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double raio, area;
		double pi = 3.14159;
		
		
		raio = sc.nextDouble();
		
		
		area = pi * raio * raio;
		
		System.out.printf("O valor da area e: %.4f %n", area);
		
		
		sc.close();
	}

}
