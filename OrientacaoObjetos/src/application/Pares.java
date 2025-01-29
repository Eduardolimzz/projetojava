package application;

import java.util.Locale;
import java.util.Scanner;

public class Pares {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, numerospares;
		
		System.out.println("Quantos numeros voce vai digitar?");
		n = sc.nextInt();
		int[] vect = new int[n];
	
		
		for(int i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vect[i]= sc.nextInt();
		}
		System.out.println("\n numeros pares:"); 
		
		numerospares = 0;
		for(int i = 0; i < n; i++) {
			if(vect[i] % 2 ==0) {
				System.out.printf("%d ",vect[i] );
				numerospares++;
			}
		}
		
		System.out.printf("\n\n quantidade de pares = %d\n", numerospares);
		
		
		
		
		
		sc.close();

	}

}
