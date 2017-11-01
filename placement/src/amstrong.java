import java.util.Scanner;

public class amstrong
{
	public static void main(String s[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("enter first number of series");
		int f = sc.nextInt();
		System.out.println("enter last number of series");
		int l = sc.nextInt();
		int count = 0;
		for (int i = f; i <= l; i++)
		{
			if (isAmstrong(i))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("total count of number is " + count);
	}

	public static boolean isAmstrong(int number)
	{
		int n = number;
		int reminder = 0;
		int collect = 0;
		while (number > 0)
		{
			reminder = number % 10;
			number = number / 10;
			collect = collect + (reminder * reminder * reminder);
		}
		if (n == collect)
			return true;
		else
			return false;
	}
}