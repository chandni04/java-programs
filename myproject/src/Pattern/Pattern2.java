package Pattern;

import java.util.Scanner;

public class Pattern2
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		 for (int i=1;i<=n;i++)
		 {
			 for (int j=1;j<=i;j++)
			 {
				 int n1=i%2;
				 if(n1==0||j==1)
				 {
					 System.out.print("*");
				 }
				 else
				 {
					 System.out.print(" ");

				 }
					 
			 }
			 System.out.println();

			 
		 }

	}

}
