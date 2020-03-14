package calculator;

import java.util.Scanner;

public class Sobha extends Aaditya {

	public Sobha(int a, int b) {
		super(a, b);
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter first number: ");
		int a = scan.nextInt();

		System.out.println("Enter second number: ");
		int b = scan.nextInt();

		System.out.println("Enter your operator sign:");
		String op = scan.next();

		int c = 0;

		Aaditya aa = new Aaditya(a, b);

		switch (op) {
		case "+":
			c = aa.add();
			break;
		case "-":
			c = aa.sub();
			break;
		case "*":
			c = aa.mul();
			break;
		case "/":
			c = aa.div();
			break;
		}
		System.out.println(a + op + b + "=" + c);
	}
}
