import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Day4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
		for(int i=1;i<=10;i++)
		{
			int s=n*i;
			System.out.println(n+"*"+i+"="+s);
		}
    }
}
