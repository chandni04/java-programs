package String;

public class deletevowel
{
	public static void main(String s[])
	{
		String s1 = "hEllo rushigh";
		s1 = s1.toLowerCase();

		for (int i = 0; i < s1.length(); i++)
		{
			char c = s1.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'U')
			{
				s1 = s1.replace(c+"", "");
			}
			/*char c = s1.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'U')
			{
				String s2 = "" + c;
				s1 = s1.replace(s2, "");
			}*/
			
		}
		System.out.println(s1);
	}
}
