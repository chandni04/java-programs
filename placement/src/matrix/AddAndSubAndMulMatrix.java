package matrix;

import java.util.Scanner;

public class AddAndSubAndMulMatrix {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Matrix Order");
		int n=scn.nextInt();
		int matrix1[][]=createMatrix(scn,n);
		System.out.println("Enter Values for Matrix2");
		int matrix2[][]=createMatrix(scn,n);
		int addMatrix[][]=new int[n][n];
		addMatrix(addMatrix,matrix1,matrix2);
		System.out.println("Matrix Addition");
		display(addMatrix);
		int subMatrix[][]=new int[n][n];
		subMatrix(subMatrix,matrix1,matrix2);
		System.out.println("Matrix Substraction");
		display(subMatrix);
		int mulMatrix[][]=new int[n][n];
		mulMatrix(mulMatrix,matrix1,matrix2);
		System.out.println("Matrix Multiplication");
		display(mulMatrix);
		
		
		
		
		
		
		
	}
	public static int[][] createMatrix(Scanner scn,int n)
	{
		
		int matrix[][]=new int[n][n];
		System.out.println("Enter Values");
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++){
			 matrix[i][j]=scn.nextInt();
			}
		}
		return matrix;
		
	}
	public static void addMatrix(int[][] addMatrix,int[][] matrix1,int[][] matrix2)
	{
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1.length;j++){
			 addMatrix[i][j]=matrix1[i][j]+matrix2[i][j];
			}
		}
	}
	public static void subMatrix(int[][] subMatrix,int[][] matrix1,int[][] matrix2)
	{
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1.length;j++){
			 subMatrix[i][j]=matrix1[i][j]-matrix2[i][j];
			}
		}
	}
	
	public static void mulMatrix(int[][] mulMatrix,int[][] matrix1,int[][] matrix2)
	{
		for(int i=0;i<matrix1.length;i++)
		{
			for(int j=0;j<matrix1.length;j++){
				int sum=0;
				for(int k=0;k<matrix1.length;k++){
					sum+=matrix1[i][k]*matrix2[k][j];
				}
				 mulMatrix[i][j]=sum;
			}
		}
	}
	
	public static void display(int [][] matrix)
	{
	for(int i=0;i<matrix.length;i++)
	{
		for(int j=0;j<matrix.length;j++){
		 System.out.print(matrix[i][j] + " ");
		}
		System.out.println();
	}
	}

}
