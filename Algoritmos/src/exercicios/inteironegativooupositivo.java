package exercicios;

import java.util.Scanner;

public class inteironegativooupositivo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int x;
		x = sc.nextInt();
		
		if(x < 0) {
			System.out.println("Negativo" );
		} else {
			 
				System.out.println("Positivo") ;
		}
		sc.close();
	}

	}	
	