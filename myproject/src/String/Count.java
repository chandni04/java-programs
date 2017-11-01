package String;

import java.util.Scanner;

public class Count
{
		    public static void main(String[] args)
		    {
		        System.out.println("Enter the string");
		 
		        Scanner sc = new Scanner(System.in);
		 
		        String s=sc.next();
		 
		        int count = 1;
		        for(int i=0;i<s.length();i++)
		        {
		         if((s.charAt(i)==' ')&& (s.charAt(i+1)!=' '))
		        	 count++;
		      
		        }
		        System.out.println(count);
		    }
}