package Abstract;
abstract class Bike
{
	abstract void start();
	abstract void accelarate();
	 void run()
	    {
			System.out.println("honda run");
		}
}

class Honda extends Bike
{
	void start()
	{
		System.out.println("honda start");
	}
	void accelarate()
	{
		System.out.println("honda accelerated");
	}
}
class Bajaj extends Bike
{
	 void start()
	{
		System.out.println("honda start");
	}
	void accelarate()
	{
		System.out.println("honda accelerated");
	}
	 
}	

public class AbstractDemo
{
	public static void main(String s[])
	{
		// AbstractDemo ad =new AbstractDemo();
		 Honda h=new Honda();
		 h.start();
		 h.accelarate();
		 Bajaj b=new Bajaj();
		 b.start();
		 b.accelarate();
	}
}

 