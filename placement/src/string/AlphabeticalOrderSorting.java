package string;

import java.util.Scanner;

public class AlphabeticalOrderSorting {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a String");
		String s=scn.nextLine();
		scn.close();
		char []c=s.toCharArray();
		sort(c);
		alphabeticalOrderSorting(c);
		s=display(c);
		System.out.println(s);
	}
public static void alphabeticalOrderSorting(char[]arr) {
	int count=0;
	int j;
	int x=0;
	int y=0;
	for(int i=0;i<arr.length;i++)
	{
		if(arr[i]>='A'&&arr[i]<'Z')
			count++;
	}
	int[] index=new int[arr.length-count];
	
	for(int i=count;i<arr.length;i++)
	{y=0;
		for( j=0;j<arr.length;j++)
	{
			
		char p=(char)(arr[i]-32);
		if(p<arr[j])
		{
			for(int k=i-1;k>=j;k--)
			{
				arr[k+1]=arr[k];
			}
			arr[j]=p;
			y=1;
			break;
		}
		
		
	}
		if(y==1)
		{
		index[x]=j;
		x++;
		
		}
	}
	
	for(int c=0;c<index.length;c++)
	{
		arr[index[c]]=(char)(arr[index[c]]+32);
	}
}	
	
public static void sort(char[] x) {
		
		for(int i=0;i<x.length;i++)
		{
			for(int j=i;j<x.length;j++)
			{
				if(x[i]>x[j])
				{
					char temp=x[i];
					x[i]=x[j];
					x[j]=temp;
				}
			}
			
		}
		}
public static String display(char[] arr) {
	String s="";
	for(int i=0;i<arr.length;i++)
		s+=arr[i];
	return s;
}

}
