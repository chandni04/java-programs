 class Pattern9
{
	public static void main(String s[])
	{
		for(int i=1;i<=6;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(i==j||j==1||j==6||i==6)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}