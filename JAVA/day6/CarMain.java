package day6;

import java.util.Scanner;

public class CarMain {
public static void main(String[] args) {
	Scanner ip=new Scanner(System.in);
	boolean flag=true;
	
	 while(flag)
	 {
		 System.out.println("Enter your car to show speed details");
		 System.out.println("1: maruti");
		 System.out.println("2: alto");
		 System.out.println("3: breeza");
		 System.out.println("4: exit");
		 int ch=ip.nextInt();
		 switch(ch)
		 {
		 case 1:
			 Maruti m=new Maruti();
			 m.speed();
			 break;
		 case 2:
			 Alto a=new Alto();
			 a.speed();
			 break;
		 case 3:
			 Breeza b=new Breeza();
			 b.speed();
			 break;
			 default:
				 flag=false;
				 
		 
		 }
		 
	 }
	
}
}

