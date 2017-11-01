package constructor;

public class copyRectangle
{
	int length;
	int breadth;
	
	public copyRectangle(int l, int b)
	{
		super();
		length = l;
		breadth = b;
	}

	public copyRectangle(copyRectangle R1)
	{
		this.length = length;
		this.breadth = breadth;
	}
	void display()
	{
		System.out.println(length+","+breadth);
	}

	public static void main(String[] args)
	{
		
		copyRectangle c1=new copyRectangle(5,5);
		copyRectangle c2=new copyRectangle(c1);
		c1.display();
		c2.display();
	}

}
