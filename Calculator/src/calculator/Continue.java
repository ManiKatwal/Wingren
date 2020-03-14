package calculator;

public class Continue {
	
	public static void main(String[] args) {
		
		int i;
		
		for(i=1; i<=30; i++)
		{
			if(i% 5== 0)
			{
				System.out.println(i + "  multiple of 5");
			continue;
			}
		
	System.out.println(i);
	
		}
	}
}

