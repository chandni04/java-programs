package linkedlist;
public class Insertatbeginning
{ 
	 Node first;
	public void insert(int data)
	{
		Node newnode=new Node(data,null);
		newnode.next=first;
		first=newnode;
	}
}
