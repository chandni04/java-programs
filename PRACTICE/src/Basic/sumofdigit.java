package Basic;

public class sumofdigit
{   
	public static void main(String s[])
	{
		int  a=123456;
		int sum=0;
		while(a>0)
		{ 
		int reminder=a%10;
		sum=sum+reminder;
		a=a/10;
		}
		System.out.println(sum);
	}
}
