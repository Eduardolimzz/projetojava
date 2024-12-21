package exercicios;

import java.util.Scanner;

public class soma {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x, y,soma;
		
	
		x = sc.nextInt();
		y = sc.nextInt();
		
		soma = x + y;
		
		System.out.printf("A soma dos numeros e " + soma);
		
		sc.close();

	}

}
