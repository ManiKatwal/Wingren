package calculator;
import java.util.Scanner;
public class MeroClass {
	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner(System.in);
		
		int integerNumber;
		double doubleNumber;
		
		System.out.println("Enter any Integer");
		integerNumber = keyboardInput.nextInt();
		
		System.out.println("You have entered the number: " + integerNumber);
		
	System.out.println("\nEnter the decimal number(double): ");
	doubleNumber = keyboardInput.nextDouble();
	System.out.println("Enter youur decimal number: " + doubleNumber);
	
	}
	

}
