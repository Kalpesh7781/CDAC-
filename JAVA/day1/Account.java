package day1;
import java.util.*;

public class Account {
int accno;
String accname;
int ammount;

public void getinfo()
{
	System.out.println("Enter the detail");
	System.out.println("enter acc num");
	
	Scanner ip=new Scanner(System.in);
	accno=ip.nextInt();
	System.out.println("enter acc holder name");
	accname=ip.next();
	ammount=ip.nextInt();
	
	}
public void showinfo()
{
System.out.println("your details are:  ");
System.out.println("enter acc num");
System.out.println("account number: "+accno);
 
System.out.println("account holder name: "+accname);
}
public void withdraw()
{
Scanner ip=new Scanner(System.in);
System.out.println("enter ammount to withdraw");
int wammt=ip.nextInt();
ammount=ammount-wammt;
showinfo();
System.out.println("balance ammount: "+ammount);
}

public void bal()
{
showinfo();
System.out.println("balance ammount: "+ammount);
}

 public void credit()
{
Scanner ip=new Scanner(System.in);
System.out.println("enter ammount to deposit");
int cammt=ip.nextInt();
ammount=ammount+cammt;
showinfo();
System.out.println("balance ammount: "+ammount);
}
public void fix_deposite()
{
	Scanner ip=new Scanner(System.in);
System.out.println("enter ammt :");	
int amm=ip.nextInt();
double r=5.25;
System.out.println("tenure in years: ");
int tenure=ip.nextInt();
double si=(amm*r*tenure)/100;
System.out.println("ammount after "+tenure+"years is : "+(amm+si));
}
	public static void main(String[] args) {
		Account a1=new Account();
		a1.getinfo();
		
		/*System.out.println("press 1: check balance"
				+ "press  2: withdraw"
				+"press 3: deposit"
				+"press 4: fixed deposit");*/
		Scanner ip=new Scanner(System.in);
		while(true)
		{
			System.out.println("press 1: check balance"
					+ "press  2: withdraw"
					+"press 3: deposit"
					+"press 4: fixed deposit");
		int n=ip.nextInt();
		switch(n)
		{
		case 1:
			{a1.bal(); break;}
		case 2:
			{a1.withdraw();break;}
		case 3:
			{a1.credit();break;}
		case 4:
			{a1.fix_deposite();break;}
		default:
			System.out.println("invalid entry");break;
		}
		}
		 
	}

}
