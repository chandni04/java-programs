package String;

class countnoofvowel
{
	public static void main(String s[])
	{
		String s1="hello chandni rushi";
		s1=s1.toLowerCase();
		int count=0;
	    for(int i=0;i<s1.length();i++)
	    {
	    	
	    	char c=s1.charAt(i);
	    	if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
	    	{
	    		count++;
	    	}
	    	
	    }
	    System.out.println(count);
	}
}
