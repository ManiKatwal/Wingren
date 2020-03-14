import java.util.Scanner;

public class LessionOne {

	public static void main(String[] args) {

		// throws java.io.IOException;

		Scanner mani = new Scanner(System.in);
		int integerNumber;
		double doubleNumber;
		System.out.println("enter integer ");

		integerNumber = mani.nextInt();

		System.out.println("you have entered the integer: " + integerNumber);

		System.out.println("\n\nEnter second double");

		doubleNumber = mani.nextDouble();
		System.out.println("you have entered the double: " + doubleNumber);

	}

}
