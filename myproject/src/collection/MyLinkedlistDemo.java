package collection;

public class MyLinkedlistDemo
{
	public static void main(String s[])
	{
		MyLinkedList md = new MyLinkedList();
		for(int i = 1 ; i <= 10 ; i++) {
			md.add(i);
		}
		System.out.println(md);
	}
}
