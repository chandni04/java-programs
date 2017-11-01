class Studentinfo2
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
		
		int marks[] = new int[sub+1];
		int totalMarks = 0;
	    for (int i=1;i<=sub;i++)
		{
			System.out.println("enter subject" + i + " marks");
			marks[i] = scn.nextInt();
			totalMarks += marks[i];
		}
		System.out.println("total marks: "+ totalMarks);
		int averageMarks = totalMarks / sub;
		System.out.println("average marks: "+ averageMarks);
	}
}