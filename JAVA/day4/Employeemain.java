package day4;

import java.util.Scanner;

public class Employeemain {
static Scanner sc= new Scanner (System.in);
	public static void main(String[] args) {
		
		System.out.println("Select the Category"+'\n'+"1.Salaried Employee"+'\n'+"2.Hourly Eployee"+'\n'+"3.Exit");
		int ch=sc.nextInt();
		switch(ch) {
		case 1:
			System.out.println("Enter the Details"+'\n'+"Employee_ID, Employee_FirstName, Last_Name, Salary");
			SalariedEmployee1 SE= new SalariedEmployee1(sc.nextInt(),sc.next(),sc.next(),sc.nextInt());
			System.out.println(SE);
			SE.grosssalary();
			SE.netsalary();
			break;
		case 2:
			System.out.println("Enter the Details"+'\n'+"Employee_ID, Employee FirstName, Last_Name, No_of_WorkingHour, Payment_Per_Hour, No_Of_Overtime_hour");
			HourlyEmployee1 HE= new HourlyEmployee1(sc.nextInt(),sc.next(),sc.next(), sc.nextFloat(), sc.nextDouble(),sc.nextFloat());
			System.out.println(HE);
			HE.grosssalary();
			HE.netsalary();
			break;	
		case 3:
			System.out.println("Thank you!!!");
			break;
			
		default:
			System.out.println("Invalid Entry");
		
	}
	}
}
