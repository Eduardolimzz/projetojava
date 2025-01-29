package entities;

public class Dados {
	
	public String name;
	public double grosssalary;
	public double tax;
	
	public double nextSalary() {
		return grosssalary - tax;
	}
	public void increasesalary(double percentage) {
		grosssalary += grosssalary * percentage / 100.0;
	}
	public String toString() {
		return name + ", $" + String.format("%.2f,", nextSalary());
	}

}
