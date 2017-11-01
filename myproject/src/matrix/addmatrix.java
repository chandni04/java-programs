package matrix;

import java.util.Scanner;

public class addmatrix
{
	public static void main(String s[])
	{
		int row = 3;
		int column = 3;
		int arr1[][] = new int[row][column];
		int arr2[][] = new int[row][column];
		int[][] add=new int[row][column];
		int[][] sub=new int[row][column];
		int[][] mul=new int[row][column];
		
		Scanner scn = new Scanner(System.in);
		{
			System.out.println("enter the 1st matrix  element");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
					arr1[i][j] = scn.nextInt();
					System.out.print(arr1[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("enter the 2st matrix  element");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
					arr2[i][j] = scn.nextInt();
					System.out.print(arr2[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("addition of matrix is");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
				
					add[i][j]=arr1[i][j]+arr2[i][j];
					
				}
			}	
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
			System.out.print(add[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("substraction of matrix is");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
				
					sub[i][j]=arr1[i][j]-arr2[i][j];
					
				}
			}	
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
			System.out.print(sub[i][j] + "   ");
				}
				System.out.println();
			}
			System.out.println("multiplication of matrix is");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
				
					mul[i][j]=arr1[i][j]*arr2[i][j];
					
				}
			}	
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
			System.out.print(mul[i][j] + "   ");
				}
				System.out.println();
				
			}
			System.out.println("transpose of matrix 1st");
			for (int i = 0; i < row; i++)
			{
				for (int j = 0; j < column; j++)
				{
					System.out.print(arr1[j][i] + "   ");
				}
				System.out.println();
			}
			 
		}
		
	}
}
