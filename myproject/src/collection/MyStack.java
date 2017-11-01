 package collection;

public class MyStack
{
	int top;
	int size;
	int array[];
	public MyStack(int size)
	{
		this.size = size;
		top = 0;
		array = new int[size];		
	}
	
	public void push(int data) {
		if(top >= size) {
			System.out.println("Stack overflow");
		}
		else {
			array[top] = data;
			top++;
		}
	}
	
	public int pop() {
		int result = -1;
		if(top <= 0) {
			System.out.println("Stack underflow");
		}
		else {
			top--;
			result = array[top];
		}
		return result;
	}
	
	public void display() {
		for(int i = 0 ; i < top ; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}
	
	public int length() {
		return top;
	}
}
