package Basic;

public class prime
{
	public static void main(String s[])
	{
		System.out.println(Prime(2));
		
		for (int i = 0; i <= 10; i++)
		{
			if (Prime(i))
			{
				System.out.println(i + " is prime");
			} else
			{
				System.out.println(i + " is not prime");
			}

		}
	}

	static boolean Prime(int n)
	{
		int m=n/2;
		for (int i = 2; i <= m
				; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;

	}
}
