package recursion;
public class factorial
{
	int fact=1;
	public static void main (String s[])
	{
		
		int n=5;
		factorial f1=new factorial();
		int result =f1.fact( n);
		System.out.println(result);
		
	}
	int fact(int n)
	{
		if(n>0)
		{
		
		return n*fact(n-1);
		
		}
	return 1;
	}
}