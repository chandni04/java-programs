package linkedlist;

public class ChandnisLinkedListDemo
{
	
	public static void main(String[] args)
	{
		
		ChandnisLinkedList linkedList = new ChandnisLinkedList();
		linkedList.display();
		linkedList.insertAtStart(10);
		linkedList.insertAtEnd(20);
		linkedList.insertAtStart(30);
		linkedList.insertAtPosition(40, 1);
		linkedList.display();
		System.out.println(linkedList.length);
		
	}

}
