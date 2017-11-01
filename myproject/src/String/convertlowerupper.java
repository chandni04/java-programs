package String;

public class convertlowerupper
{

	public static void main(String[] args)
	{
		String s1 = "CHandNi";
		String str = "";
		/*for (int i = 0; i < s1.length(); i++)
		{
			char ch = s1.charAt(i);
			if (ch >= 'a' && ch <= 'z')
			{
				str += ch + "";
				str = str.toUpperCase();
			} else if (ch >= 'A' && ch <= 'Z')
			{
				str += ch + "";
				str = str.toLowerCase();
			}

		}*/
		
		for(int i = 0 ; i < s1.length() ; i++) {
			char ch = s1.charAt(i);
			if(ch >= 'a' && ch <= 'z') {
				str = str + (char)(ch - 32);
			}
			else if(ch >= 'A' && ch <= 'Z') {
				System.out.println(ch);
				str = str + (char)(ch + 32);
			}
		}
		
		System.out.println(str);
	}
}
