package calculator;

public class SwitchBreak {

	public static void main(String[] args) {
		
		char grade = 'G';
		
		switch(grade) {
		case 'A':
		System.out.println("You made an A. Excllent job");
		break;
		
		case 'B':
		System.out.println("You made a B.Gread job");
		break;
		
		case 'C': 
		System.out.println("You made a C. Good job");
		break;
		
		case 'D':
		System.out.println("You are intermidiate.");
		break;
		
		default:
			System.out.println("You made an in valud entry");
		 
		}
		
		

	}

}
