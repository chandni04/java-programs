package recursion;
public class no
{
		public static void main (String s[])
		{
			int n=1;
			no n1=new no();
			n1.number(n);			
		}
		int number(int n)
		{
			if(n<=10)
			{
			System.out.println(n);
			return number(n+1);
			}
		return 1;
		}
}

