package string;

public class ReverseWord
{
	public static void main(String s[])
	{
		String s1 = "this is my first class";
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
		System.out.println("Words: ");
		for (int i = 0; i <= count; i++)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println();
		
		int start = 0;
		int end = count;
		
		for(int i = 0 ; i <= count/2 ; i++) {
			String temp = words[start];
			words[start] = words[end];
			words[end] = temp;
			start++;
			end--;
		}
		System.out.println("Words: ");
		for (int i = 0; i <= count; i++)
		{
			System.out.print(words[i] + " ");
		}
		System.out.println();
	}

}
