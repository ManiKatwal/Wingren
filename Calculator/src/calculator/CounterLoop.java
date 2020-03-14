package calculator;

public class CounterLoop {
	public static void main(String[] args) {
		
		int i;
		int i2;
		for(i = 0; i <= 10; i++) {
			System.out.println("The integter i is at " + i);
			
			System.out.println();
		
			for(i2 =100; i2 > 50; i2 = i2 - 10) {
			System.out.println("The integer i2 is at " + i2);
			} 
		}
	}

}
