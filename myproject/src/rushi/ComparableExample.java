package rushi;

import java.util.Arrays;

class Account implements Comparable<Account>{

	private double balance;
	public Account(double balance)
	{
		this.balance = balance;
	}

	@Override
	public int compareTo(Account acc)
	{
		if(this.balance < acc.balance) {
			return 1;
		}
		if(this.balance > acc.balance) {
			return -1;
		}
		return 0;
	}

	// ac2 ac1 ac3
	// 200 100 300
	// ac2.compareTo(ac1)
	// 200 100 300
	// 200 300 100
	// 300 200 100
	
	@Override
	public String toString()
	{
		return "Account [balance=" + balance + "]";
	}
	
}

public class ComparableExample
{
	public static void main(String[] args)
	{
		
		Account account1 = new Account(100);
		Account account2 = new Account(200);
		Account account3 = new Account(300);
		Account[] accounts = new Account[3];
		accounts[0] = account2;
		accounts[1] = account1;
		accounts[2] = account3;
		Arrays.sort(accounts);
		
		for(int i = 0 ; i < accounts.length ; i++) {
			System.out.println(accounts[i]);
		}
		
	}

}
