package Pattern2;

class Pattern3
{
	public static void main(String s[])
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
		    	System.out.println(i+" "+j);
				if(i%2==0)	
			break;
			}
		}
	}
}