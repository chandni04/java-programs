package String;

public class compareString
{
	public static void main(String s[])
   {
	   String s1="hello chandni";
	   String s2="helo chandni";
	   int len1=s1.length();
	   int len2=s2.length();
	   boolean Stringequal=true;
	   if(len1!=len2)
		     Stringequal= false;
		  else{
		  for(int i=0;i<s1.length();i++)
		  {
			  {
				  if(s1.charAt(i)!=s2.charAt(i))
					  Stringequal=false;
			  }
			  Stringequal=true;
			  
		  }
	}
	   if(Stringequal)
	   {
		   System.out.println("String is equal");
	   }
	   else 
	   {
		  System.out.println("string is not equal"); 
	   }
	 
	
	}
   
}
