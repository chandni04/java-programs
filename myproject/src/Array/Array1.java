package Array;

import java.util.Scanner;

public class Array1
{
	public static void main(String[] args)
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 10 elements");
		int array []=new int[10];
		for(int i=0;i<array.length;i++)
		{
			int n=sc.nextInt();
			array[i]=n;
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		
		
	}

}
