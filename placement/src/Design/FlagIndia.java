package Design;

public class FlagIndia
{
	public static void main(String[] args)
	{
		for(int i=0;i<15;i++)
		{
			for(int j=0;j<8;j++)
			{
				if((i==13&&j==5)||j==0||i==2||i==4||i==0||(i==14&&j<=5)||(i==12&&j<=5)||(i==10&&j<=3)||(i==11&&j==3)||(i==1&&j==7)||(i==3&&j==7)||i==14&&j==5)			
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
