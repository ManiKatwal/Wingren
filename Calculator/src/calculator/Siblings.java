package calculator;

public class Siblings {
	public static void main(String[] args) {
		
		int numSiblings = 1;
		
		switch(numSiblings){
		
		case 0:
			System.out.println("You did very good");
			break;
			
		case 1:
		System.out.println("You did good");
		break;
		
		case 2:
		System.out.println("You did poorely.");
		break;
		
		case 3:
		System.out.println("You failed");
		break;
		
		default:
			System.out.println("You made an invalid entry.");
			
			
		}
	}

}
