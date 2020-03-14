//import java.util.Scanner;

public class LessionTwo {

	public static void main(String[] args) throws java.io.IOException {
		// TODO Auto-generated method stub
		// Scanner mani = new Scanner(System.in);
		// int integerNumber;
		// double doubleNumber;
		// System.out.println("");
		// integerNumber = mani.nextInt();
		// System.out.println(" ");

		char input;
		int input2;
		System.out.println("enter the character from keyboard");
		input = (char) System.in.read();
		System.out.println("you have enter the charactere: " + input);

		input2 = System.in.read();
		System.out.println("Invisible character" + input2);
		input2 = System.in.read();
		System.out.println("invisible character" + input2);

		System.out.println("\n\n enter the second character from keyboard");
		input = (char) System.in.read();
		System.out.println("you have enter the charactere: " + input);

	}

}
