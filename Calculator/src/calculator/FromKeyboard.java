package calculator;

import java.io.IOException;

public class FromKeyboard {
   public static void main(String[] args)
     
                 throws java.io.IOException {
		
		  char input;
		  System.out.println("inter something from keyboard: ");
		input = (char)System.in.read();
		if(input == '1')System.out.println("You type the number 1: ");
		if(input != '1')System.out.println("You didn't type number 1: ");
		
		
	}

}
