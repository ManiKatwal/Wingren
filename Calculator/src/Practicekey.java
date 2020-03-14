import java.util.Scanner;

public class Practicekey {

	public static void main(String[] args) {

		Scanner mani = new Scanner(System.in);

		double fnum, snum, answer;

		String sign;

		System.out.println("Enter your first number:");

		fnum = mani.nextDouble();

		System.out.println("Enter your second number:");

		snum = mani.nextDouble();

		System.out.println("Enter calculation operator  sign:");

		sign = mani.next();

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
			System.out.println("You have entered invalid key!");
		}
		System.out.println("Your answer: " + answer);
	}

}
