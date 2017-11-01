package comparator;

import java.util.*;

class Employee implements Comparable<Employee>
{
	String name;
	int id;
	double sal;

	Employee(String name, int id, double sal)
	{
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
	}

	@Override
	public int compareTo(Employee emp)
	{
		return name.compareTo(emp.name);
	}
}

class Idcomp implements Comparator<Employee>
{
	public int compare(Employee emp1, Employee emp2)
	{
		return emp1.id - emp2.id;
	}
}

class Salcomp implements Comparator<Employee>
{
	public int compare(Employee o1, Employee o2)
	{
		if (o1.sal > o2.sal)
		{
			return 1;
		}
		if (o1.sal < o2.sal)
		{
			return -1;
		}
		return 0;
	}
}

public class Appcomparator
{

	public static void main(String s[])
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("enter number of employee");
		int n = scn.nextInt();
		Employee[] arr = new Employee[n];
		for (int i = 0; i < arr.length; i++)
		{
			System.out.println("enter name and salary from emp" + (i + 1));
			String Empname = scn.next();
			double empsal = scn.nextDouble();
			arr[i] = new Employee(Empname, i, empsal);
			System.out.println("enter sorting parameter");
		}
		System.out.println("enter soring parameter");
		String s1 = scn.next();
		if (s1.equalsIgnoreCase("name"))
			Arrays.sort(arr);
		else if (s1.equalsIgnoreCase("id"))
			Arrays.sort(arr, new Idcomp());
		else if (s1.equalsIgnoreCase("sal"))
			Arrays.sort(arr, new Salcomp());
		else
		{
			display(arr);
		}
	}

	static void display(Employee[] arr)
	{
		 System.out.println(" name ----");
		
	}

}
