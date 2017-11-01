package collection.Array;

import java.util.Scanner;

public class DynamicDemo
{

	public static void main(String[] args)
	{
//		Scanner sc = new Scanner(System.in);
		int size = 10;
		DynamicArray da = new DynamicArray(size);
//		System.out.println("enter elements");
//		int element = sc.nextInt();
		for(int i=0;i<15;i++)
		{
			da.add(i);
		}
		for (int index = 0; index < da.length(); index++)
		{
			System.out.println(da.get(index));
		}

	}
}
