package day3;

import java.util.Scanner;

public class SavingAccount extends BankAccount{
float interest=0.07f;

SavingAccount()
{
//System.out.println("enter duration");
//Scanner ip=new Scanner(System.in);
//float t=ip.nextFloat();

	
float inter=(super.accountbalance*interest);
super.accountbalance=super.accountbalance+inter;
System.out.println(" interest has been added");

//System.out.println("interest added");
}
}
