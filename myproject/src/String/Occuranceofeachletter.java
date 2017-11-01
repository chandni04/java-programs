package String;

public class Occuranceofeachletter
{
	public static void main(String s[])
	{
		String s1="hello chdsnfnds cjdsf";
		String withoutspace="";
		int count=0;
	    for(int i=0;i<=s1.length()-1;i++)
		{
			if(s1.charAt(i)!=' ')
			{
			 withoutspace+=s1.charAt(i);
			 count++;
			}	
		}
	    System.out.println(withoutspace);
	    System.out.println(count);
	}
}