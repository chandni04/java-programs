package string;

public class ReverseString
{
	public static void main(String s[])
	{
		String s1 = "this is an java";
		String word = "";
		int len = s1.length();
		int count = 0;
		String words[] = new String[len];
		for (int i = 0; i < s1.length(); i++)
		{
			if (s1.charAt(i) == ' ')
			{
				words[count] = word;
				word = "";
				count++;
			} else
			{
				word += s1.charAt(i);
			}
		}
		words[count] = word;
		for (int i = 0; i <= count; i++)
		{
			System.out.println("words of string " + words[i]);
		}

	}

}
