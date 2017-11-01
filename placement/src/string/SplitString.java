package string;

public class SplitString {

	public static void main(String[] args) {

		String s="java is an oop";
		String[] arr=mySplit(s);
		for(String s1:arr){
			System.out.println(s1);

	}
	}
	public static String[] mySplit(String s){
		char[] charArr=s.toCharArray();
		int count=0;
		for(char c:charArr)
		{
			if(c==' '){
				count++;
			}
		}
		String[] strArr=new String[count+1];
		String s1;
		int j=0;
		for(int i=0;i<strArr.length;i++){
			s1="";
			while(j<charArr.length && charArr[j]!=' '){
				s1+=charArr[j];
				++j;
			}
			strArr[i]=s1;
			++j;
		}
		return strArr;
		
	}

}
 