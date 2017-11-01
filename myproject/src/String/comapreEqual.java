package String;

public class comapreEqual

{
	public static void main(String s[])
	{
		String s1=new String("hello chandni");
		String s2=new String("hello chandni");
		String s3="hello rushi";
		String s4="hello rushi";
		String s5="hello chandni";

		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s3==s4);
		System.out.println(s1.compareTo(s2));
		System.out.println(s1.compareTo(s4));
		System.out.println(s2==s5);
	}

}
