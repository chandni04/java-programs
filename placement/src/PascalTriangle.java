import java.util.Scanner;

public class PascalTriangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int n=scn.nextInt();
		int arr[][]=new int [n][];
		for(int i=0;i<arr.length;i++)
		{
			
				arr[i]=new int[i+1];
				//arr[i][j]=scn.nextInt();
			
		}
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{System.out.println(i+","+j);
				if(j==0||j==i)
					arr[i][j]=1;
				else
					arr[i][j]=arr[i-1][j-1]+arr[i-1][j];
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=arr.length-i-1;j>0;j--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<arr[i].length;j++)
			{
				System.out.print(arr[i][j]+" ");
			}System.out.println();
			
		}
		
		
		
		
	}	

}

 