package calculator;

import java.util.Scanner;

public class DemoCalcul extends CalculMath {

	public DemoCalcul(int a, int b) {
		super(a, b);

	}

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int a = scan.nextInt();

		System.out.println("Enter the second number: ");
		int b = scan.nextInt();

		System.out.println("Enter the operator sign:");
		String op = scan.next();

		int c = 0;

		CalculMath Obj = new CalculMath(a, b);

		switch (op) {
		case "+":
			c = Obj.add();
			break;

		case "-":
			c = Obj.sub();
			break;

		case "*":
			c = Obj.mul();
			break;

		case "%":
			c = Obj.div();
			break;

		}
		System.out.println(a + op + b + "=" + c);

	}

}
