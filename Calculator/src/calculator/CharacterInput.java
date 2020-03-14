package calculator;

public class CharacterInput {
	public static void main(String[] args)
	throws java.io.IOException {
		
		char input;
		int input2;
		
		System.out.println("Enter any key from keyboard and press any key");
		input = (char)System.in.read();
		System.out.println("You have entered the key: " + input);
		
		input2 = System.in.read();
		System.out.println("You have entered the key: " + input2);
		
		input2 = System.in.read();
		System.out.println("You have entered the key: " + input2);
		
		
		System.out.println("\nEnter any second key from keyboard: ");
		input = (char) System.in.read();
		System.out.println("You have entered the key: " + input);
		
		
		
		
	}

}
