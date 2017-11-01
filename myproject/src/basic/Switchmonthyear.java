package basic;

import java.util.Scanner;
class Switchmonthyear
{
	public static void main(String s[])
	{
		Scanner s1=new Scanner(System.in);
		System.out.println("enter month");
		int m=s1.nextInt();
		System.out.println("enter year");
		int y=s1.nextInt();
		switch(m)
		{
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
		System.out.println("no of days 31");
		break;
		case 4:case 6:case 9:case 11:
		System.out.println("no of days is 30");
		case 2:
		if(y%400==0||y%4==0&&y%100!=0)
		
		System.out.println("number of days 28");
		else
		System.out.println("number of days 29");

		}
	}
}