package calculator;

public class ArraysGrade {

	public static void main(String[] args) {
		
		double grades[] = {96.5, 98.7, 88.4, 88.6, 90.1, 99.8};
		
		double max;
		
		int i;
		
		max = grades[0];
		
		
		for(i=0; i<=5; i++)
		{
			if(grades[i] > max) max = grades[i];
			
		}
		System.out.println("\n\nThe max grades in the class is: " + max);
	}
}
