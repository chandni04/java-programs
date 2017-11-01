package String;

public class comapreStringbymethod
{
	
	
	public static void main(String s[])
	{
		 String s1 = "hello rushi";
		 String s2 = "hello rushi";
		if (isEqual(s1, s2))
		{
			System.out.println("String is equal");
		} else
		{
			System.out.println("string is not equal");
		}

	}

	public static boolean isEqual(String s1,String s2 )
	{
		
		 int len1 = s1.length();
		 int len2 = s2.length();

		if (len1 != len2)
			return false;
		else
			for (int i = 0; i < s1.length(); i++)
			{
				{
					if (s1.charAt(i) != s2.charAt(i))
						return false;
				}
			}
		return true;

	}

}
