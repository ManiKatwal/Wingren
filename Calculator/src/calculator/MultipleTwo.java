package calculator;

public class MultipleTwo {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i=2;i<=40;i++)
			{
			if(i%2 == 0)
			
			{
				System.out.println(i + " Multple of 2");
				continue;
			
			}
			System.out.println(i);
		}
	}
	

}
