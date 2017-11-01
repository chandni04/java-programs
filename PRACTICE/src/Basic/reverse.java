package Basic;

public class reverse
{
	public static void main(String s[])
	{
		int a =123456;
		int sum=0;
		while(a>0)
		{
			int rem=a%10;
			sum = rem+sum*10;
			a=a/10;
		}
		System.out.println(sum);
	}
}
