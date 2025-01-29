package exercicios;

import java.util.Scanner;

public class denominador {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for(int i = 0; i < n; i++) {
			double x = sc.nextInt();
			double y = sc.nextInt();
		
			if (y == 0) {
				System.out.println("divisao impossivel");
			}
			else {
				double div = (double) x / y;
				System.out.printf("%.1f%n", div);
		}
		}
	

		sc.close();
	}

}
