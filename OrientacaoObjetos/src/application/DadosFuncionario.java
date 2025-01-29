package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Dados;

public class DadosFuncionario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Dados dados = new Dados();

		System.out.print("Name: ");
		System.out.println();
		dados.name = sc.nextLine();
		System.out.print("Gross salary:");
		System.out.println();
		dados.grosssalary = sc.nextDouble();
		System.out.print("Tax: ");
		System.out.println();
		dados.tax = sc.nextDouble();

		System.out.println();
		System.out.println("Employee: " + dados);
		System.out.println();
		System.out.print("Wich percentage to increase salary? ");
		double percentage = sc.nextDouble();
		dados.increasesalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + dados);

		sc.close();

	}

}
