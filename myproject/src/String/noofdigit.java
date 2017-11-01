package String;

public class noofdigit
{
	public static void main(String s[])
	{
		String s1 = "hello 12345pallavi";
		int count = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if (ch >= '0' && ch <= '9')
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
