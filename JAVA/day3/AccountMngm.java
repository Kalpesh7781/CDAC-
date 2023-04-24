package day3;

import java.util.Scanner;

public class AccountMngm {

 public static void main(String[] args) {
	System.out.println("enter your account type");
	System.out.println("1: checking accunt");
	System.out.println("2: saving account");
	Scanner ip=new Scanner(System.in);
	int k=ip.nextInt();
	switch (k)
	{
	case 1:
		CheckingAccount c1=new CheckingAccount();
		boolean m= true;
		while (m)
		{
			System.out.println("enter choice");
			System.out.println("1: deposit");
			System.out.println("2: withdraw");
			System.out.println("3: balance");
			int j=ip.nextInt();
			switch(j)
			{
			case 1:
				c1.deposit();
				break;
			case 2:
				c1.withdraw();
				break;
			case 3:
				c1.display();
				break;
			default:
				m=false;
			}
		}
		break;
	case 2:
		SavingAccount c2=new SavingAccount();
		boolean q= true;
		while (q)
		{
			System.out.println("enter choice");
			System.out.println("1: deposit");
			System.out.println("2: withdraw");
			System.out.println("3: balance");
			int j=ip.nextInt();
			switch(j)
			{
			case 1:
				c2.deposit();
				break;
			case 2:
				c2.withdraw();
				break;
			case 3:
				c2.display();
				break;
			default:
				q=false;
			}
		}
		
		 
		break;
	default:
		break;
		
		
	
	}
}
 
 
}
