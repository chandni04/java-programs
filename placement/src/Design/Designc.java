package Design;

import java.util.Scanner;

public class Designc
{
	public static void main(String[] args)
	{
		Scanner scn= new Scanner(System.in);
		System.out.println("Enter Number ");
		int n=scn.nextInt();
		scn.close();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==0||j==0||i==n-1)
					System.out.print("*");
			}
			System.out.println();
		}
	}
}

