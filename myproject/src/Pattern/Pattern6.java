package Pattern;
import java.util.Scanner;
public class Pattern6
{
 public static void main(String s[])
 {
	  
	  		Scanner sc=new Scanner(System.in);
	  		System.out.println("enter number ");
	  		int n=sc.nextInt();
	  		
	  		for(int i=1;i<=n;i++)
	  		{
	  			for(int j=1;j<=n;j++)
	  			{
	  				if(i+j>=6)
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
	  		 
 }}
 

