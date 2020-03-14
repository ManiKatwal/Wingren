package calculator;

public class SquareRoot {
	
	public static void main(String [] args) {
		
		int squares[] = new int[100];
		
		int i;
		
		for(i = 0; i <= 99; i++ )
		{
			squares[i] = i*i;
			
		}
		
		for(i = 0; i <= 99; i++)
		{
			
			System.out.println("The square of " + i + " is " + squares[i]);
		}
	}
	

}
