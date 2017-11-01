package string;

import java.util.Scanner;

public class RemovespaceString {
	public static void main(String s[]) {
		Scanner scn = new Scanner(System.in);
		String s1 = scn.nextLine();
		s1=s1.trim();
		String  arr = "";
		//String[] words = new String[s1.length()];
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i)== ' ' && s1.charAt(i + 1) == ' ') ;
				else
				{
					arr +=s1.charAt(i);
					
				}
		
			}
		System.out.println(arr);
		
			

		}

	}

