package day4;

public class SalariedEmployee1 extends Employee1{
	double salary;
	double annual_net_salary;
	double annual__gross_salary;
	private double basic_salary;
	double HRA;
	double allowance=5000;
	
SalariedEmployee1(int empid, String empfname, String emplname, double salary) {
		super(empid, empfname, emplname);
		this.salary=salary;
}



public void calculation() {
	basic_salary = salary*0.5;
	HRA=(basic_salary+allowance)*0.5;
	annual__gross_salary=basic_salary+HRA+allowance;
	annual_net_salary=annual__gross_salary-(basic_salary*0.12);
}
public void grosssalary() {
	 calculation();
     System.out.println("The gross salary for employee is ="+annual__gross_salary);
}
public void netsalary() {
	 calculation();
	 System.out.println("The net salary for employee is ="+annual_net_salary);
	
}


}
