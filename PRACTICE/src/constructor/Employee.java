package constructor;

public class Employee
{
	int Employeeid;
	String ename;
	int salary;
   Employee()
   {
	  Employeeid =100;
	  ename="akash maheswari";
	  salary=100000;
   }
   Employee(int id,String nm,int sal)
   {
	   Employeeid=id;
	   ename=nm;
	   salary=sal;
	   
   }
    int getEmpId()
   {
	   return Employeeid;
   }
    void SetEmpid(int Employeeid)
    {
    	this .Employeeid=Employeeid;
    }
    String getEmpname()
    {
    	return ename;
    }
    void Setename(int Ename)
    {
    	this.ename=ename;
    }
    int getsalary()
    {
 	   return salary;
    }
     void Setsalary(int salary)
     {
     	this.salary=salary;
     }
	public static void main(String[] args)
	{
		Employee e1=new Employee();
		System.out.println("employee id is"+e1.getEmpId());
		System.out.println("employee name is"+e1.getEmpname());
		System.out.println("employee salary is"+e1.getsalary());
		Employee e2=new Employee(101,"chandni",12000);
		System.out.println("employee id is"+e2.getEmpId());
		System.out.println("employee name is"+e2.getEmpname());
		System.out.println("employee salary is"+e2.getsalary());

	}

}
