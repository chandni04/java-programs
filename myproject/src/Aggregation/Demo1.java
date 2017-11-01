package Aggregation;

class Address
{
	String city;
	String state;
		Address(String  c,String s)
		{
			city=c;
			state=s;
		}
		void display()
		{
		System.out.println("Address ="+city +" ,  "+state);
		}
	
}
 class Student
{
	String name;
	int rollno; 
	Address adres;
	Student(String n,int r,Address a)
	{
		 name=n;
		 rollno=r;
		 adres=a;
	}
	void displayStudent()
	{
		System.out.println("name="+name);
		System.out.println("rollno  ="+rollno);
		//System.out.println(adres);
		adres.display();
	}
}
public class Demo1
{
	public static void main(String s[])
	{
		Address a1=new Address("bangalore","karnataka");
		Student s1=new Student("rushi",5,a1);
		s1.displayStudent();
	}
}