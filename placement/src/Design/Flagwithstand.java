package Design;

public class Flagwithstand
{
	public static void main(String[] args)
	{
		for(int i=0;i<=14;i++)
		{
			for(int j=0;j<=14;j++)
			{
				if(i==13&&j==12||j==7||i==0&&j>=7&&j<=14||i==1&&j==14||i==2&&j>=7&&j<=14||i==3&&j==14
					||i==4&&j>=7&&j<=14||i==14&&j>=3&&j<=12||i==13&&j==3||i==12&&j>=3&&j<=12
					||i==11&&j==4||i==11&&j==10||i==10&&j>=4&&j<=10)              
				{
					System.out.print("*");
				}
				else
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}