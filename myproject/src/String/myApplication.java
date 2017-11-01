package String;

public class myApplication
	{
		public static void main(String s[])
		{
		MyString m1 = new MyString("abc");
		MyString m2 = new MyString("bcd");

		if(m1.equals(m2))
		{
			System.out.println("equal");
		}
		else
		{
			System.out.println("not equal");
		}
	    }
  }

