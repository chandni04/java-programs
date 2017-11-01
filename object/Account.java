import java.util.Scanner;
class Testclass
{    
	double bal;
	void displaybal()
	{
		System.out.println("current balance= "+bal+"rs");
	}
	void withdrawel(int amt)
	{
		if(amt>bal)
		{
		System.out.println("less amount");
	    return;
	    }		
	    bal-=amt;
		System.out.println(bal+"is withdrawn");
	}
}
class Account
{
	public static void main(String s[])
	{
	 Scanner scn=new Scanner(System.in);
	 System.out.println("enter name ");
	 String  name =scn.nextLine();
	 System.out.println("your name is"+name);
	 System.out.println("enter branch");
	 String branch =scn.nextLine();
	 System.out.println("your branch is"+branch);
	 System.out.println("enter account no ");
	 long acno =scn.nextLong();
	 System.out.println("account no"+acno);
	 Testclass tc=new Testclass();
	 tc.bal=30000;
	 int repeat;
	 do
	 {
		 System.out.println("1-see balance");
		 System.out.println("2-withdraw ammount ");
		 System.out.println("enter ypur option");
		 int option=scn.nextInt();
		 switch(option)
		 {
			 case 2:
			 {
				 System.out.println("enter amount");
				 int amt=scn.nextInt();
				 tc.withdrawel(amt);
			 }
		    case 1:
			{
				tc.displaybal();
				break;
			}
			default:
			System.out.println("invalid option");
	    }
	   System.out.println("press 1 to repeat and 0 to exit");
	  repeat=scn.nextInt();
	 }
	 while(repeat==1);{
		 System.out.println("thanks for using atm");
	 }
	}
}
