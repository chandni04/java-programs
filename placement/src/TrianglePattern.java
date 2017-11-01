import java.util.Scanner;

public class TrianglePattern 
{

	public static void main(String[] args) 
	{
		
			System.out.println("1.Right Angled Triangle");
			System.out.println("2.Equilateral triangle");
			System.out.println("3.Alternate for equilateral triangle");
			Scanner scn=new Scanner(System.in);
			System.out.println("Choose Option");
			int c=scn.nextInt();
			switch(c)
			{
				case 1:
						for(int x=1;x<=4;x++)
						{
							for(int y=1;y<=x;y++)
							{
								System.out.print("*");
							}
						
						System.out.println();
						}
						break;
				case 2:
					for(int x=1;x<=4;x++)
					{
						for(int b=4;b>x;b--)
						{
							System.out.print(" ");
						}
						for(int y=1;y<=x;y++)
						{
							System.out.print("*");
						}
					
					for(int z=2;z<=x;z++)
					{
						System.out.print("*");
					}
					System.out.println();
					}
					break;
				case 3:
					for(int x=1;x<=4;x++)
					{
						for(int b=4;b>x;b--)
						{
							System.out.print(" ");
						}
						for(int y=1;y<=x;y++)
						{
							if(y==2)
							{
								System.out.print("*");
							}
							else
							{
								System.out.print(" ");
							}
						}
					
					for(int z=3;z<=x;z++)
					{
						if(z==x)
						{
							System.out.print("*");
						}
						else
						{
							System.out.print(" ");
						}
					}
					System.out.println();
					}
					break;
				
			}
		}

	

}
