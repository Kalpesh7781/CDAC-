package day3;

import java.util.Scanner;

public class BankAccount {
int accountnumber;
float accountbalance;
Scanner ip=new Scanner(System.in);

BankAccount()
{
System.out.println("enter acc number");	
this.accountnumber=ip.nextInt();
System.out.println("enter acc balance");	
this.accountbalance=ip.nextFloat(); 
}

public void deposit()
{
	//Scanner ip=new Scanner(System.in);
	
//System.out.println("enter a account num");
//int num=ip.nextInt();
//if(this.accountnumber==num)
  {
	System.out.println("enter ammount to deposit");
	float amm=ip.nextFloat();
	this.accountbalance=this.accountbalance+amm;
	System.out.println("ammount deposited");
	
  }
}

public void withdraw()
{
	//Scanner ip=new Scanner(System.in);
	
//System.out.println("enter a account num");
//int num=ip.nextInt();
//if(this.accountnumber==num)
  {
	System.out.println("enter ammount to withdraw");
	float amm=ip.nextFloat();
	this.accountbalance=this.accountbalance-amm;
	System.out.println("ammount withdrawn");
	
  }
}

public void display()
{
	System.out.println("balance  in the account is:"+accountbalance);
	
	
}
}
