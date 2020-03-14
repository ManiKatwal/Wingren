package calculator;

public class CharInput {
	public static void main(String[] args)
	throws java.io.IOException {
		char input;
		
		System.out.println("Enter any char from keyboard");
	  input = (char)System.in.read();
	  System.out.println("You have entered key: " + input);
	  
	input = (char)System.in.read();
	input = (char)System.in.read();
	System.out.println("\nPress any second key: ");
	input = (char)System.in.read();
	System.out.println("You have entered second key: " + input);
	
	
	}
	

}
