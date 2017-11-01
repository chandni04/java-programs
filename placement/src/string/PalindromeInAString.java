package string;
import java.util.Scanner;

public class PalindromeInAString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter A String");
		String s=scn.nextLine
				();
		scn.close();
		String [] s1=mySplit(s);
		String s2="";
		System.out.println("Palindrome in String are:");
		for(int i=0;i<s1.length;i++)
		{
			Boolean b=Palindrome(s1[i]);
			if(b){
				System.out.println(s1[i]);
				if(s2.length()<s1[i].length())
				s2=s1[i];
				}
		}
		if(s2!="")
		System.out.println("Biggest Palindrome is:"+s2);
		else
			System.out.println(0);

	}
	public static boolean Palindrome(String s)
	{
		for(int i=0;i<=s.length()/2;i++)
		{
			if(s=="") return false;
			if(s.charAt(i)==s.charAt(s.length()-1-i));
			else
				return false;
		}
		return true;
	}
	public static String[] mySplit(String s)
	{int count =0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
				count++;}
		String[] s1=new String[count+1];
		int k=0;
		for(int j=0;j<s1.length;j++)
		{String s2="";
		
		for(int i=k;i<s.length();i++)
		{if(s.charAt(i)==' '){  k++; }
		else
		{
			s2+=s.charAt(i);
		k++;}
		if(s.charAt(i)==' '&&s.charAt(i+1)!=' ')
			break;
			}
		s1[j]=s2;
		}
		return s1;
		
	}

}
