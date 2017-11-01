package saplab;

import java.util.Scanner;

public class OddString {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String[] array = str.split(" ");
		for(String string : array) {
			if(string.length() % 2 != 0) {
				System.out.println(string + ": " + string.charAt(string.length() / 2));
			}
		}
		scanner.close();
	}
	
}
