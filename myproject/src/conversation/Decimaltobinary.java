package conversation;
import java.util.Scanner;
public class Decimaltobinary 
{
	public static void main(String[] args)
	{
		String s1="";
		String reverse="";
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int reminder=0;
		System.out.println("enter the decimal no");
		System.out.println(n);
	 
		while(n>0)
		{
		reminder=n%2;
		s1=s1+reminder;
		n=n/2 ;  
		}
		
		for(int i=s1.length()-1;i>=0;i--)
		{
		 reverse=reverse+s1.charAt(i);
		}
		System.out.println(reverse);
		}

	 
}