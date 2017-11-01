package saplab;

import java.util.Scanner;

public class WordReverse {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String result = reverseSentence(str);
		System.out.println(result);
		scanner.close();
		
	}

	private static String reverseSentence(String str) {
		String array[] = str.split(" ");
		String result = "";
		for(String subString : array) {
			result = result + " " + reverseWord(subString);
		}
		return result;
	}

	private static String reverseWord(String string) {
		String reversedWord = "";
		for(int i = string.length() - 1 ; i >= 0 ; i--) {
			reversedWord += string.charAt(i);
		}
		return reversedWord;		
	}
	
}
