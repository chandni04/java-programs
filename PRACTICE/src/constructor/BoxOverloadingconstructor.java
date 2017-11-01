package constructor;

public class BoxOverloadingconstructor
{
    int height;
    int weidth;
    int length;
	public BoxOverloadingconstructor()
	{
		super();
	}

	public BoxOverloadingconstructor(int height, int weidth, int length)
	{
		super();
		this.height = height;
		this.weidth = weidth;
		this.length = length;
	}
	void display()
	{
		System.out.println("length of box "+length+" height of box "+height+" weidth "
				+ "of box  "+weidth);
	}
	public static void main(String s[])
	{
	BoxOverloadingconstructor b1=new BoxOverloadingconstructor(1,2,3);
    b1.display();
	}
}
