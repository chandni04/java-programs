package Pattern2;

class Pattern8
{
	public static void main(String s[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				if((i+j)%2==0)
				System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
	}
}