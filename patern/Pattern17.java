class Pattern17
{
	public static void main(String s[])
	{
		int space=4,start=1;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for( int k=1;k<=start;k++)
			{
				System.out.print("*");
			}
				System.out.println();
				space--;
				start+=2;
		}
	}
}