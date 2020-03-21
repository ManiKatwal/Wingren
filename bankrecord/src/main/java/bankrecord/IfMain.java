package bankrecord;

public class IfMain {

	public static void main(String[] args) {

		int value = 3;
		if (value == 1) {
			System.out.println("Value was 1");

		} else if (value == 2) {
			System.out.println("Value was 2");
		} else {
			System.out.println("was not 1 or 2");
		}

		int switchValue = 5;
		switch (switchValue) {

		case 1:
			System.out.println("Value was 1");
			break;

		case 2:
			System.out.println("Value was 2");
			break;

		case 3:
			System.out.println("Value was 3");
			break;
		case 4:
		case 5:
			System.out.println("Was a 3, or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;

		default:
			System.out.println("Was not 1 ,2 or 3");
			break;

		}

		char Grade = 'A';

		switch (Grade) {
		case 'A':
			System.out.println("You have earned grade A");
			break;
		case 'B':
			System.out.println("You have earned grade B");
			break;

		case 'C':
			System.out.println("You have earned grade C");
			break;

		case 'D':
			System.out.println("You have earned grade D");
			break;

		case 'F':
			System.out.println("You have earned grade F");
			break;

		default:

			System.out.println("You did'n Succed");
			break;

		}

	}

}
