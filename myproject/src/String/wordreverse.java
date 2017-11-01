package String;

public class wordreverse
{
	
	public static void main(String[] args)
	{
		String reverseword=" ";
		String s1="java is an oops";
        String words[]=s1.split("\\s");
        for (int s=words.length-1;s>=0;s--)
        {
        	reverseword=" "+words[s];
        	System.out.print(reverseword);
        }
	}
}
