package BasicoJava;

import java.util.Locale;

public class codebase {

	public static void main(String[] args) {
		int y = 32;
		double x = 10.35784;
		double z = 10.35784;
		double o = 10.35784;
		System.out.println(y);
		System.out.println(x);
		System.out.printf("%.2f\n",z);
		System.out.printf("%.4f\n",o);
		System.out.println("Ola mundo");
		System.out.println("Bom dia");
		Locale.setDefault(Locale.US);
		System.out.printf("%.4f\n",o);
		System.out.println("RESULTADO = " + x + " METROS");
		System.out.printf("RESULTADO = %.2f metros%n", x);
		
	}

}
