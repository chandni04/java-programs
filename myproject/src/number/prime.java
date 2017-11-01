package number;

public class prime
{
	public static void main(String s[])
	{

		int count = 0;
		for (int n = 1; n < 20; n++)
		{
			if (isprime(n))
			{
				count++;
				if (count % 2 == 0) {
					System.out.print(n + " ");
				}
			}
		}
		System.out.println();
	}

	public static boolean isprime(int n)
	{
		for (int i = 2; i <= n / 2; i++)
		{
			if (n % i == 0)
			{
				return false;
			}
		}
		return true;
	}
}
