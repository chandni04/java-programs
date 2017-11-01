package collection;

public class MyLinkedList
{
	Node head;
	int size;

	// n1 -> N2 -> N3 -> NULL
	// N1 -> N2 -> N3 -> N4 -> NULL
	public void add(int data)
	{
		Node newNode = new Node(data, null);
		if (head == null)
		{
			head = newNode;
		}
		else {
			
			Node tempNode = head;
			while (tempNode.next != null)
			{
				tempNode = tempNode.next;
			}
			tempNode.next = newNode;// LINKING
		}
		size++;
	}

	public int size()
	{
		return size;
	}

	public int getelement(int index)
	{
		Node tempNode = head;
		int count = 0;
		while (tempNode != null)
		{
			if (count == index)
			{
				return tempNode.data;
			}
			tempNode = tempNode.next;
			count++;
		}
		return -1;

		/*
		 * Node p=head; for(int i=0;i<index;i++) {
		 * 
		 * } return data;
		 */

	}

	public boolean contains(int data)
	{
		Node tempNode = head;
		while (tempNode != null)
		{
			if (tempNode.data == data)
			{
				return true;
			}
			tempNode = tempNode.next;
		}
		return false;
	}

	@Override
	public String toString() {
		String result = "[";
		Node tempNode = head;
		while(tempNode != null) {
			result += " " + tempNode.data;
			tempNode = tempNode.next;
		}
		result += " ]";
 		return result;
	}
	
}
