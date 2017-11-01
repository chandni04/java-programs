package String;

public class OccurancesOfChars
{

	public static void main(String[] args)
	{
		String str = "banana";
		int occurances[] = new int[25];
		for (int i = 0; i < str.length(); i++)
		{
			char ch = str.charAt(i);
			occurances[ch - 97] += 1;
		} 

		for (int i = 0; i < occurances.length; i++)
		{
			if (occurances[i] > 0)
			{
				char ch = (char) (i + 97);
				System.out.println(ch + ": " + occurances[i]);

			}
		}

	}

}
