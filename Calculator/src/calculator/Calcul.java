package calculator;

public class Calcul {

	int a, b;

	public Calcul(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	int add() {
		return a + b;
	}

	int sub() {
		return a - b;
	}

	int mul() {
		return a * b;
	}

	int div() {
		return a / b;
	}
}
