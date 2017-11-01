package String;

public class reverseword
{
	public static void main(String s[])
     {
    	 String s1="hello chandni";
    	 String words[]=s1.split("\\s");
    	 String reversestring="";
    	 String  Stringword="";
		for( int i=0;i<words.length;i++)
		{
		        String word = words[i];
		        String reverseword="";

	    	        System.out.println(words[i]);
	    		 
		    	 	for(int j=word.length()-1;j>=0;j--)
				    	 {
				    		  reverseword =reverseword+word.charAt(j);
				    	 }
		    
		
		    	 	reversestring=reversestring+reverseword+" ";	 	
		}
		
    	 System.out.println(reversestring);
     }
	
}

