package day6;
import java.util.*;
public class CreditMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip=new Scanner(System.in);
		System.out.println("enter your payment method");
		System.out.println("rupees"+" dollars"+" pounds");
		String ch=ip.next();
		if (ch.equals("rupees"))
		{
			Rupees r=new Rupees();
			r.payment();
		}
		else if(ch.equals("pounds"))
		{
			Pounds p=new Pounds();
			p.payment();
		}
		else if (ch.equals("dollars"))
		{
			Dollars d=new Dollars();
			d.payment();
		}
	}

}
