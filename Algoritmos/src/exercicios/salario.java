package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class salario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int num, numhrs;
		double salario, vph; 
		
		num = sc.nextInt();
		numhrs = sc.nextInt();
		vph = sc.nextDouble();
		
		salario = numhrs * vph;
		
		System.out.println("Numero = " + num);
		System.out.printf("salario = %.2f", salario);
		
		sc.close();
	}

}
