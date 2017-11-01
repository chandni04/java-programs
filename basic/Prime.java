class Prime
{
	public static void main(String s[])
	{
		int n=15,i;
		for(i=2;i<=n/2;i++)
		{
		     if(n%i==0)
		    {
			System.out.println("it is not prime");
			return;
		    }  
		}			
			System.out.println("it is prime");
	   
	}
}