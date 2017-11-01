package saplab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggestSubstring {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		List<String> subStrings = findAllSubStrings(str);
		System.out.println(subStrings);
		List<String> biggestSubStrings = findBiggestSubString(subStrings);
		System.out.println(biggestSubStrings);
		scanner.close();
	}

	private static List<String> findBiggestSubString(List<String> subStrings) {
		int maxLength = 0;
		List<String> validSubStrings = new ArrayList<>();
		for(String subString : subStrings) {
			boolean matchFound = false;
			for(int i = 0 ; i < subString.length(); i++) {
				char ch = subString.charAt(i);
				for(int j = i + 1 ; j < subString.length() ; j++) {
					if(ch == subString.charAt(j)) {
						matchFound = true;
						break;
					}
				}
			}
			if(!matchFound) {
				validSubStrings.add(subString);
				if(subString.length() > maxLength) {
					maxLength = subString.length();
				}
			}
		}
		List<String> biggestSubStrings = new ArrayList<>();
		for(String subStr : validSubStrings) {
			if(subStr.length() == maxLength) {
				biggestSubStrings.add(subStr);
			}
		}
		return biggestSubStrings;
		
	}

	private static List<String> findAllSubStrings(String str) {
		List<String> subStrings = new ArrayList<>();
		int length = str.length();
		for(int i = 0 ; i < str.length() ; i++) {
			for(int j = 1 ; j <= length - i ; j++) {
				String subString = str.substring(i, i+j);
				subStrings.add(subString);
			}
		}
		return subStrings;
	}
	
}
