package exercicios;

import java.util.Scanner;
import java.util.Locale;

public class pecas {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigop1,numerop1,codigop2, numerop2;
		double  v1, v2, valortotal;
		
		codigop1 = sc.nextInt();
		numerop1 = sc.nextInt();
		v1 = sc.nextDouble();
		codigop2 = sc.nextInt();
		numerop2 = sc.nextInt();
		v2 = sc.nextDouble();
		
		valortotal = numerop1 * v1 +  numerop2 * v2;
		
		System.out.println("O codigo da peca 1 e:"+ codigop1 +" O valor da peca 2 e:"+ codigop2 );
		System.out.printf("O valor total e: %.2f", valortotal);
		
		sc.close();
	}

}
