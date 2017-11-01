package MethodOverloading;

public class shapes
{
	
	public static void main(String s[])
	{
		int x=9;
		int y=8;	
	shapes s1=new shapes();
	s1.shape(x);
	s1.shape(x,y);
	}
	public void shape(int x)
	{
		int square =x*x;
		System.out.println("this is square area of square is"+square);	
	}
	public void shape(int x,int y)
	{
		int rectangle =x*y;
		System.out.println("this is rectangle area of square is"+rectangle);	
	}
}
