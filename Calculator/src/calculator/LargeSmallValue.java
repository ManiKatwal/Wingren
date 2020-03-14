package calculator;

public class LargeSmallValue {
	
public static void main(String[] args) {
	
	int largeArray[] = {1,9,89,56,78,69,2,8,99};
	
	int smallest = largeArray[0];
	int largest = largeArray[0];
	int i;
	
	for(i = 0; i <= 8; i++) 
	{
		if(largeArray[i] < smallest) smallest = largeArray[i];
		if(largeArray[i] > largest) largest = largeArray[i];
		
	}
	
	System.out.println("Smallest value is: " + smallest);
	System.out.println("largest value is: " + largest);
	
}

}
