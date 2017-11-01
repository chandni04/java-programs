package collection;

public class MyQueueDemo
{
	public static void main(String[] args)
	{
		
		MyQueue queue = new MyQueue(5);
		queue.poll();
		
		queue.push(1);
		queue.push(2);
		queue.push(3);
		queue.push(4);
		queue.push(5);
		queue.display();
		System.out.println(queue.poll());
//		queue.push(6);
		queue.display();
	}

}
