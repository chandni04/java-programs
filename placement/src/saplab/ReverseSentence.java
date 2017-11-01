package saplab;

import java.util.Scanner;

public class ReverseSentence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String str = scanner.nextLine();
		String array[] = str.split(" ");
		String output = "";
		for(int i = array.length - 1 ; i >= 0 ; i--) {
			output = output + " " + array[i]; 
		}
		System.out.println(output);
		scanner.close();
		
	}
	
}
