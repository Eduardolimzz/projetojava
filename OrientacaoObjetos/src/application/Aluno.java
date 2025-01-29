package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Faculdade;

public class Aluno {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Faculdade faculdade = new Faculdade();

		System.out.print("Name: ");
		faculdade.name = sc.nextLine();
		System.out.println();
		System.out.print("Digite as suas três notas da materia e saiba sua media: ");
		System.out.println();
		faculdade.nota1 = sc.nextDouble();
		faculdade.nota2 = sc.nextDouble();
		faculdade.nota3 = sc.nextDouble();

		System.out.printf("FINAL GRADE: %.2f%n", faculdade.FinalGrade());
		if (faculdade.FinalGrade() < 18.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", faculdade.QuantoFalta());
		} else {
			System.out.println("PASS");
		}

		sc.close();

	}

}
