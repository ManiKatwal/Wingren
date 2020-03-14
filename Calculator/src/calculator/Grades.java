package calculator;

public class Grades {
	public static void main(String [] args) {
		
		double grades[] = {78.56, 85.78, 89.85, 98.56, 99.56, 96.56};
		
		double max;
		int i;
		
		max = grades[0];
		
		for (i = 0; i <= 5; i++)
		{
		if(grades[i] > max) max = grades[i];
		
		}
		System.out.println("\n\nThe max grade of the class: " + max  );
		}
		
	}


