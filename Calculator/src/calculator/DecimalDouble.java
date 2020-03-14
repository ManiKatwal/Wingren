package calculator;
import java.util.Scanner;
public class DecimalDouble {
	public static void main(String[] args) {
		
	Scanner keyboardInput = new Scanner(System.in);
	
	double doubleNumber = 0;
	
	System.out.println("Enter any decimal number: ");
	
	if(keyboardInput.hasNextDouble() == true)doubleNumber = keyboardInput.nextDouble();
	
	System.out.println("you enterd the number: " + doubleNumber);
	
	
	}

}
