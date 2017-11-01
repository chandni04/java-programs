package saplab;

import java.util.Scanner;

public class StringSorting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();

		String array[] = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (compareWithLength(array[i], array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		String output = "";

		for (int i = 0; i < array.length; i++) {
			output = output + " " + array[i];
		}
		System.out.println(output);
		array = str.split(" ");
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (compareWithoutLength(array[i], array[j]) > 0) {
					String temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
		}
		output = "";
		for (int i = 0; i < array.length; i++) {
			output = output + " " + array[i];
		}
		System.out.println(output);
		scanner.close();
	}

	private static int compareWithoutLength(String s1, String s2) {
		
		int length = s1.length();
		if(s2.length() < length) {
			length = s2.length();
		}
		
		for(int i = 0 ; i < length ; i++) {
			char ch1 = s1.charAt(i);
			char ch2 = s2.charAt(i);
			if(ch1 != ch2) {
				return ch1-ch2;
			}
		}
		return s1.length() - s2.length();
		
	}
	
	private static int compareWithLength(String s1, String s2) {
		if (s1.length() > s2.length()) {
			return 1;
		}
		if (s1.length() < s2.length()) {
			return -1;
		}
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) < s2.charAt(i)) {
				return -1;
			}
		}
		return 1;
	}
	
}