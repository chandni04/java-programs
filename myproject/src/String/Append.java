package String;

public class Append
{	
	public static void main(String s[])
	{
		int a=3;
		int b=5;
		int c=a+b;
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.append(c));

		System.out.println(sb.append("av"));
		System.out.println(sb.append("a"));

	}

}
