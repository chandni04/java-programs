package Pattern;

public class pattern10
{
	public static void main(String s[])
	{
		String s1 = "6gfdy1nguu3!@#$%^&*()ABCDEFG";
		String temp = "";
		int count = 0;
		for (int i = 0; i < s1.length(); i++)
		{
			Character ch = s1.charAt(i);
			// if ((ch >= 65 && ch <= 90) || (ch >= 97 && ch <= 122))
			// {
			// temp += s1.charAt(i);
			// }
			if (ch >= 48 && ch <= 57)
			{
				count += Integer.parseInt(ch.toString());
			} else
			{
				temp += s1.charAt(i);
			}
		}
		System.out.println(count + temp);
	}
}
 