package Basic;

public class palindrome
{

	public static void main(String[] args)
	{
       int sum=0;
       int n=12233;
      int temp=n;
       while(n>0)
       {
    	  int  rem=n%10;
    	  sum=rem+sum*10; 
    	  n=n/10;
       }       
       if(temp==sum)
       {
    	  System.out.println("is palindrome");
       }
       else
       {
    	   System.out.println("is not palindrome"); 
       }
	}
 
}
