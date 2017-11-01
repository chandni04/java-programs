package string2;

class String1
{
	public static void main(String s[])
	{
		String a1="java";
        String a2[]={"a","e","i","o","u"};
		
		for(int i=0;i<=a1.length();i++)
		{
			for(int j=0;j<=a2.length;j++)
			{
			char c=a1.charAt(i);
			int count=a1.length()-a1.replace(a2[i],"").length();
			System.out.println(c+"=  "+count);
			break;
			}
		}
	}
}