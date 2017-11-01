package saplab;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BiggestPalindrom {

	private static int palindromLengths;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		palindromLengths = 0;
		List<String> subStrings = findAllSubStrings(str);
		System.out.println(subStrings);
		List<String> biggestPlaindrom = findBiggestPalindrom(subStrings);
		System.out.println(palindromLengths);
		System.out.println(biggestPlaindrom);
		scanner.close();
	}

	private static List<String> findBiggestPalindrom(List<String> subStrings) {
		int maxLength = 0;
		List<String> palindroms = new ArrayList<>();
		for (String subStr : subStrings) {
			if (isPalindrome(subStr)) {
				palindroms.add(subStr);
				if (subStr.length() > maxLength) {
					maxLength = subStr.length();
				}
			}
		}
		palindromLengths = palindroms.size();
		System.out.println(palindroms);
		List<String> biggestPalindromes = new ArrayList<>();
		for (String palindrome : palindroms) {
			if (palindrome.length() == maxLength) {
				biggestPalindromes.add(palindrome);
			}
		}
		return biggestPalindromes;
	}

	private static boolean isPalindrome(String subStr) {
		if (subStr.length() < 2) {
			return false;
		}
		int begin = 0;
		int end = subStr.length() - 1;
		int middle = (begin + end) / 2;
		for (int i = 0; i <= middle; i++) {
			if (subStr.charAt(begin) == subStr.charAt(end)) {
				begin++;
				end--;
			} else {
				return false;
			}
		}
		return true;
	}

	private static List<String> findAllSubStrings(String str) {
		List<String> subStrings = new ArrayList<>();
		int length = str.length();
		for (int i = 0; i < str.length(); i++) {
			for (int j = 1; j <= length - i; j++) {
				String subString = str.substring(i, i + j);
				subStrings.add(subString);
			}
		}
		return subStrings;
	}

}