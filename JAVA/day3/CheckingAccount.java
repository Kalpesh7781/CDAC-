package day3;

public class CheckingAccount extends BankAccount{
	float fee=500;
	
	CheckingAccount()
	{
		System.out.println("account opening fee is : 500");
		super.accountbalance=super.accountbalance-fee;
		System.out.println("account opened");
		 
	}

}
