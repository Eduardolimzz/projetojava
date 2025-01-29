package entities;

public class Dolarr {
	public static double IOF = 0.06;
	public static double paid(double price, double bought) {
		return price * bought * (1.0 + IOF);
	}

}
