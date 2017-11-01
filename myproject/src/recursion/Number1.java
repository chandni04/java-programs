package recursion;
public class Number1 {

	public static void main(String s[]) {
		m1(1);
	}
	static void m1(int i) {
		System.out.println(i);
		if (i >= 3)
			return;
		m1(i + 1);
	}
}
