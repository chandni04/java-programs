package series;

public class series1

{
	public static void main(String s[])
	{

	int n=11;
	int count=1;
	int count1=0;
	System.out.print(n+ "  ");
		
		while(n<=196)
		{
			//System.out.println(n+ "  ");
			n=n+30*count+(count1*count1);
			count++;
			
			count1++;
			System.out.print(n+ "  ");
			
		}
	}

}
