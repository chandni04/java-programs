package recursion;

public class Recursion1
{
  static void p(int count)
  {
	   
	  if(count>5)
	   return;
	  System.out.print(" "+count);
	  p(++count);
	  System.out.print(" "+count);
	  
  }
  public static void main(String s[])
  {
	  p(1);

  }
}
