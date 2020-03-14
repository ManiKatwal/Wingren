package calculator;

public class IfElse {
	public static void main(String[] args) {
		int temperature = 36;
		boolean Sunny = true;
	
	
		if(temperature >= 90) {
			System.out.println("it is hot outside");
		if(Sunny == true) 
			System.out.println("it is also hot outside");
			else
				System.out.println("it is cloudy outside");
		}
		
		
		else {
			System.out.println("It is very cold outside");
			
			if(Sunny == true)
               System.out.println("it is also hot outside");
			else
			System.out.println("it is also cloudy outsode");
			
		}
	
	}

}
