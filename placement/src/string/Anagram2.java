package string;
public class Anagram2
{	
	public static void main(String[] args)
	{
		String array1[] = {"Mother In Law", "keEp", "SiLeNt CAT", "Debit Card", "School MASTER", "DORMITORY", "ASTRONOMERS", "Toss", "joy"};	
		String array2[] = {"Hitler Woman", "peeK", "LisTen AcT", "Bad Credit", "The ClassROOM", "Dirty Room", "NO MORE STARS", "Shot", "enjoy"};
		
		for(int i = 0 ; i < array1.length ; i++) {
			boolean result = isAnagram(array1[i], array2[i]);
			if(result) {
				System.out.println(array1[i] + " and " + array2[i] + " are anagrams");
			}
			else {
				System.out.println(array1[i] + " and " + array2[i] + " are not anagrams");
			}
		}
	}
	private static boolean isAnagram(String str1, String str2)
	{
		
		str1 = str1.replaceAll("\\s", "");
		str2 = str2.replaceAll("\\s", "");
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		int length = str1.length();
		
/*		int space1 = 0;
 * 
		int space2 = 0;
		
		for(int i = 0 ; i < str1.length() ; i++) {
			if(str1.charAt(i) == ' ') {
				space1++;
			}
		}
		
		for(int i = 0 ; i < str2.length() ; i++) {
			if(str2.charAt(i) == ' ') {
				space2++;
			}
		}
		if (str2.length()- space2 != length - space1)
		{
			return false;
		}
*/
		if(str2.length() != length) {
	    	return false;
		}
		
//		boolean visited[] = new boolean[str2.length()];
		
		boolean visited[] = new boolean[length];
		
		boolean charFound;
		for (int i = 0; i < length; i++)
		{
			char ch = str1.charAt(i);
			charFound = false;

//			if(ch !=' ') {
//				for (int j = 0; j < str2.length(); j++)
				for (int j = 0; j < length; j++)
				{

					if (str2.charAt(j) == ch && !visited[j])
					{
						visited[j] = true;
						charFound = true;
						break;
					}

				}
							
				if(!charFound) {
					return false;
				}

//			}	
			
		}
		return true;
	}

}
