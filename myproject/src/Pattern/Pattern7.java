package Pattern;

import java.util.Scanner;

public class Pattern7
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number ");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++)
		{

			for (int j = n; j > i; j--)
			{
				System.out.print(" ");
			}
			for (int k = i; k > 0; k--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
