package day2;

import java.util.Scanner;

public class AccountMain
{

	public static void main(String[] args) 
	{
		 
		Account[] a=AccountManagement.createAccountArray();
		 
		Scanner ip=new Scanner(System.in);
		boolean j=true;
		while(j)
		{
			System.out.println();
			System.out.println("enter choice ");
			 
			System.out.println("1: display");
			System.out.println("2: update ");
			System.out.println("3: delete");
			System.out.println("4: total balance");
			System.out.println("5: create account");
			System.out.println();
		int k=ip.nextInt();
		switch(k)
		{
		case 1:
			AccountManagement.displayAccountArray(a);
			break;
		case 2:
			AccountManagement.updateAccount(a);
			break;
		case 3:
			AccountManagement.deleteAccount(a);
			break;
		case 4:
			AccountManagement.findTotalBalance(a);
			break;
		case 5:
			AccountManagement.createAccount(a);
			break;
		default:
			System.out.println("invalid entry");
		     j =false;
		
		}
		}
		 
	}
}
