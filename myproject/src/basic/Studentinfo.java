package basic;

class Studentinfo
{
	public static void main(String s[])
	{
		System.out.println("enter student name");
		java.util.Scanner scn=new java.util.Scanner(System.in);
		String name=scn.next();
		System.out.println("student name="+name);
	    System.out.println("enter id name");
        String id=scn.next();
		System.out.println("student id"+id);
		System.out.println("enter no of subject");
        int sub=scn.nextInt();
		System.out.println("student subjects are "+sub);
	    for (int i=1;i<=sub;i++)
		{
		System.out.println("enter subject1 marks");
        int sub1=scn.nextInt();
		System.out.println("student subject1 "+sub1);
		System.out.println("enter subject2 marks");
        int sub2=scn.nextInt();
		System.out.println("student subject2 "+sub2);
		System.out.println("enter subject3 marks");
        int sub3=scn.nextInt();
		System.out.println("student subject3 "+sub3);
		int total=(sub1+sub2+sub3)/3;
		System.out.println("total marks is "+total);
		}
	}
}