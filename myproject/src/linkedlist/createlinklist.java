package linkedlist;

public class createlinklist
{
	static void Display(Node first)
	{
		while(first!=null)
		{
			System.out.print(first.data+"-->");
			first=first.next;
		}
	
		System.out.print("null");
	}
  public static void main(String s[]){
	  
     Node last=new Node(40,null);
     Node second=new Node(20,last);
	 Node first=new Node(10,second);
	 Display(first);
  }
}
 
