package linkedlist;

public class countelement
{
	int count = 0;
	Node first;

	public Node end(int data, Node first)
	{
		Node newnode = new Node(data, null);
		// newnode.next=null;
		Node temp = first;
		while (temp.next != null)
		{
			temp = temp.next;
		}

		temp.next = newnode;
		return first;
	}
	public Node insertatPosition(int data,Node first,int position)
	{
		Node newnode = new Node(data, null);
		Node temp=first;
		for(int i = 1 ; i < position ; i++) {
			temp = temp.next;
		}
		newnode.next = temp.next;
		temp.next = newnode;
		return first;
	}

	public Node insert(int data, Node first)
	{
		Node newnode = new Node(data, null);
		newnode.next = first;
		first = newnode;
		return first;
	}

	void Display(Node first)
	{
		Node temp = first;
		while (temp != null)
		{
			count++;
			System.out.print(temp.data + "-->");
			temp = temp.next;
		}
		System.out.print("null");
		System.out.println();
	}

	int length()
	{
		return count;
	}

	public static void main(String[] args)
	{
		countelement ce = new countelement();
		Node last = new Node(40, null);
		Node second = new Node(20, last);
		Node first = new Node(10, second);
		first = ce.insert(30, first);
		first = ce.end(50, first);
		ce.Display(first);
		 
		System.out.println("length of linked list is   " + ce.length());
		first = ce.insertatPosition(60, first, 2);
		ce.Display(first);
	}

}