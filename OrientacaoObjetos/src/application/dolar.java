package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dolarr;

public class dolar {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("What is the dollar price?%n ");
		double price = sc.nextDouble();
		
		System.out.printf("How many dollars will bought? %n");
		double bought = sc.nextDouble();
		
		double x = Dolarr.paid(price, bought);
		
		System.out.printf("Amount to be paid in reais = %.2f%n", x);
		
		sc.close();

	}
}
