package calculator;

public class CalculMath {
	int a, b;

	public CalculMath(int a, int b) {
		super();
		this.a = a;
		this.b = b;

	} // DemoCalcul

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
