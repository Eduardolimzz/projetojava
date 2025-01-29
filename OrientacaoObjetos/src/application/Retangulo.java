package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Ret;

public class Retangulo {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Ret retangulo = new Ret();
		
		System.out.print("Enter rectangle width and height: ");
		System.out.println();
		retangulo.width = sc.nextDouble();
		retangulo.height = sc.nextDouble();
		
		
		
		System.out.printf("AREA = %.2f%n", retangulo.area());
		System.out.printf("PERIMETER = %.2f%n", retangulo.perimetro());
		System.out.printf("DIAGONAL = %.2f%n", retangulo.diagonal());
	
		
		sc.close();
	}

}
