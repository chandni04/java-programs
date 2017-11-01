package basic;

import java.util.Scanner;

class Factorial {
	public static void main(String s[]) {
		Scanner s1 = new Scanner(System.in);
		int n = s1.nextInt();
		int i, fact = 1;
		for (i = 1; i <= n; i++) {
			fact = fact * i;
		}
		System.out.println("Factorial of no is" + fact);

	}
}