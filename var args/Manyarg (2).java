class Manyargs
{
	public static void main(String s[])
	{
		static int add(int... a)
		{
			int sum=0;
			for(int i=0;i<a.length;i++)
			{
				sum=sum+a[i];
			}
         System.out.println(sum);	
		}
	}
}