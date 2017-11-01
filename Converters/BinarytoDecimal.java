import java.util.Scanner;
public class BinarytoDecimal
{

	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		long n=scn.nextLong();
		
		System.out.println("enter the binary no");
		System.out.println(n);
		int p=0,decimal=0;
		while(n>0)
		{
			   decimal+=((n%10)*Math.pow(2,p));
			   n=n/10;
               p++;
               
		}
		 System.out.println(decimal);
	}
}	