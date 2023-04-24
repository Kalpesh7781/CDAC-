package day1;
import java.util.*;

public class ElectBill {

	int number;
	String name;
	int units;
	
	public void readData()
	{
		System.out.println("enter cust num, name, units ");
		Scanner ip = new Scanner(System.in);
		 number=ip.nextInt();
		 name=ip.next();
		 units=ip.nextInt();
		
	}
	
	
	public void showdata()
	{
		System.out.println("Details are: ");
		System.out.println(number);
		System.out.println(name);
		System.out.println(units+" units consumed ");
	}
	
	public void computeBill()
	{
		double bill;
		if(units<100)
		{
			bill=units*1.20;
			System.out.println("bill ammount in rs : "+bill);
		}
		else if(units<300)
		{
			int k=units-100;
			bill=(100*1.20)+(k*2);
			System.out.println("bill ammount in rs : "+bill);
		}
		else if(units<600)
		{
			int k=units-300;
			bill=(100*1.20)+(200*2)+(k*3);
			System.out.println("bill ammount in rs : "+bill);
		}
		else if(units>600)
		{
			int k=units-600;
			bill=(100*1.20)+(200*2)+(300*3)+(k*5);
				System.out.println("bill ammount in rs : "+bill);
		}
		
	}
	
	public static void main(String[] args) {
	 ElectBill c1= new ElectBill();
	 c1.readData();
	 c1.showdata();
	 c1.computeBill();
	 
	 ElectBill c2=new ElectBill();
	 c2.readData();
	 c2.showdata();
	 c2.computeBill();
	}

}
