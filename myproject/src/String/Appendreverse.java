package String;

public class Appendreverse
{
	      public static void main(String s[])
	      {
	    	  StringBuilder sb=new StringBuilder();
	    	  String s1="hello";
	    	  
	    	  for(int i=s1.length()-1;i>=0;i--)
	    	  {
	    		  sb.append(s1.charAt(i));
	    		  
	    	  }
	    		 System.out.println(sb) ;

	      }
	

}
