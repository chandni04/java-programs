
class Fibo
{
	public static void main(String s[])
	{
	int n1=0,n2=1,n3,n=20;
	System.out.println(n1+" "+n2);
	for(int i=2;i<=n;i++)
	{
		n3=n1+n2;
		n1=n2;
		n2=n3;
		System.out.println(n3);
	}
	}
	
}