
package string;

public class Panagram
{
	public static void main(String[] args)
	{
		String str1 = " Mr. Jock, TV quiz PhD, bags few lynx";
		
		boolean panagram = ispanagram(str1);
		if(panagram)
		{
			System.out.println("string is panagram");
		}
		else
		{
			System.out.println("it is not a panagram");
		}
	}

	private static boolean ispanagram(String str1)
	{

		str1 = str1.replaceAll("\\s", "");
		str1 = str1.toLowerCase();
		int length = str1.length();
		System.out.println("String in lowercase    "+ str1);

		boolean visited[] = new boolean[26];
 
		
		for(int i = 0 ; i < length ; i++) {
			char ch = str1.charAt(i);
			if(ch >= 97 && ch <= 122) {
				visited[ch-97] = true;
			}
		}
		
		for(int i = 0 ; i < visited.length ; i++) {
			if(!visited[i]) {
				return false;
			}
		}
		return true;
	}

}
 


