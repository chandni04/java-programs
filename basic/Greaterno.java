import java.util.Scanner;
class Greaterno
{
	public static void main(String s[])
	{
	Scanner s1=new Scanner(System.in);
    System.out.println("enter number");
	int a=s1.nextInt();
	System.out.println("enter number");
	int b=s1.nextInt();
	if(a>b)
	{
		System.out.println("no is greater"+a);
	}
	 else if(b>a)
	 {
		System.out.println("no  is greater"+b);
	 }
	else 
		System.out.println("no is equal");
	}
}