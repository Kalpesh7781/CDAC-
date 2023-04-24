package day8;

import java.util.Scanner;
 class  insufficientFundsException extends Exception{
	insufficientFundsException()
	{
		System.out.println("no sufficient funds in your account");
	}
}

public class UserDefinedException {
static int acc_no;
static String name;
static double balance;

Scanner ip=new Scanner(System.in);
void dispDetails()
{
System.out.println("acc no:"+acc_no+" name: "+name+" balance: "+balance);	
}
void credit()
{
System.out.println("enter ammt to credit");
double ammt=ip.nextDouble();
 balance+=ammt;
System.out.println(ammt+" ammt is credited and  balance in your accont :"+ balance);
}
void getbalance()
{
System.out.println("balance in your accont: "+balance);	
}
void withdraw() throws insufficientFundsException
{
	System.out.println("enter ammt to withdraw");
    double ammt=ip.nextInt();
	if (balance<ammt)
	{
		throw new insufficientFundsException();
	}
	else {
            
           balance-=ammt;
           System.out.println(ammt+" ammt sucessfully withdrawn");
           System.out.println("balance in your account :"+balance);
          }

}
public static void main(String[] args) {
	acc_no=15;
	name="kalpesh";
	balance=1400;
	Scanner ip=new Scanner(System.in);
	boolean flag=true;
	UserDefinedException u=new UserDefinedException();
	while(flag)
	{
		System.out.println("enter ur choice");
		System.out.println("1: disp details");
		System.out.println("2: disp balance");
		System.out.println("3: withdraw money");
		System.out.println("4: credit money");
		System.out.println("5: exit");
		int ch=ip.nextInt();
		switch(ch)
		{
		case 1:
			u.dispDetails();
			break;
		case 2:
			u.getbalance();
			break;
		case 3:
			try {
				u.withdraw();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			break;
		case 4:
			u.credit();
			break;
			default:
				flag=false;
			
			
		
		}
	}
}
}
