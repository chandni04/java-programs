import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day1 {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);
		int a=scan.nextInt();
		Double b=scan.nextDouble();
		scan.nextLine();
		String c=scan.nextLine();
		i=i+a;
		System.out.println(i);
		b=b+d;
		System.out.println(b);
		System.out.println(s+c);
	}
}