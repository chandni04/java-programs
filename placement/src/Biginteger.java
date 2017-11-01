import java.math.BigInteger;

public class Biginteger
{
	public static void main(String s[])
	{
		int num = 99;
		BigInteger fact = BigInteger.ONE;
		for (int i = 2; i <= num; i++)
		{
			fact = fact.multiply(BigInteger.valueOf(i));
		}
		System.out.println(fact.toString());
	}
}