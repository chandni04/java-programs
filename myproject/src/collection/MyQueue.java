package collection;

public class MyQueue
{

	int size;
	int front;
	int end;
	int array[];

	public MyQueue(int size)
	{
		this.size = size;
		front = -1;
		end = -1;
		array = new int[size];
	}

	public void push(int data)
	{
		if (end == -1)
		{
			front = 0;
			end = 0;
			array[end] = data;
		} else if (end >= size)
		{
			System.out.println("Queue overflow");
		} else
		{
			end++;
			array[end] = data;
		}
	}

	public int poll()
	{
		int result = -1;
		if (front < 0)
		{
			System.out.println("Queue underflow");
		} else
		{
			result = array[front];
			if (front == end)
			{
				front = -1; // after poping queue become empty to reset it to
							// zero
				end = -1; // front should become ++
			} else
			{
				front++;

				// as one removered from end so anothor space is
				// created for front element to enter
			}
		}
		return result;
	}

	public int peek()
	{
		int result = -1;
		if (front < 0)
		{
			System.out.println("Queue underflow");
		} else
		{
			result = array[front];
		}
		return result;
	}

	public boolean isEmpty()
	{
		return front == -1;
	}

	public boolean isFull()
	{
		return front == 0 && end == size - 1;
	}

	public void display()
	{
		for (int i = front; i <= end; i++)
		{
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

}
