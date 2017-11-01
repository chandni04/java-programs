package conversation;

public class hexadecimaltobinary
{

	public static void main(String[] args)
	{
		  String s = "0123456789ABCDEF";
        String n="bc";
        {
        	        n = n.toUpperCase();
        	        System.out.println(n);
        	        int val = 0;
        	        for (int i = 0; i < n.length(); i++) 
        	        {
        	            char c = n.charAt(i);
        	            int d = s.indexOf(c);
        	            val = 16*val + d;
        	            
        	        }
        	        System.out.println(val);
        }
       
	}

}
