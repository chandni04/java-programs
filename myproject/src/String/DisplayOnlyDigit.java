package String;
public class DisplayOnlyDigit
{
	public static void main(String s[])
	{
		String s1="hello 12345435dcvdffsg";
		for(int i=0;i<s1.length();i++)
		{
			char ch =s1.charAt(i);
			if(ch>='0' && ch<='9')
			{
				System.out.println(ch);
			}
		}
	}
	
}
