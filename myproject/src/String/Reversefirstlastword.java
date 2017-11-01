package String;

public class Reversefirstlastword
{
	public static void main(String s[])
	{
		String s1 = "chandni";
		/*
		 * for(int i=0;i<s1.length();i++) { char c=s1.charAt(0);
		 * s1.charAt(0)=s1.charAt(s1.length()); s1.charAt(s1.length())=c; }
		 */

		String result = "" + s1.charAt(s1.length() - 1);
		for(int i = 1; i < s1.length() - 1 ; i++) {
			result += s1.charAt(i);
		}
		result += s1.charAt(0);
		System.out.println(result);
		
		/*StringBuilder sb = new StringBuilder(s1);
		char temp = sb.charAt(0);
		sb.setCharAt(0, sb.charAt(s1.length() - 1));
		sb.setCharAt(s1.length() - 1, temp);
		System.out.println(sb.toString());*/
	}
}