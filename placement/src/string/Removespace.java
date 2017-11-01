package string;

public class Removespace {
	public static void main(String s[]) {
		String s1 = "this     is my      first    class";

		System.out.println(s1.replaceAll("\\s+", " ").trim());

		/*
		 * OR FOR(INT I=0;I<S1.LENGTH;I++) 
		 * { IF(CHARAT(I)==' '&&CHARAT(I+1)==0); 
		 * ELSE {
		 * STR=CHARAT(I); }
		 * 
		 * 
		 */
	}
}
