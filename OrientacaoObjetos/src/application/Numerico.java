package application;

import java.util.Locale;

import java.util.Scanner;

import entities.Numericos;

public class Numerico {
	public static void main(String[] args) {
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter radius: ");
	double radius = sc.nextDouble();
	
	double c = Numericos.circumference(radius);
	
	double v = Numericos.volume(radius);
	
	System.out.printf("Circumference: %.2f%n", c);
	System.out.printf("Volume: %.2f%n", v);
	System.out.printf("PI value: %.2f%n", Numericos.PI);
	
	
	sc.close();
	
	}
}
