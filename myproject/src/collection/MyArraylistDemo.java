 package collection;
public class MyArraylistDemo
{
	
public static void main(String s[])
   {
	   int size;
	MyArraylist ma= new MyArraylist();
		ma.add(10);	
		ma.add("mango");
		ma.add(20);
		ma.add(30);
		ma.add(30);
		ma.add(40);
		ma.add(50);
		ma.add(60);
		ma.add("banana");
		ma.add("apple");
		ma.add("pineapple");
		if(ma.contains(20))
		{
			System.out.println("element contain");
		}
		else
		{
			System.out.println("element didnt found");
		}
		System.out.println("size of my Array list is ="+ma.size());
		System.out.println("my Array list is="+ma.toString());
		System.out.println("get element of index "+ma.getelement(1));
   }
}
