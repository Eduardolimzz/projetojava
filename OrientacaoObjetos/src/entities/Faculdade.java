package entities;

public class Faculdade {

	public String name;
	public double nota1, nota2, nota3;

	public double FinalGrade() {
		return nota1 + nota2 + nota3;
	}

	public double QuantoFalta() {
		if (FinalGrade() < 18.0) {
			return 18.0 - FinalGrade();
		} else {
			return 0.0;
		}
	}

}
