package calculator;
import java.util.Scanner;

public class Screen {
	
public static void main(String[] args) {
	
	Scanner keyboardInput = new Scanner(System.in);  
     int integerNumber;
     double doubleNumber;
	System.out.println("Enter your Integer: ");
	integerNumber = keyboardInput.nextInt();
	System.out.println("You enter the Integer: " + integerNumber);
	
	System.out.println("\nEnter any double number(duble): ");
	doubleNumber = keyboardInput.nextDouble();
	System.out.println("You enter the Integer: " + doubleNumber);
	
	
	
	




}

}
