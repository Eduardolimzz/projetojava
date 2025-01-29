package PropriedadesJava;

import java.util.Scanner;

public class forr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int soma = 0;
		
		
		for(int i = 0; i < x; i++) {
			int a = sc.nextInt();
			soma = soma + a;
		}
		System.out.println(soma);
		
		
		
		sc.close();
	}

}
