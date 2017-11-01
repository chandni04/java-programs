
public class Test {

	public static void main(String[] args) {
	double[] a={10.1,10.2,10.3};
	for(double n:a)
	{
		System.out.println(n);
	}
	double[] y=Test.m1(a);
	int [] z=new int[y.length];
	for(int i=0;i<y.length;i++)
	{
		
		z[i]=(int)y[i];
		System.out.println("z["+i+"]"+z[i]);
		}}
	
	public static double [] m1(double [] x)
	{x[0]=55.1;
	x[1]=55.2;
	return x;
		
	}
}

 