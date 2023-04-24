package day2;

import java.util.Scanner;

public class AccountManagement
{

	
	static Account[] createAccountArray()
	{
        Account[] a = new Account[3];
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println("enter your detail of here: no, name, bal");
			a[i] = new Account();
			a[i].readAccount();
					
		}
		
		return a;
		
		
	}
	
	
	static void createAccount(Account[] a)
	{
		System.out.println("proceeding to create new acc: enter details ");
		 
		for(int i=0;i<a.length;i++)
		{
			if(a[i].cid ==0)
			 {a[i].readAccount();
					break;}

		}
	}

	
	
		
	static void displayAccountArray(Account[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i].cid !=0)
			a[i].displayAccount();
					
		}
	}


	public static void findTotalBalance(Account[] a) 
	{
	
        float total_balance=0.0f;
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i].cid !=0)
				
			   {total_balance = total_balance+a[i].balance;}
			
			
		}
		
		System.out.println("toal balance of all account: "+total_balance);
		
		
	}


	public static void deleteAccount(Account[] a)
	{
		Scanner s = new Scanner(System.in);
	   System.out.println("enter the accno to delete");
	   int account = s.nextInt();
		
		for(int i=0;i<a.length;i++)
		{
		    if(a[i].cid == account)
			{
				a[i].cid= 0;
			}
			
		}
		
		System.out.println("account deleted");
		
	}
	
	public static void updateAccount(Account[] a)
	{
		Scanner s = new Scanner(System.in);
		 System.out.println("enter cid  to update");
		 int account = s.nextInt();
		 System.out.println("enter the bal to update");
		   float nbalance = s.nextFloat();
		for(int i=0;i<a.length;i++)
		{
		 
			if(a[i].cid ==account )
			{
				a[i].balance=nbalance;
			}
			 
			
			
			
		}
		
 		
	}
	
}
