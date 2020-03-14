package calculator;

import java.util.Scanner;

public class IntegerDeci {
	public static void main(String[] args) {
		
		Scanner keyboardInput = new Scanner(System.in);
	
		double doubleNumber = 0;
		System.out.print("Enter your double integer: ");
      if(keyboardInput.hasNextDouble() == true) doubleNumber = keyboardInput.nextDouble();
	   System.out.println("you have entered your double number: " + doubleNumber);
	
	
	
	
	}
	

}
