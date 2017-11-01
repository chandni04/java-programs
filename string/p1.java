class p1
{
	public static void main(String s[])
	{
	int n =13;
	for(int i=2;i<=n/2;i++)
	{
		if(n%i==0)
		{
			System.out.println("no is not prime");
			break;
		}
	}
		System.out.println("prime");
	
	}
}