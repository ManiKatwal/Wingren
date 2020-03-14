package calculator;

public class PackageL1 {
	public static void main(String[] args)
	throws java.io.IOException {
		char input;
		int input2;
		System.out.println("please type character : " );
		input =(char) System.in.read();
		System.out.println(" You type character: " + input);
		
		input2 =  System.in.read();
		System.out.println("Invisible character: " + input2);
		input2 = System.in.read();
		input2 = System.in.read();
		System.out.println("invisible character: " + input2);
		
		
		System.out.println("\n please enter second character: ");
		input = (char) System.in.read();
		System.out.println("plese type second character: " + input);
		
		
	}

}
