package calculator;
import java.util.Scanner;
public class KeyboardInput {
	public static void main(String[] args) {
		Scanner mani = new Scanner(System.in);
		
		int intNumber;
		double doubleNumber;
		
		System.out.println("Enter any number from keyboard ");
		intNumber = mani.nextInt();
		System.out.println("you Enter your number: " + intNumber);
	
		System.out.println("\nEnter any  double number from keyboard ");
		doubleNumber = mani.nextDouble();
		System.out.println("you have Enter your number: " + doubleNumber);
		
	}

}
