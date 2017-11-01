   package Pattern;
import java.util.Scanner;
public class Pattern5
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number ");
		int n=sc.nextInt();
		//Method - 1
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==j||i<=j)
				{
				System.out.print("*");
				}
				else{
					
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		//Method - 2
		
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j < i ; j++) {
				System.out.print(" ");
			}
			for(int k = i ; k <= n ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}

 