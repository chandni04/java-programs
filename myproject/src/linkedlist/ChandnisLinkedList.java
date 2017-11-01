package linkedlist;

public class ChandnisLinkedList
{

	Node head;
	int length;
	
	public void insertAtStart(int data) {
		Node newNode = new Node(data, null);
		if(head == null) {
			head = newNode;
		}
		else {
			newNode.next = head;
			head = newNode;
		}
		length++;
	}

	
	public void insertAtEnd(int data) {
		Node newNode = new Node(data, null);
		if(head == null) {
			head = newNode;
		}
		else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
		length++;
	}
	
	public void insertAtPosition(int data, int position) {
		Node newNode = new Node(data, null);
		if(head == null) {
			head = newNode;
		}
		if (position > length) {
			position = length;
		}
		Node temp = head;
		for(int i = 1 ; i < position ; i++) {
			temp = temp.next;
		}	
		newNode.next = temp.next;
		temp.next = newNode;
		length++;
	}
	
	public void display() {
		if(head == null) {
			System.out.println("Linked list is empty");
		}
		else {
			Node temp = head;
			while(temp != null) {
				System.out.print(temp.data + " --> ");
				temp = temp.next;
			}
			System.out.println("null");
		}
	}

	public int length() {
		return this.length;
	}
	
}
