package String;

public class deletevowel1
{
	public static void main(String s[])
	{
		String s1="hello rushi";
		String  vowels[]={"a","e","i","o","u"};
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			s1=s1.replace(vowels[i], "");
			
		}
		System.out.println(s1);
	}
}
