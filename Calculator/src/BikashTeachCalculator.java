
import java.util.Scanner;

public class BikashTeachCalculator {

	public static void main(String[] args) {

		Scanner MyClass = new Scanner(System.in);
		double fnum, snum, newprice, answer;
		System.out.println("Enter frist number:");
		fnum = MyClass.nextDouble();
		System.out.println("Enter second number:");
		snum = MyClass.nextDouble();

		// System.out.println("Enter new price.");
		// newprice = MyClass.nextDouble();

		String sign;
		System.out.println("Enter calculation operator:");
		sign = MyClass.next();

		answer = 0;
		if (sign.equalsIgnoreCase("+")) {
			answer = fnum + snum;
		} else if (sign.equalsIgnoreCase("-")) {
			answer = fnum - snum;

		} else if (sign.equalsIgnoreCase("*")) {
			answer = fnum * snum;

		} else if (sign.equalsIgnoreCase("/")) {
			answer = fnum / snum;

		} else {
			System.out.println(" You entered an invalid Key");
		}

		System.out.println("Your answer: " + answer);
	}

}
