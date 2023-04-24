package day4;

import java.util.Scanner;

public class VehicleMain {
public static void main(String[] args) {
	
	Scanner ip=new Scanner(System.in);
	
	boolean flag=true;
	while(flag)
	{
		System.out.println("enter your choice");
	System.out.println("1: van");
	System.out.println("2: truck");
	System.out.println("3: car");
	System.out.println("4: bike");
	
	int ch=ip.nextInt();
	switch(ch) {
	
	case 1:
		Van v=new Van(3, 2000, 15);
		break;
	case 2:
		Truck t=new Truck(2,4000,25);
		break;
	case 3:
		Car c=new Car(4, 5);
		break;
	case 4:
		Bike b=new Bike(2,150);
		break;
		default:
			flag=false;
	}
	}
}
}
