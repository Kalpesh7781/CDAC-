package day2;

import java.util.Scanner;

public class Account
{

	int cid;
	String cname;
	float balance;
	
//	public Account(int cid, String cname, float balance) 
//	{
//		
//		this.cid = cid;
//		this.cname = cname;
//		this.balance = balance;
//	}
	 
	
	 

	public void readAccount() {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		cid = s.nextInt();
		cname = s.next();
		balance = s.nextInt();
		
		
		
	}

	public void displayAccount() {
		System.out.println("account id: "+cid+"  account holder name: "+cname+"  account balance:"+balance);
		// TODO Auto-generated method stub
		
	}
	
	
	
}
