import java.util.Scanner;
class Evenodd
{
	public static void main(String s[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter number");
		int n=s1.nextInt();
		if(n%2==0)
		{
			System.out.println("it is even no");
		}
		else
		   System.out.println("it is odd no");
	}
}