import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day5 {

    public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int testCases = scanner.nextInt();
		scanner.nextLine();
		for(int testCaseIterator = 0 ; testCaseIterator < testCases ; testCaseIterator++) {
			String input = scanner.nextLine();
			String even = "";
			String odd = "";
			for(int i = 0; i < input.length(); i++)
			{
				char ch = input.charAt(i);
				if(i%2 == 0)
					
				{
					even = even + ch;	
				}
				else
				{
					odd = odd + ch;
				}
			}
			String result = even + " " + odd;
			System.out.println(result);
		}
        scanner.close();
		
    }
}