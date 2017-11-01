class Equality {

	public static void main(String []s) {
		Integer a = Integer.valueOf(100);
		Integer b = Integer.valueOf(100);
		if(a == b) {
			System.out.println("a and b are equal");
		}
		else {
			System.out.println("a and b are not equal");
		}		
		Integer c=100, d=100;
		System.out.println(c == d);
		Integer e = 128, f = 128;
		System.out.println(e == f);
	}

}