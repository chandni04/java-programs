package String;

public class Stringpallindrome
{
	public static void  main(String s[])
	{
	  String   s1="madam";
	    s1=s1.toLowerCase();
	    int len=s1.length();
	    boolean isPalindrome = true;
	    for(int i=0;i<len/2;i++)
	    {
	    	if(s1.charAt(i)!=s1.charAt(len-i-1))
	    	{
	    		isPalindrome = false;
	    		break;
	    	}
	    }
	    
	    if(isPalindrome) {
	    	System.out.println("String is palindrome");
	    }
	    else {
	    	System.out.println("String is not palindrome");
	    }
	    
	   /* int i = 0;
	    for(i=0;i<len/2;i++)
	    {
	    	if(s1.charAt(i)!=s1.charAt(len-i-1))
	    	{
	    		break;
	    	}
	    }
	    if(i == len/2){
	    	System.out.println("String is palindrome");
	    }
	    else {
	    	System.out.println("String is not palindrome");
	    }
	    */
	    
	}
}
	 

