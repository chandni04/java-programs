class New2
{
 public static void main(String s[])
 {
	 int num=100;
	 for(int i=1;i<=num;i++)
	 {
		  boolean flag=true;
		 for(int j=2;j<=i;j++)
		 {
			
			 if(i%j==0)
				 flag=false;
					break;
		 }
		 if(flag==true)
		 System.out.println(i);	
	 }
  }
}