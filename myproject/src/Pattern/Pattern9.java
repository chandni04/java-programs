package Pattern;

import java.util.Scanner;

public class Pattern9
{
	public static void main(String s[])
	{
		int k=1;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{
			for (int j = 1; j <= i; j++)
			{
				System.out.print(k++ +"  ");
			 	
			}
			System.out.println();
		}
	}
}
