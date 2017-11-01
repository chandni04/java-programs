package collection;
public class MysetlistDemo
{
	
public static void main(String s[])
   {
	   	MySet ms= new MySet();
		ms.add(10);	
		ms.add("mango");
		ms.add(20);
		ms.add(30);
		ms.add(30);
		ms.add(40);
		ms.add(50);
		ms.add(60);
		ms.add(60);
		ms.add("banana");
		ms.add("apple");
		ms.add("pineapple");
		ms.add("banana");
		if(ms.contains(20))
		{
			System.out.println("element contain");
		}
		else
		{
			System.out.println("element didnt found");
		}
		System.out.println("size of my Array list is ="+ms.size());
		System.out.println("my Array list is="+ms.toString());
		System.out.println("get element of index "+ms.getelement(1));
   }
}
