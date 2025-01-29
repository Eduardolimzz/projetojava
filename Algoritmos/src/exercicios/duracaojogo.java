package exercicios;

import java.util.Scanner;

public class duracaojogo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int horainicial, horafinal, duracao;
		
		horainicial = sc.nextInt();
		horafinal = sc.nextInt();

		if( horainicial < horafinal) {
			duracao = horafinal - horainicial;
		}else {
			duracao = 24 - horainicial + horafinal;
		
		}
		System.out.println("O JOGO DUROU " + duracao + " HORA(S)");
		sc.close();	
	}
	
}
