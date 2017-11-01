package matrix;

import java.util.Scanner;

public class usermatrix
{
	public static void main(String[] args)
	{ 
		int row = 3;
		int column = 3;
		int matrix[][] = new int[row][column];
		Scanner scn = new Scanner(System.in);
		{
			System.out.println("enter the element");
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<column;j++)
				{
					matrix[i][j]=scn.nextInt();
					System.out.print( matrix[i][j]+" ");
				}
				System.out.println( );
			}
		}
	}
}
