import java.util.Scanner;

public class primeseries
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		//  2 3 5 7 11 13 17 19 23
		System.out.println("enter first number of series");
		int f = sc.nextInt();
		System.out.println("enter last number of series");
		int l = sc.nextInt();
		int count = 0;
		int count1 = 0;
		for (int i = f; i <= l; i++)
		{
			if (isprime(i))
			{
				count++;
				if (count % 3 == 0)
				{
					System.out.println(i);
					count1++;
				}
			}
			
		}
		System.out.println("total no of count "+count1);

	}

	public static boolean isprime(int number)
	{
		for (int i = 2; i <= number / 2; i++)
		{
			if (number % i == 0)
				return false;

		}
		return true;

	}

}
